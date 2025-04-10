package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AudiogramMeasureItem {

    @JsonProperty("Wert")
    private Integer wert;

    @JsonProperty("Ergebnis")
    private Integer ergebnis;

    @JsonProperty("Typ")
    private String typ;

}