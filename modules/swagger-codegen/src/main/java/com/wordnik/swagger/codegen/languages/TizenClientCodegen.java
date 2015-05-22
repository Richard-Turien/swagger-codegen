package com.wordnik.swagger.codegen.languages;

import com.wordnik.swagger.util.Json;
import com.wordnik.swagger.codegen.*;
import com.wordnik.swagger.models.properties.*;

import java.util.*;
import java.io.File;

public class TizenClientCodegen extends DefaultCodegen implements CodegenConfig {
  protected Set<String> foundationClasses = new HashSet<String>();
  protected String sourceFolder = "client";
  protected static String PREFIX = "Sami";
  protected Map<String, String> namespaces = new HashMap<String, String>();

  public CodegenType getTag() {
    return CodegenType.CLIENT;
  }
  
  public String getName() {
    return "tizen";
  }

  public String getHelp() {
    return "Generates a Samsung Tizen C++ client library.";
  }

  public TizenClientCodegen() {
    super();
    outputFolder = "generated-code/tizen";
    modelTemplateFiles.put("model-header.mustache", ".h");
    modelTemplateFiles.put("model-body.mustache", ".cpp");
    apiTemplateFiles.put("api-header.mustache", ".h");
    apiTemplateFiles.put("api-body.mustache", ".cpp");
    templateDir = "tizen";
    modelPackage = "";

    defaultIncludes = new HashSet<String>(
      Arrays.asList(
        "bool",
        "int",
        "long")
      );
    languageSpecificPrimitives = new HashSet<String>();

    additionalProperties().put("prefix", PREFIX);

    reservedWords = new HashSet<String>(
      // VERIFY
      Arrays.asList(
        "void", "char", "short", "int", "void", "char", "short", "int",
        "long", "float", "double", "signed", "unsigned", "id", "const",
        "volatile", "in", "out", "inout", "bycopy", "byref", "oneway",
        "self", "super"
      ));

    super.typeMapping = new HashMap<String, String>();

    typeMapping.put("Date", "DateTime");
    typeMapping.put("DateTime", "DateTime");
    typeMapping.put("string", "String");
    typeMapping.put("integer", "Integer");
    typeMapping.put("float", "Float");
    typeMapping.put("long", "Long");
    typeMapping.put("boolean", "Boolean");
    typeMapping.put("double", "Double");
    typeMapping.put("array", "IList");
    typeMapping.put("map", "HashMap");
    typeMapping.put("number", "Long");
    typeMapping.put("object", PREFIX + "Object");

    importMapping = new HashMap<String, String>();

    namespaces = new HashMap<String, String> ();
    namespaces.put("DateTime", "Tizen::Base::DateTime");
    namespaces.put("Integer", "Tizen::Base::Integer");
    namespaces.put("Long", "Tizen::Base::Long");
    namespaces.put("Boolean", "Tizen::Base::Boolean");
    namespaces.put("Float", "Tizen::Base::Float");
    namespaces.put("String", "Tizen::Base::String");
    namespaces.put("Double", "Tizen::Base::Double");
    namespaces.put("IList", "Tizen::Base::Collection::IList");
    namespaces.put("HashMap", "Tizen::Base::Collection::HashMap");
    namespaces.put("ArrayList", "Tizen::Base::Collection::ArrayList");
    namespaces.put("JsonNumber", "Tizen::Web::Json");
    namespaces.put("JsonString", "Tizen::Web::Json");

    foundationClasses = new HashSet<String> (
      Arrays.asList(
        "String",
        "Integer",
        "Float")
      );
    
    init();
  }

  protected void init() {
    supportingFiles.clear();
    supportingFiles.add(new SupportingFile("modelFactory.mustache", sourceFolder, PREFIX + "ModelFactory.h"));
    supportingFiles.add(new SupportingFile("helpers-header.mustache", sourceFolder, PREFIX + "Helpers.h"));
    supportingFiles.add(new SupportingFile("helpers-body.mustache", sourceFolder, PREFIX + "Helpers.cpp"));
    supportingFiles.add(new SupportingFile("apiclient-header.mustache", sourceFolder, PREFIX + "ApiClient.h"));
    supportingFiles.add(new SupportingFile("apiclient-body.mustache", sourceFolder, PREFIX + "ApiClient.cpp"));
    supportingFiles.add(new SupportingFile("object.mustache", sourceFolder, PREFIX + "Object.h"));
    supportingFiles.add(new SupportingFile("error-header.mustache", sourceFolder, PREFIX + "Error.h"));
    supportingFiles.add(new SupportingFile("error-body.mustache", sourceFolder, PREFIX + "Error.cpp"));	  
  }
  
