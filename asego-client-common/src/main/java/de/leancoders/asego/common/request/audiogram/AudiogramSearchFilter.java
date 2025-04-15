package de.leancoders.asego.common.request.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Nullable;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
@Data
public class AudiogramSearchFilter {

    @JsonProperty("KundenUid")
    @NonNull
    private UUID customerUid;

    @JsonProperty("Ton")
    @Nullable
    private Boolean tone;

    @JsonProperty("Sprache")
    @Nullable
    private Boolean speech;

    @JsonProperty("Datum")
    @Nullable
    private Date date;

    @JsonProperty("Beschreibung")
    @Nullable
    private String description;

    @JsonProperty("uid")
    @Nullable
    private UUID uid;

    @JsonProperty("Tone")
    @Nullable
    private Boolean toneEn;

    @JsonProperty("Speech")
    @Nullable
    private Boolean speechEn;

}