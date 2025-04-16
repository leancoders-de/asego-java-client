package de.leancoders.asego.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Nullable;
import java.util.Date;

@Data
public class DateTimeParameter {

    @JsonProperty("Value")
    @Nullable
    private Date value;

    @JsonProperty("Value2")
    @Nullable
    private Date value2;

}
