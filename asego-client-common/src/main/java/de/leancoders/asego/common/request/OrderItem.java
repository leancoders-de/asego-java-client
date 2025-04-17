package de.leancoders.asego.common.request;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
@Data
public class OrderItem {

    @Nullable
    @JsonProperty("FieldName")
    private String fieldName;

    @NonNull
    @JsonProperty("Desc")
    private Boolean desc;
}
