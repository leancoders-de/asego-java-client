package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderItem {

    @JsonProperty("FieldName")
    private String fieldName;

    @JsonProperty("Desc")
    private Boolean desc;
}
