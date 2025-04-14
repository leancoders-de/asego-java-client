package de.leancoders.asego.common.request.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.leancoders.asego.common.model.audiogram.EMessureItemType;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
@Data
public class AudiogramMeasureItem {

    @JsonProperty("Wert")
    private Integer value;

    @JsonProperty("Ergebnis")
    private Integer result;

    @JsonProperty("Typ")
    private EMessureItemType type;

}