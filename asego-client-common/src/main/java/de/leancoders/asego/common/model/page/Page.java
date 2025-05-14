package de.leancoders.asego.common.model.page;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

import javax.annotation.Nullable;


@Data
public class Page {

    @NonNull
    @JsonProperty("currentPageIndex")
    private Integer currentPageIndex;

    @NonNull
    @JsonProperty("numberOfPages")
    private Integer numberOfPages;

    @Nullable
    @JsonProperty("searchToken")
    private UUID searchToken;

    @NonNull
    @JsonProperty("results")
    private Integer results;

}