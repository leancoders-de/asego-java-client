package de.leancoders.asego.common.model.auth;


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

}
