package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public abstract class AudiogramBaseResponse {
    @JsonProperty("KundeUid")
    private String customerUid;

    @JsonProperty("ParentUid")
    private String parentUid;

    @JsonProperty("Beschreibung")
    private String description;

    @JsonProperty("Typ")
    private String type;

    @JsonProperty("Manuell")
    private Boolean manual;

    @JsonProperty("Ohr")
    private String ear;

    @JsonProperty("Messungen")
    private List<AudiogramMeasureItem> measurements;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Datum")
    private OffsetDateTime date;
}