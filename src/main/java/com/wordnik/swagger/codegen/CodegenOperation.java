package com.wordnik.swagger.codegen;

import com.wordnik.swagger.models.*;
import com.wordnik.swagger.models.properties.*;

import java.util.*;

public class CodegenOperation {
  public Boolean hasParams, returnTypeIsPrimitive, returnSimpleType;
  public String path, operationId, returnType, httpMethod, returnBaseType, 
    returnContainer, summary, notes, baseName, defaultResponse;

  public List<Map<String, String>> consumes, produces;
  public List<CodegenParameter> allParams = new ArrayList<CodegenParameter>();
  public List<CodegenParameter> bodyParams = new ArrayList<CodegenParameter>();
  public List<CodegenParameter> pathParams = new ArrayList<CodegenParameter>();
  public List<CodegenParameter> queryParams = new ArrayList<CodegenParameter>();
  public List<CodegenParameter> headerParams = new ArrayList<CodegenParameter>();
  public List<CodegenParameter> formParams = new ArrayList<CodegenParameter>();
  public List<String> tags;
  public List<CodegenResponse> responses = new ArrayList<CodegenResponse>();

  public Set<String> imports = new HashSet<String>();
  public List<Map<String, String>> examples;

  // legacy support
  public String nickname;
}
