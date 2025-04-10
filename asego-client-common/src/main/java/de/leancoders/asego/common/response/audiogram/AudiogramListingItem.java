package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class AudiogramListingItem {

    @JsonProperty("Datum")
    private OffsetDateTime datum;

    @JsonProperty("Beschreibung")
    private String beschreibung;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Tone")
    private Boolean tone;

    @JsonProperty("Speech")
    private Boolean speech;
}