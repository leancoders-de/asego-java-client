package de.leancoders.asego.common.request.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.leancoders.asego.common.model.audiogram.EEarType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

@NoArgsConstructor
@Data
public abstract class AudiogramBaseUpdateRequest {
   
    @Nullable
    @JsonProperty("ParentUid")
    private UUID parentId;

    @Nullable
    @JsonProperty("Beschreibung")
    private String description;

    @NonNull
    @JsonProperty("Manuell")
    private Boolean manual;

    @NonNull
    @JsonProperty("Ohr")
    private EEarType ear;

    @NonNull
    @JsonProperty("Datum")
    private Date date;

    @NonNull
    @JsonProperty("Messungen")
    private List<AudiogramMeasureItem> measurements;

}