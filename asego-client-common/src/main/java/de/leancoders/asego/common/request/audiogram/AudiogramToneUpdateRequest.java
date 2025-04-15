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
public class AudiogramToneUpdateRequest extends AudiogramBaseUpdateRequest {

    public AudiogramToneUpdateRequest() {
        super();
    }

    public static AudiogramToneUpdateRequest of(EAudiogramType type, Boolean manual, EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
        AudiogramToneUpdateRequest request = new AudiogramToneUpdateRequest();
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }

    public static AudiogramToneUpdateRequest of(UUID parentId, String description, EAudiogramType type, Boolean manual, 
                                                EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
        AudiogramToneUpdateRequest request = new AudiogramToneUpdateRequest();
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