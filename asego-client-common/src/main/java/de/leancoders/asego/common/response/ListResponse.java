package de.leancoders.asego.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.leancoders.asego.common.model.page.Page;
import lombok.Data;

import java.util.List;

@Data
public class ListResponse<T> {

    @JsonProperty("page")
    private Page page;
    @JsonProperty("result")
    private List<T> items;
    @JsonProperty("errorMessage")
    private String errorMessage;

}
