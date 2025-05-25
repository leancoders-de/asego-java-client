package de.leancoders.asego.client.services;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.insurance.InsuranceOrderItem;
import de.leancoders.asego.common.request.insurance.InsuranceSearchFilter;
import de.leancoders.asego.common.request.insurance.InsuranceSearchRequest;
import de.leancoders.asego.common.response.insurance.InsuranceResponse;
import de.leancoders.asego.common.response.insurance.InsuranceSearchResponse;
import io.restassured.http.ContentType;

public class InsuranceClientService extends BaseClientService {

    public InsuranceClientService(AsegoConfig config, AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public InsuranceSearchResponse search(@Nullable final UUID searchToken, final int page, final int size,
            @Nonnull final InsuranceSearchFilter insuranceSearchFilter) {
        
        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(null, pageParameter, insuranceSearchFilter);
    }

    @Nonnull
    public InsuranceSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final List<InsuranceOrderItem> orderBy,
            @Nonnull final InsuranceSearchFilter insuranceSearchFilter) {

        if (orderBy != null && orderBy.isEmpty()) {
            throw new IllegalArgumentException("orderBy must not be empty if provided");
        }

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(orderBy, pageParameter, insuranceSearchFilter);
    }

    @Nonnull
    private InsuranceSearchResponse search(
            @Nullable List<InsuranceOrderItem> orderBy,
            @Nonnull PageParameter pageParameter,
            @Nonnull final InsuranceSearchFilter insuranceSearchFilter) {

        InsuranceSearchRequest insuranceSearchRequest = InsuranceSearchRequest.of(orderBy, pageParameter, insuranceSearchFilter);
        
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(insuranceSearchRequest)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(AsegoPaths.INSURANCE__LIST)
                .as(InsuranceSearchResponse.class);
    }

    @Nonnull
    public InsuranceResponse getById(@Nonnull final UUID uuid) {
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(AsegoPaths.INSURANCE__GET_BY_ID, uuid)
                .as(InsuranceResponse.class);
    }
}
