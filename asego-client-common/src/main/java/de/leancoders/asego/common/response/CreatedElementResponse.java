package de.leancoders.asego.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class CreatedElementResponse {

    @JsonProperty("createdUid")
    private UUID createdUid;

    @JsonProperty("errorMessage")
    private String errorMessage;

}