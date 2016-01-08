package io.swagger.codegen.languages;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.commons.lang.StringUtils;

import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenType;
import io.swagger.codegen.DefaultCodegen;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.FileProperty;
import io.swagger.models.properties.MapProperty;
import io.swagger.models.properties.Property;

public abstract class AbstractTypeScriptClientCodegen extends DefaultCodegen implements CodegenConfig {
	@Override
	public CodegenType getTag() {
		return CodegenType.CLIENT;
	}

	public AbstractTypeScriptClientCodegen() {
	    super();
		supportsInheritance = true;
		reservedWords = new HashSet<String>(Arrays.asList("abstract", "await", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "debugger", "default", "delete", "do", "double", "else", "enum", "export", "extends", "false", "final", "finally", "float", "for", "function", "goto", "if", "implements", "import", "in", "instanceof", "int", "interface", "let", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "super", "switch", "synchronized", "this", "throw", "transient", "true", "try", "typeof", "var", "void", "volatile", "while", "with", "yield"));

		languageSpecificPrimitives = new HashSet<String>(Arrays.asList(
				"String",
				"boolean",
				"Boolean",
				"Double",
				"Integer",
				"Long",
				"Float",
				"Object"));
		instantiationTypes.put("array", "Array");
		
	    typeMapping = new HashMap<String, String>();
	    typeMapping.put("Array", "Array");
	    typeMapping.put("array", "Array");
	    typeMapping.put("List", "Array");
	    typeMapping.put("boolean", "boolean");
	    typeMapping.put("string", "string");
	    typeMapping.put("int", "number");
	    typeMapping.put("float", "number");
	    typeMapping.put("number", "number");
	    typeMapping.put("long", "number");
	    typeMapping.put("short", "number");
	    typeMapping.put("char", "string");
	    typeMapping.put("double", "number");
	    typeMapping.put("object", "any");
	    typeMapping.put("integer", "number");
	    typeMapping.put("Map", "any");
	    typeMapping.put("DateTime", "Date");
	   
	}

	@Override
	public String escapeReservedWord(String name) {
		return "_" + name;
	}

	@Override
	public String apiFileFolder() {
		return outputFolder + "/" + apiPackage().replace('.', File.separatorChar);
	}

	@Override
	public String modelFileFolder() {
		return outputFolder + "/" + modelPackage().replace('.', File.separatorChar);
	}

	@Override
	public String toVarName(String name) {
		// replace - with _ e.g. created-at => created_at
		name = name.replaceAll("-", "_");

		// if it's all uppper case, do nothing
		if (name.matches("^[A-Z_]*$"))
			return name;

		// camelize the variable name
	        // pet_id => petId
		name = camelize(name, true);

		// for reserved word or word starting with number, append _
		if (reservedWords.contains(name) || name.matches("^\\d.*"))
			name = escapeReservedWord(name);

		return name;
	}

	@Override
	public String toParamName(String name) {
		// should be the same as variable name
		return toVarName(name);
	}

	@Override
	public String toModelName(String name) {
		// model name cannot use reserved keyword, e.g. return
		if (reservedWords.contains(name))
			throw new RuntimeException(name
					+ " (reserved word) cannot be used as a model name");

		// camelize the model name
		// phone_number => PhoneNumber
		return camelize(name);
	}

	@Override
	public String toModelFilename(String name) {
		// should be the same as the model name
		return toModelName(name);
	}

	@Override
	public String getTypeDeclaration(Property p) {
		if (p instanceof ArrayProperty) {
			ArrayProperty ap = (ArrayProperty) p;
			Property inner = ap.getItems();
			return getSwaggerType(p) + "<" + getTypeDeclaration(inner) + ">";
		} else if (p instanceof MapProperty) {
			MapProperty mp = (MapProperty) p;
			Property inner = mp.getAdditionalProperties();
			return "{ [key: string]: "+ getTypeDeclaration(inner) + "; }";
		} else if (p instanceof FileProperty) {
			return "any";
		}
		return super.getTypeDeclaration(p);
	}

	@Override
	public String getSwaggerType(Property p) {
		String swaggerType = super.getSwaggerType(p);
		String type = null;
		if (typeMapping.containsKey(swaggerType)) {
			type = typeMapping.get(swaggerType);
			if (languageSpecificPrimitives.contains(type))
				return type;
		} else
			type = swaggerType;
		return type;
	}

        @Override
        public String toOperationId(String operationId) {
            // throw exception if method name is empty
            if (StringUtils.isEmpty(operationId)) {
                throw new RuntimeException("Empty method name (operationId) not allowed");
            }
    
            // method name cannot use reserved keyword, e.g. return
            // append _ at the beginning, e.g. _return
            if (reservedWords.contains(operationId)) {
                return escapeReservedWord(camelize(sanitizeName(operationId), true));
            }
    
            return camelize(sanitizeName(operationId), true);
        }
}
