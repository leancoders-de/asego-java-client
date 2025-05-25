package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AudiogramMeasureItem {

    @JsonProperty("Wert")
    private Integer value;

    @JsonProperty("Ergebnis")
    private Integer result;

    @JsonProperty("Typ")
    private String type;

}