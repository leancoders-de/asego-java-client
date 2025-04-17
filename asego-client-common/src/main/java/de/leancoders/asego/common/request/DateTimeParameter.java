package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.annotation.Nullable;
import java.util.Date;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
@Data
public class DateTimeParameter {

    @JsonProperty("Value")
    @NonNull
    private Date value;

    @JsonProperty("Value2")
    @Nullable
    private Date value2;

    @JsonProperty("Compare")
    @NonNull
    private String compare;

}
