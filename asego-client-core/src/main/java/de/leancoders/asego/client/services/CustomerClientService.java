package de.leancoders.asego.client.services;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.customer.CustomerSearchFilter;
import de.leancoders.asego.common.request.customer.CustomerSearchRequest;
import de.leancoders.asego.common.request.customer.CustomerUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.customer.CustomerResponse;
import de.leancoders.asego.common.response.customer.CustomerSearchResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.NonNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.UUID;

import static de.leancoders.asego.client.services.AsegoPaths.CUSTOMERS__CREATE;
import static de.leancoders.asego.client.services.AsegoPaths.CUSTOMERS__GET_BY_ID;
import static de.leancoders.asego.client.services.AsegoPaths.CUSTOMERS__LIST;
import static de.leancoders.asego.client.services.AsegoPaths.CUSTOMERS__UPDATE_BY_ID;

public class CustomerClientService extends BaseClientService {

    public CustomerClientService(@Nonnull final AsegoConfig config,
            @NonNull final AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public CreatedElementResponse create(@Nonnull final CustomerUpdateRequest updateRequest) {

        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(updateRequest)
                .log().all()
                .expect().statusCode(201)
                .log().all()
                .when()
                .post(CUSTOMERS__CREATE)
                .as(CreatedElementResponse.class);
    }

    public void update(@Nonnull final UUID uuid,
            @Nonnull final CustomerUpdateRequest updateRequest) {

        request()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(updateRequest)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .put(CUSTOMERS__UPDATE_BY_ID, uuid);

    }

    @Nonnull
    public CustomerResponse getById(@Nonnull final UUID uuid) {

        return request()
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(CUSTOMERS__GET_BY_ID, uuid)
                .as(CustomerResponse.class);
    }

    @Nonnull
    public CustomerSearchResponse searchByEmail(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final String email) {

        final CustomerSearchFilter searchFilter = CustomerSearchFilter.of();
        searchFilter.setEmail(email);

        return search(searchToken, page, size, searchFilter);
    }

    @Nonnull
    public CustomerSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final CustomerSearchFilter customerSearchFilter) {

        final PageParameter list = PageParameter.of();
        list.setSearchToken(searchToken);
        list.setLimit(size);
        list.setPageIndex(page);
        final CustomerSearchRequest customerSearchRequest = CustomerSearchRequest.of(null, list, customerSearchFilter);
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(customerSearchRequest)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(CUSTOMERS__LIST)
                .as(CustomerSearchResponse.class);
    }

}
