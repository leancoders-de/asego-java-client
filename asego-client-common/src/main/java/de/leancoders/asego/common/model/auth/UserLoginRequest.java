package de.leancoders.asego.common.model.auth;


import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Data
public class UserLoginRequest {

    @JsonProperty("username")
    @NonNull
    private final String username;
    @JsonProperty("password")
    @NonNull
    private final String password;

    @JsonProperty("grant_type")
    @NonNull
    private final String grantType = "password";


    
}
