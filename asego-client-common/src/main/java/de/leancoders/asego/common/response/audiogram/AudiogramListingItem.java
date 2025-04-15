package de.leancoders.asego.common.response.audiogram;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

import javax.annotation.Nullable;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(staticName = "of")
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
    private String uid;

    @NonNull
    @JsonProperty("Tone")
    private Boolean tone;

    @Nullable
    @JsonProperty("Speech")
    private Boolean speech;
}