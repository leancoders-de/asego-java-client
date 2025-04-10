package de.leancoders.asego.client.services;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.audiogram.AudiogramBaseUpdateRequest;
import de.leancoders.asego.common.request.audiogram.AudiogramSearchFilter;
import de.leancoders.asego.common.request.audiogram.AudiogramSearchRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.audiogram.AudiogramSearchResponse;
import io.restassured.http.ContentType;
import lombok.NonNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.UUID;

import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__CUSTOMER_SPEECH_CREATE;
import static de.leancoders.asego.client.services.AsegoPaths.AUDIOGRAM__LIST;

public class AudiogramClientService extends BaseClientService {

    public AudiogramClientService(@Nonnull final AsegoConfig config,
                                  @NonNull final AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public CreatedElementResponse create(@NonNull final UUID customerUUID,
                                         @Nonnull final AudiogramBaseUpdateRequest updateRequest) {

        return request()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(updateRequest)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .post(AUDIOGRAM__CUSTOMER_SPEECH_CREATE, customerUUID)
            .as(CreatedElementResponse.class);
    }

    @Nonnull
    public AudiogramSearchResponse search(@Nullable final UUID searchToken,
                                          final int page,
                                          final int size,
                                          @Nonnull final AudiogramSearchFilter audiogramSearchFilter) {

        final AudiogramSearchRequest searchRequest = new AudiogramSearchRequest();
        final PageParameter list = new PageParameter();
        list.setSearchToken(searchToken);
        list.setPageIndex(page);
        list.setLimit(size);
        searchRequest.setList(list);
        searchRequest.setSearch(audiogramSearchFilter);

        return request()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(searchRequest)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .get(AUDIOGRAM__LIST)
            .as(AudiogramSearchResponse.class);
    }


}

