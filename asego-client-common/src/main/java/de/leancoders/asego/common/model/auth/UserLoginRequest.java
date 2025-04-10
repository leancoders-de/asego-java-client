package de.leancoders.asego.common.model.auth;


import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
public class UserLoginRequest {

    @JsonProperty("username")
    private final String username;
    @JsonProperty("password")
    private final String password;

    @JsonProperty("grant_type")
    private final String grantType = "password";


    //return map<string>
    public Map<String, String> toMap() {
        return Map.of(
            "username", username,
            "password", password,
            "grant_type", grantType
        );

    }
}
