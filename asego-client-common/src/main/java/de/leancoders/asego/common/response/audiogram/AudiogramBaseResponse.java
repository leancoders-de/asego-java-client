package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public abstract class AudiogramBaseResponse {
    @JsonProperty("KundeUid")
    private UUID customerUid;

    @JsonProperty("ParentUid")
    private UUID parentUid;

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
    private UUID uid;

    @JsonProperty("Datum")
    private Date date;
}