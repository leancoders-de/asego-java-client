package de.leancoders.asego.common.request.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class AudiogramSearchFilter {

    @JsonProperty("KundenUid")
    private String kundenUid;

    @JsonProperty("Ton")
    private Boolean ton;

    @JsonProperty("Sprache")
    private Boolean sprache;

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