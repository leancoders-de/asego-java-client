package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public abstract class SearchRequest<T> {

    @JsonProperty("OrderBy")
    private List<OrderItem> orderBy;

    @JsonProperty("List")
    private PageParameter list;

    @JsonProperty("Search")
    private T search;

}
