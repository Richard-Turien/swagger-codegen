package io.swagger.client.auth;

import java.util.Map;

public class OAuth implements Authentication {
  @Override
  public void applyToParams(Map<String, Object> queryParams, Map<String, Object> headerParams) {
    // TODO: support oauth
  }
}
