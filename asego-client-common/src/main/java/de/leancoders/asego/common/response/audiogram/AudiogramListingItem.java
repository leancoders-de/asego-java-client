package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Nullable;

@NoArgsConstructor
@Data
public class AudiogramListingItem {

    @NonNull
    @JsonProperty("Datum")
    private Date date;

    @Nullable
    @JsonProperty("Beschreibung")
    private String description;

    @NonNull
    @JsonProperty("uid")
    private UUID uid;

    @NonNull
    @JsonProperty("Tone")
    private Boolean tone;

    @Nullable
    @JsonProperty("Speech")
    private Boolean speech;
}