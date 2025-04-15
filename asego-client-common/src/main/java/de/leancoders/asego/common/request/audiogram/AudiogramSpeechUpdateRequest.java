package de.leancoders.asego.common.request.audiogram;

import java.util.Date;
import java.util.List;
import java.util.UUID;


import de.leancoders.asego.common.model.audiogram.EAudiogramType;
import de.leancoders.asego.common.model.audiogram.EEarType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramSpeechUpdateRequest extends AudiogramBaseUpdateRequest {

    public AudiogramSpeechUpdateRequest() {
        super();
    }

    /**
     * Factory method with required parameters only
     */
    public static AudiogramSpeechUpdateRequest of(EAudiogramType type, Boolean manual, EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }

    /**
     * Factory method with all parameters
     */
    public static AudiogramSpeechUpdateRequest of(UUID parentId, String description, EAudiogramType type, Boolean manual, EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
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