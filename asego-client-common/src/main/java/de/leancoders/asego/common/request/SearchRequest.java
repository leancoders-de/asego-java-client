package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

import javax.annotation.Nullable;



@NoArgsConstructor
@Data
public abstract class SearchRequest<T, S> {

    @Nullable
    @JsonProperty("OrderBy")
    private List<S> orderBy;

    @NonNull
    @JsonProperty("List")
    private PageParameter list;

    @Nullable
    @JsonProperty("Search")
    private T search;

}
