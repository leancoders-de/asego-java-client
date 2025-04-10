package de.leancoders.asego.common.model.page;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class Page {

    @JsonProperty("currentPageIndex")
    private Integer currentPageIndex;

    @JsonProperty("numberOfPages")
    private Integer numberOfPages;

    @JsonProperty("searchToken")
    private UUID searchToken;

    @JsonProperty("results")
    private Integer results;

}