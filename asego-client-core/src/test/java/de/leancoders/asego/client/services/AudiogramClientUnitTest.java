package de.leancoders.asego.client.services;

import de.leancoders.asego.AbstractTest;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.model.audiogram.EAudiogramField;
import de.leancoders.asego.common.model.audiogram.EAudiogramType;
import de.leancoders.asego.common.model.audiogram.EEarType;
import de.leancoders.asego.common.model.audiogram.EMessureItemType;
import de.leancoders.asego.common.request.audiogram.AudiogramMeasureItem;
import de.leancoders.asego.common.request.audiogram.AudiogramOrderItem;
import de.leancoders.asego.common.request.audiogram.AudiogramSearchFilter;
import de.leancoders.asego.common.request.audiogram.AudiogramSpeechUpdateRequest;
import de.leancoders.asego.common.request.audiogram.AudiogramToneUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.audiogram.AudiogramListingItem;
import de.leancoders.asego.common.response.audiogram.AudiogramSearchResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Log4j2
public class AudiogramClientUnitTest extends AbstractTest {

    private static final UUID UID = UUID.fromString("53290761-F5D4-4990-AAB2-0CDEAEF30325");
    private static final UUID TONE_UUID = UUID.fromString("41eb7db8-bb74-4306-b858-06ae043e1ec5");
    private static final UUID SPEECH_UUID = UUID.fromString("98d6ea73-cf56-4565-b17e-a6f27f44c39d");

    @Override
    public AsegoConfig asegoConfig() {
        return ASEGO_CONFIG_LOCAL;
    }

    @Test
    public void test_audiogram_search(){
        AudiogramSearchFilter audiogramSearchFilter = AudiogramSearchFilter.of(UID);
        final AudiogramSearchResponse audiograms = clientService
            .audiograms()
            .search(null, 0, 10, audiogramSearchFilter);
        System.out.println("audiograms = " + audiograms);
    }

    @Test
    public void test_audiogram_search_with_ordering() {

        AudiogramSearchFilter audiogramSearchFilter = AudiogramSearchFilter.of(UID);
        

        List<AudiogramOrderItem> orderItems = List.of(
            AudiogramOrderItem.of(EAudiogramField.SPEECH, false)
        );
        

        final AudiogramSearchResponse audiograms = clientService
            .audiograms()
            .search(null, 0, 10, orderItems, audiogramSearchFilter);
            

        System.out.println("Ordered audiograms = " + audiograms);
        

    }

    @DisplayName("Audiogram: create Audiogram Speech")
    @Test
    public void test_audiogram_createSpeech() {

        final List<AudiogramMeasureItem> audiogramMeasureItems = List.of(
            AudiogramMeasureItem.of(0, 0, EMessureItemType.NONE),
            AudiogramMeasureItem.of(90, 40, EMessureItemType.NONE));       

        final AudiogramSpeechUpdateRequest audiogramSpeechUpdateRequest = AudiogramSpeechUpdateRequest.of(
            EAudiogramType.DV_LL, true, EEarType.BOTH  , Date.from(Instant.now()), audiogramMeasureItems);

        final CreatedElementResponse audiogram = clientService.audiograms().createSpeech(UID, audiogramSpeechUpdateRequest);
        System.out.println("audiogram = " + audiogram);
    }

    @Test
    public void test_audiogramm_createTone(){
        final List<AudiogramMeasureItem> audiogramMeasureItems = List.of(
            AudiogramMeasureItem.of(0, 0, EMessureItemType.NONE),
            AudiogramMeasureItem.of(250, 90, EMessureItemType.NONE));       

        final AudiogramToneUpdateRequest audiogramToneUpdateRequest = AudiogramToneUpdateRequest.of(
            EAudiogramType.DV_LL, true, EEarType.LEFT  , Date.from(Instant.now()), audiogramMeasureItems);

        final CreatedElementResponse audiogram = clientService.audiograms().createTone(UID, audiogramToneUpdateRequest);
    
        System.out.println("audiogram = " + audiogram);
    }
    
    @Test
    public void test_audiogramm_getToneById(){
        final List<AudiogramListingItem> audiogram = clientService.audiograms().getToneById(TONE_UUID);
        System.out.println("audiogram = " + audiogram);
    }

    @Test
    public void test_audiogramm_getSpeechById(){
        final List<AudiogramListingItem> audiogram = clientService.audiograms().getSpeechById(SPEECH_UUID);
        System.out.println("audiogram = " + audiogram);
    }


    // FAILS with 500 error code because of a InvalidCastException seems to be a problem with server
    @Test
    public void test_audiogramm_getByCustomer(){
        final List<AudiogramListingItem> audiogram = clientService.audiograms().getByCustomer(UID);
        System.out.println("audiogram = " + audiogram);
    }
        
        
}
