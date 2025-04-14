package de.leancoders.asego.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.leancoders.asego.client.helper.jackson.ObjectMapperFactory;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import de.leancoders.asego.common.model.audiogram.EAudiogramType;
import de.leancoders.asego.common.model.audiogram.EEarType;
import de.leancoders.asego.common.model.audiogram.EMessureItemType;
import de.leancoders.asego.common.request.audiogram.AudiogramMeasureItem;
import de.leancoders.asego.common.request.audiogram.AudiogramSearchFilter;
import de.leancoders.asego.common.request.audiogram.AudiogramSpeechUpdateRequest;
import de.leancoders.asego.common.request.audiogram.AudiogramToneUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.audiogram.AudiogramSearchResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Log4j2
public class AudiogrammClientUnitTest {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";
    private static final UUID UID = UUID.fromString("53290761-F5D4-4990-AAB2-0CDEAEF30325");
    
    public static final AsegoConfig ASEGO_CONFIG_DEFAULT =
        AsegoConfig.of(
            "https://localhost/",
            444
        );
    private static final ObjectMapper OBJECT_MAPPER = ObjectMapperFactory.createDefaultObjectMapper();

    private AsegoClientService clientService;

    @BeforeEach
    public void setUp() {
        clientService = new AsegoClientService(ASEGO_CONFIG_DEFAULT);
        clientService.login(USERNAME, PASSWORD);
    }

    @Test
    public void test_audiogram_search(){
        AudiogramSearchFilter audiogramSearchFilter = AudiogramSearchFilter.of(
            UID);
        final AudiogramSearchResponse audiograms = clientService
            .audiograms()
            .search(null, 0, 10, audiogramSearchFilter);
        System.out.println("audiograms = " + audiograms);
    }

    @Test
    public void test_audriogramm_createSpech(){

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
        
}
