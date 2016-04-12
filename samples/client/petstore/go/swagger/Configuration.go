package swagger

import (
    "encoding/base64"
)

type Configuration struct {
    UserName  string  `json:"userName,omitempty"`
    Password  string  `json:"password,omitempty"`
    ApiKey  string  `json:"apiKey,omitempty"`
    Debug  bool  `json:"debug,omitempty"`
    DebugFile  string  `json:"debugFile,omitempty"`
    OAuthToken  string  `json:"oAuthToken,omitempty"`
    Timeout  int  `json:"timeout,omitempty"`
    BasePath  string  `json:"basePath,omitempty"`
    Host  string  `json:"host,omitempty"`
    Scheme  string  `json:"scheme,omitempty"`
    AccessToken string `json:"accessToken,omitempty"`
    DefaultHeader map[string]string `json:"defaultHeader,omitempty"`
}

func NewConfiguration() *Configuration {
    defaultHeader := make(map[string]string)
    return &Configuration{
        BasePath: "http://petstore.swagger.io/v2",
        UserName: "",
        Debug: false,
        DefaultHeader: defaultHeader,
        }
}

func (c *Configuration) GetBasicAuthEncodedString() string {
    return base64.StdEncoding.EncodeToString([]byte(c.UserName  + ":" + c.Password))
}

func (c *Configuration) AddDefaultHeader(key string, value string) {
    c.DefaultHeader[key] = value
}