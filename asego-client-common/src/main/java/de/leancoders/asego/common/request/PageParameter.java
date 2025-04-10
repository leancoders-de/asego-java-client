package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class PageParameter {

    @JsonProperty("searchToken")
    private UUID searchToken;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("pageIndex")
    private Integer pageIndex;

}
