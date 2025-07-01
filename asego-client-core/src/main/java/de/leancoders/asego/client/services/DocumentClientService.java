package de.leancoders.asego.client.services;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.document.DocumentOrderItem;
import de.leancoders.asego.common.request.document.DocumentSearchFilter;
import de.leancoders.asego.common.request.document.DocumentSearchRequest;
import de.leancoders.asego.common.request.document.DocumentUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.document.DocumentResponse;
import de.leancoders.asego.common.response.document.DocumentSearchResponse;
import io.restassured.http.ContentType;
import lombok.NonNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

import static de.leancoders.asego.client.services.AsegoPaths.CUSTOMERS__DOCUMENTS_CREATE;
import static de.leancoders.asego.client.services.AsegoPaths.CUSTOMERS__DOCUMENTS_GET_BY_ID;
import static de.leancoders.asego.client.services.AsegoPaths.CUSTOMERS__DOCUMENTS_SEARCH;

public class DocumentClientService extends BaseClientService {

    public DocumentClientService(@Nonnull final AsegoConfig config,
                                @NonNull final AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public CreatedElementResponse create(@Nonnull final UUID kundenUid, @Nonnull final DocumentUpdateRequest updateRequest) {
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(updateRequest)
                .log().all()
                .expect().statusCode(201)
                .log().all()
                .when()
                .post(CUSTOMERS__DOCUMENTS_CREATE, kundenUid)
                .as(CreatedElementResponse.class);
    }

    @Nonnull
    public String update(@Nonnull final UUID customerUid, @Nonnull final UUID documentUid,
                         @Nonnull final DocumentUpdateRequest updateRequest) {
        return request()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(updateRequest)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .patch(CUSTOMERS__DOCUMENTS_GET_BY_ID, customerUid, documentUid)
            .asString();
    }

    @Nonnull
    public DocumentResponse getById(@Nonnull final UUID customerUid, @Nonnull final UUID documentUid) {
        return request()
            .accept(ContentType.JSON)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .get(CUSTOMERS__DOCUMENTS_GET_BY_ID, customerUid, documentUid)
            .as(DocumentResponse.class);
    }

    @Nonnull
    public DocumentSearchResponse search(@Nonnull final UUID kundenUid,
                                        @Nullable final UUID searchToken,
                                        final int page,
                                        final int size,
                                        @Nonnull final DocumentSearchFilter searchFilter) {
        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(kundenUid, null, pageParameter, searchFilter);
    }

    @Nonnull
    public DocumentSearchResponse search(@Nonnull final UUID kundenUid,
                                        @Nullable final UUID searchToken,
                                        final int page,
                                        final int size,
                                        @Nonnull final List<DocumentOrderItem> orderBy,
                                        @Nonnull final DocumentSearchFilter searchFilter) {
        if (orderBy != null && orderBy.isEmpty()) {
            throw new IllegalArgumentException("orderBy must not be empty if provided");
        }

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(kundenUid, orderBy, pageParameter, searchFilter);
    }

    @Nonnull
    private DocumentSearchResponse search(@Nonnull final UUID kundenUid,
                                         @Nullable List<DocumentOrderItem> orderBy,
                                         @Nonnull PageParameter pageParameter,
                                         @Nonnull final DocumentSearchFilter searchFilter) {

        final DocumentSearchRequest requestObj = DocumentSearchRequest.of(orderBy, pageParameter, searchFilter);

        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestObj)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(CUSTOMERS__DOCUMENTS_SEARCH, kundenUid)
                .as(DocumentSearchResponse.class);
    }
}