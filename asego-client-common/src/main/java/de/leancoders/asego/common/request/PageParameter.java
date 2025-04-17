package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

import javax.annotation.Nullable;

@AllArgsConstructor(staticName = "of")
@Data
public class PageParameter {

    @Nullable
    @JsonProperty("searchToken")
    private UUID searchToken;

    @Nullable
    @JsonProperty("limit")
    private Integer limit;

    @Nullable
    @JsonProperty("pageIndex")
    private Integer pageIndex;

}
