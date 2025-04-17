package de.leancoders.asego.common.request.audiogram;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import de.leancoders.asego.common.model.audiogram.EAudiogramType;
import de.leancoders.asego.common.model.audiogram.EEarType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.annotation.Nullable;
import lombok.NonNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramSpeechUpdateRequest extends AudiogramBaseUpdateRequest {

    public AudiogramSpeechUpdateRequest() {
        super();
    }

    
    public static AudiogramSpeechUpdateRequest of(
            @NonNull EAudiogramType type,
            @NonNull Boolean manual,
            @NonNull EEarType ear,
            @NonNull Date date,
            @NonNull List<AudiogramMeasureItem> measurements) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }

    
    public static AudiogramSpeechUpdateRequest of(
            @Nullable UUID parentId,
            @Nullable String description,
            @NonNull EAudiogramType type,
            @NonNull Boolean manual,
            @NonNull EEarType ear,
            @NonNull Date date,
            @NonNull List<AudiogramMeasureItem> measurements) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();
        request.setParentId(parentId);
        request.setDescription(description);
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }
}