  @Override
  public String toInstantiationType(Property p) {
    if (p instanceof MapProperty) {
      MapProperty ap = (MapProperty) p;
      String inner = getSwaggerType(ap.getAdditionalProperties());
      return instantiationTypes.get("map");
    }
    else if (p instanceof ArrayProperty) {
      ArrayProperty ap = (ArrayProperty) p;
      String inner = getSwaggerType(ap.getItems());
      return instantiationTypes.get("array");
    }
    else
      return null;
  }

  @Override
  public String getTypeDeclaration(String name) {
    if(languageSpecificPrimitives.contains(name) && !foundationClasses.contains(name))
      return name;
    else
      return name + "*";
  }

  @Override
  public String getSwaggerType(Property p) {
    String swaggerType = super.getSwaggerType(p);
    String type = null;
    if(typeMapping.containsKey(swaggerType)) {
      type = typeMapping.get(swaggerType);
      if(languageSpecificPrimitives.contains(type) && !foundationClasses.contains(type))
        return toModelName(type);
    }
    else
      type = swaggerType;
    return toModelName(type);
  }

  @Override
  public String getTypeDeclaration(Property p) {
    String swaggerType = getSwaggerType(p);
    if(languageSpecificPrimitives.contains(swaggerType) && !foundationClasses.contains(swaggerType))
      return toModelName(swaggerType);
    else
      return swaggerType + "*";
  }

  @Override
  public String toModelName(String type) {
    if(typeMapping.keySet().contains(type) ||
      typeMapping.values().contains(type) || 
      foundationClasses.contains(type) ||
      importMapping.values().contains(type) ||
      defaultIncludes.contains(type) ||
      languageSpecificPrimitives.contains(type)) {
      return type;
    }
    else {
      return PREFIX + Character.toUpperCase(type.charAt(0)) + type.substring(1);
    }
  }

  @Override
  public String toModelImport(String name) {
    if(namespaces.containsKey(name)) {
      return "using " + namespaces.get(name) + ";";
    }
    return "#include \"" + name + ".h\"";
  }

  @Override
  public String toDefaultValue(Property p) {
    if(p instanceof StringProperty)
      return "new String()";
    else if (p instanceof BooleanProperty)
      return "new Boolean(false)";
    else if(p instanceof DateProperty)
      return "new DateTime()";
    else if(p instanceof DateTimeProperty)
      return "new DateTime()";
    else if (p instanceof DoubleProperty)
      return "new Double()";
    else if (p instanceof FloatProperty)
      return "new Float()";
    else if (p instanceof IntegerProperty)
      return "new Integer()";
    else if (p instanceof LongProperty)
      return "new Long()";
    else if (p instanceof DecimalProperty)
      return "new Long()";
    else if (p instanceof MapProperty) {
      MapProperty ap = (MapProperty) p;
      String inner = getSwaggerType(ap.getAdditionalProperties());
      return "new HashMap()";
    }
    else if (p instanceof ArrayProperty) {
      ArrayProperty ap = (ArrayProperty) p;
      String inner = getSwaggerType(ap.getItems());
      return "new ArrayList()";
    }
    // else
    if(p instanceof RefProperty) {
      RefProperty rp = (RefProperty) p;
      return "new " + toModelName(rp.getSimpleRef()) + "()";
    }
    return "null";
  }

  @Override
  public String apiFileFolder() {
    return outputFolder + File.separator + sourceFolder;
  }

  @Override
  public String modelFileFolder() {
    return outputFolder + File.separator + sourceFolder;
  }

  @Override
  public String toModelFilename(String name) {
    return PREFIX + initialCaps(name);
  }

  @Override
  public String toApiName(String name) {
    return PREFIX + initialCaps(name) + "Api";
  }

  public String toApiFilename(String name) {
    return PREFIX + initialCaps(name) + "Api";
  }

  @Override
  public String toVarName(String name) {
    String paramName = name.replaceAll("[^a-zA-Z0-9_]","");
    paramName = Character.toUpperCase(paramName.charAt(0)) + paramName.substring(1);
    return "p" + paramName;
  }

  public String escapeReservedWord(String name) {
    return "_" + name;
  }

  public Set<String> getFoundationClasses() {
    return foundationClasses;
  }

  public void setFoundationClasses(Set<String> foundationClasses) {
    this.foundationClasses = foundationClasses;
  }

  public String getSourceFolder() {
    return sourceFolder;
  }

  public void setSourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
    init();
  }

  public static String getPREFIX() {
    return PREFIX;
  }

  public static void setPREFIX(String pREFIX) {
    PREFIX = pREFIX;
  }

  public Map<String, String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(Map<String, String> namespaces) {
    this.namespaces = namespaces;
  }

}
