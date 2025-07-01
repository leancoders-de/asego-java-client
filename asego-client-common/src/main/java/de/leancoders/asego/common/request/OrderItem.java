package de.leancoders.asego.common.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@Data
public class OrderItem<T> {

    @NonNull
    @JsonProperty("FieldName")
    private T fieldName;

    @NonNull
    @JsonProperty("Desc")
    private Boolean desc;
}
