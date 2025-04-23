package de.leancoders.asego.common.request.audiogram;

import java.util.Date;
import java.util.List;

import de.leancoders.asego.common.model.audiogram.EAudiogramType;
import de.leancoders.asego.common.model.audiogram.EEarType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.NonNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramToneUpdateRequest extends AudiogramBaseUpdateRequest {

    public AudiogramToneUpdateRequest() {
        super();
    }

    public static AudiogramToneUpdateRequest of(
            @NonNull EAudiogramType type,
            @NonNull Boolean manual,
            @NonNull EEarType ear,
            @NonNull Date date,
            @NonNull List<AudiogramMeasureItem> measurements) {
        AudiogramToneUpdateRequest request = new AudiogramToneUpdateRequest();
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }
}