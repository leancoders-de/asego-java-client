package de.leancoders.asego.client.services;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.audiogram.AudiogramBaseUpdateRequest;
import de.leancoders.asego.common.request.audiogram.AudiogramOrderItem;
import de.leancoders.asego.common.request.audiogram.AudiogramSearchFilter;
import de.leancoders.asego.common.request.audiogram.AudiogramSearchRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.audiogram.AudiogramListResponse;
import de.leancoders.asego.common.response.audiogram.AudiogramSearchResponse;
import de.leancoders.asego.common.response.audiogram.AudiogramSpeechResponse;
import de.leancoders.asego.common.response.audiogram.AudiogramToneResponse;
import io.restassured.http.ContentType;
import lombok.NonNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__CUSTOMER_SPEECH_CREATE;
import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__CUSTOMER_TONE_CREATE;
import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__GET_BY_CUSTOMER_ID;
import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__LIST;
import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__SPEECH_GET_BY_ID;
import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__TONE_GET_BY_ID;

public class AudiogramClientService extends BaseClientService {

    public AudiogramClientService(@Nonnull final AsegoConfig config,
            @NonNull final AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public CreatedElementResponse createSpeech(@NonNull final UUID customerUUID,
            @Nonnull final AudiogramBaseUpdateRequest updateRequest) {

        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(updateRequest)
                .log().all()
                .expect().statusCode(201)
                .log().all()
                .when()
                .post(AUDIOGRAM__CUSTOMER_SPEECH_CREATE, customerUUID)
                .as(CreatedElementResponse.class);
    }

    @Nonnull
    public CreatedElementResponse createTone(@NonNull final UUID customerUUID,
            @Nonnull final AudiogramBaseUpdateRequest updateRequest) {

        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(updateRequest)
                .log().all()
                .expect().statusCode(201)
                .log().all()
                .when()
                .post(AUDIOGRAM__CUSTOMER_TONE_CREATE, customerUUID)
                .as(CreatedElementResponse.class);
    }

    @Nonnull
    public AudiogramSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final AudiogramSearchFilter audiogramSearchFilter) {

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(null, pageParameter, audiogramSearchFilter);
    }

    @Nonnull
    public AudiogramSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final List<AudiogramOrderItem> orderBy,
            @Nonnull final AudiogramSearchFilter audiogramSearchFilter) {

        if (orderBy != null && orderBy.isEmpty()) {
            throw new IllegalArgumentException("orderBy must not be empty if provided");
        }

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(orderBy, pageParameter, audiogramSearchFilter);
    }

    @Nonnull
    private AudiogramSearchResponse search(
            @Nullable List<AudiogramOrderItem> orderBy,
            @Nonnull PageParameter pageParameter,
            @Nonnull final AudiogramSearchFilter audiogramSearchFilter) {

        AudiogramSearchRequest searchRequest = AudiogramSearchRequest.of(orderBy, pageParameter, audiogramSearchFilter);
        
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(searchRequest)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(AUDIOGRAM__LIST)
                .as(AudiogramSearchResponse.class);
    }

    @NonNull
    public AudiogramListResponse getByCustomer(@NonNull final UUID customerUUID) {
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(AUDIOGRAM__GET_BY_CUSTOMER_ID, customerUUID)
            .as(AudiogramListResponse.class);
    }

    @NonNull
    public AudiogramSpeechResponse getSpeechById(@NonNull final UUID audiogramUuid) {
        return request()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .get(AUDIOGRAM__SPEECH_GET_BY_ID, audiogramUuid)
            .as(AudiogramSpeechResponse.class);
    }

    @NonNull
    public AudiogramToneResponse getToneById(@NonNull final UUID audiogramUuid) {
        return request()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .get(AUDIOGRAM__TONE_GET_BY_ID, audiogramUuid)
            .as(AudiogramToneResponse.class);
    }

}
