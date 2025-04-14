package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class AudiogramListingItem {

    @JsonProperty("Datum")
    private Date datum;

    @JsonProperty("Beschreibung")
    private String beschreibung;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Tone")
    private Boolean tone;

    @JsonProperty("Speech")
    private Boolean speech;
}