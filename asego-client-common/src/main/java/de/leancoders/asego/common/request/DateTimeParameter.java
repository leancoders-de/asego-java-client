package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Nullable;
import java.time.OffsetDateTime;

@Data
public class DateTimeParameter {

    @JsonProperty("Value")
    @Nullable
    private OffsetDateTime value;

    @JsonProperty("Value2")
    @Nullable
    private OffsetDateTime value2;

}
