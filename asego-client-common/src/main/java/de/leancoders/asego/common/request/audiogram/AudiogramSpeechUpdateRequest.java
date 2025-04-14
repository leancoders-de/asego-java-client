package de.leancoders.asego.common.request.audiogram;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.leancoders.asego.common.model.audiogram.EAudiogramSpeechType;
import de.leancoders.asego.common.model.audiogram.EEarType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramSpeechUpdateRequest extends AudiogramBaseUpdateRequest {

    public AudiogramSpeechUpdateRequest() {
        super();
    }

    @NonNull
    @JsonProperty("Typ")
    private EAudiogramSpeechType type;
        

    public static AudiogramSpeechUpdateRequest of(EAudiogramSpeechType type, Boolean manual, EEarType ear, Date date) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        return request;
    }

    public static AudiogramSpeechUpdateRequest of(UUID parentId, String description, EAudiogramSpeechType type, Boolean manual, EEarType ear, Date date) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();
        request.setParentId(parentId);
        request.setDescription(description);
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        return request;
    }

     public static AudiogramSpeechUpdateRequest of( EAudiogramSpeechType type, Boolean manual, EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();

        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }

    public static AudiogramSpeechUpdateRequest of(UUID parentId,EAudiogramSpeechType type, Boolean manual, EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();
        request.setParentId(parentId);
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }

    public static AudiogramSpeechUpdateRequest of(String description, EAudiogramSpeechType type, Boolean manual, EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
        AudiogramSpeechUpdateRequest request = new AudiogramSpeechUpdateRequest();
        request.setDescription(description);
        request.setType(type);
        request.setManual(manual);
        request.setEar(ear);
        request.setDate(date);
        request.setMeasurements(measurements);
        return request;
    }

    public static AudiogramSpeechUpdateRequest of(UUID parentId, String description, EAudiogramSpeechType type, Boolean manual, EEarType ear, Date date, List<AudiogramMeasureItem> measurements) {
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