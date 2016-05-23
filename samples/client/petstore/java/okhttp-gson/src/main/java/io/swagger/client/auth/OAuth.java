package io.swagger.client.auth;

import java.util.List;
import java.util.Map;

import io.swagger.client.Pair;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-28T16:09:59.809+08:00")
public class OAuth implements Authentication {
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        if (accessToken != null) {
            headerParams.put("Authorization", "Bearer " + accessToken);
        }
    }
}
