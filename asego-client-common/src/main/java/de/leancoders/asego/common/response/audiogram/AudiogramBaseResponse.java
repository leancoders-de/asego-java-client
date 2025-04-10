package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
public abstract class AudiogramBaseResponse {
    @JsonProperty("KundeUid")
    private String kundeUid;

    @JsonProperty("ParentUid")
    private String parentUid;

    @JsonProperty("Beschreibung")
    private String beschreibung;

    @JsonProperty("Typ")
    private String typ;

    @JsonProperty("Manuell")
    private Boolean manuell;

    @JsonProperty("Ohr")
    private String ohr;

    @JsonProperty("Messungen")
    private List<AudiogramMeasureItem> messungen;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Datum")
    private OffsetDateTime datum;
}