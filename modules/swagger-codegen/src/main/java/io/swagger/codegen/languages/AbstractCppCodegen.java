package io.swagger.codegen.languages;

import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenProperty;
import io.swagger.codegen.DefaultCodegen;
import io.swagger.models.properties.Property;

import java.util.Arrays;

abstract public class AbstractCppCodegen extends DefaultCodegen implements CodegenConfig {

    public AbstractCppCodegen() {
        super();

        /*
         * Reserved words.  Override this with reserved words specific to your language
         */
        setReservedWordsLowerCase(
                Arrays.asList(
                        "alignas",
                        "alignof",
                        "and",
                        "and_eq",
                        "asm",
                        "auto",
                        "bitand",
                        "bitor",
                        "bool",
                        "break",
                        "case",
                        "catch",
                        "char",
                        "char16_t",
                        "char32_t",
                        "class",
                        "compl",
                        "concept",
                        "const",
                        "constexpr",
                        "const_cast",
                        "continue",
                        "decltype",
                        "default",
                        "delete",
                        "do",
                        "double",
                        "dynamic_cast",
                        "else",
                        "enum",
                        "explicit",
                        "export",
                        "extern",
                        "false",
                        "float",
                        "for",
                        "friend",
                        "goto",
                        "if",
                        "inline",
                        "int",
                        "linux",                        
                        "long",
                        "mutable",
                        "namespace",
                        "new",
                        "noexcept",
                        "not",
                        "not_eq",
                        "nullptr",
                        "operator",
                        "or",
                        "or_eq",
                        "private",
                        "protected",
                        "public",
                        "register",
                        "reinterpret_cast",
                        "requires",
                        "return",
                        "short",
                        "signed",
                        "sizeof",
                        "static",
                        "static_assert",
                        "static_cast",
                        "struct",
                        "switch",
                        "template",
                        "this",
                        "thread_local",
                        "throw",
                        "true",
                        "try",
                        "typedef",
                        "typeid",
                        "typename",
                        "union",
                        "unsigned",
                        "using",
                        "virtual",
                        "void",
                        "volatile",
                        "wchar_t",
                        "while",
                        "xor",
                        "xor_eq")
        );
    }

    @Override
    public String toVarName(String name) {
        if (typeMapping.keySet().contains(name) || typeMapping.values().contains(name)
                || importMapping.values().contains(name) || defaultIncludes.contains(name)
                || languageSpecificPrimitives.contains(name)) {
            return sanitizeName(name);
        }

        if (isReservedWord(name)) {
            return escapeReservedWord(name);
        }

        if (name.length() > 1) {
            return sanitizeName(Character.toUpperCase(name.charAt(0)) + name.substring(1));
        }

        return sanitizeName(name);
    }

    @Override
    public String toApiFilename(String name) {
        return toApiName(name);
    }

    @Override
    public String toApiName(String type) {
        return toTypeName(type, "", "Api");
    }

    @Override
    public String toModelFilename(String name) {
        return toTypeName(name);
    }

    @Override
    public String toModelName(String type) {
        if (typeMapping.keySet().contains(type) || typeMapping.values().contains(type)
                || importMapping.values().contains(type) || defaultIncludes.contains(type)
                || languageSpecificPrimitives.contains(type)) {
            return type;
        } else {
            return toTypeName(type);
        }
    }

    /**
     * Escapes a reserved word as defined in the `reservedWords` array. Handle
     * escaping those terms here. This logic is only called if a variable
     * matches the reserved words
     *
     * @return the escaped term
     */
    @Override
    public String escapeReservedWord(String name) {
        if(this.reservedWordsMappings().containsKey(name)) {
            return this.reservedWordsMappings().get(name);
        }
        return sanitizeName("_" + name);
    }

    @Override
    public String toOperationId(String operationId) {
        if (isReservedWord(operationId)) {
            LOGGER.warn(operationId + " (reserved word) cannot be used as method name. Renamed to " + escapeReservedWord(operationId));
            return escapeReservedWord(operationId);
        }
        return sanitizeName(super.toOperationId(operationId));
    }

    @Override
    public String toParamName(String name) {
        return sanitizeName(super.toParamName(name));
    }

    @Override
    public CodegenProperty fromProperty(String name, Property p) {
        CodegenProperty property = super.fromProperty(name, p);
        String nameInCamelCase = property.nameInCamelCase;
        if (nameInCamelCase.length() > 1) {
            nameInCamelCase = sanitizeName(Character.toLowerCase(nameInCamelCase.charAt(0)) + nameInCamelCase.substring(1));
        } else {
            nameInCamelCase = sanitizeName(nameInCamelCase);
        }
        property.nameInCamelCase = nameInCamelCase;
        return property;
    }
    
    /**
     * Output the Getter name for boolean property, e.g. isActive
     *
     * @param name the name of the property
     * @return getter name based on naming convention
     */
    public String toBooleanGetter(String name) {
        return "is" + getterAndSetterCapitalize(name);
    }

    String toTypeName(String name) {
        return toTypeName(name, "", "");
    }

    String toTypeName(String name, String prefix, String suffix) {
        // Swagger name validation should already limit to [A-Za-z0-9._-]
        name = camelize(sanitizeName(name));
        name = prefix + name + suffix;

        if (name.matches("^\\d.*")) {
            LOGGER.warn(name + " (type name starts with number) cannot be used as type name. Renamed to Type" + name);
            name = "Type" + name;
        }
        return name;
    }
}
