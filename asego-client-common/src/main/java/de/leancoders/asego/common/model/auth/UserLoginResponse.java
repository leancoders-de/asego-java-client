package de.leancoders.asego.common.model.auth;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserLoginResponse {
    
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private String expiresIn;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty(".issued")
    private Date issued;
    @JsonProperty(".expires")
    private Date expires;

}
