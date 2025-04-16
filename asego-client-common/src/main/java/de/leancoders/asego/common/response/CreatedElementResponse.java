package de.leancoders.asego.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreatedElementResponse {

    @JsonProperty("createdUid")
    private String createdUid;

    @JsonProperty("errorMessage")
    private String errorMessage;

}