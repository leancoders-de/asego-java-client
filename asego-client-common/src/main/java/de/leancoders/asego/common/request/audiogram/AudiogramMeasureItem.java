package de.leancoders.asego.common.request.audiogram;


import com.fasterxml.jackson.annotation.JsonProperty;

import de.leancoders.asego.common.model.audiogram.EMessureItemType;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Data
public class AudiogramMeasureItem {

    @NonNull
    @JsonProperty("Wert")
    private Integer value;

    @NonNull
    @JsonProperty("Ergebnis")
    private Integer result;

    @NonNull
    @JsonProperty("Typ")
    private EMessureItemType type;

}