package de.leancoders.asego.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class CreatedElementResponse {

    @JsonProperty("createdUid")
    private String createdUid;

    @JsonProperty("errorMessage")
    private String errorMessage;

}