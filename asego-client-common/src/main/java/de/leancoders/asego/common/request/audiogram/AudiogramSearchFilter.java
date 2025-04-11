package de.leancoders.asego.common.request.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
@Data
public class AudiogramSearchFilter {

    @JsonProperty("KundenUid")
    @Nonnull
    private UUID kundenUid;

    @JsonProperty("Ton")
    @Nullable
    private Boolean ton;

    @JsonProperty("Sprache")
    @Nullable
    private Boolean sprache;

    @JsonProperty("Datum")
    @Nullable
    private OffsetDateTime datum;

    @JsonProperty("Beschreibung")
    @Nullable
    private String beschreibung;

    @JsonProperty("uid")
    @Nullable
    private UUID uid;

    @JsonProperty("Tone")
    @Nullable
    private Boolean tone;

    @JsonProperty("Speech")
    @Nullable
    private Boolean speech;

}