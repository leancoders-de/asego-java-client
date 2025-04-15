package de.leancoders.asego.client.services;

import java.util.UUID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.insurance.InsuranceSearchFilter;
import de.leancoders.asego.common.response.insurance.Insurance;
import de.leancoders.asego.common.response.insurance.InsuranceSearchResponse;
import io.restassured.http.ContentType;

public class InsuranceClientService extends BaseClientService {

    public InsuranceClientService(AsegoConfig config, AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public InsuranceSearchResponse search(@Nullable final UUID searchToken, final int page, final int size,
            @Nonnull final InsuranceSearchFilter insuranceSearchFilter) {
                
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(insuranceSearchFilter)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(AsegoPaths.INSURANCE__LIST)
                .as(InsuranceSearchResponse.class);
    }

    @Nonnull
    public Insurance getById(@Nonnull final UUID uuid) {
        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(AsegoPaths.INSURANCE__GET_BY_ID, uuid)
                .as(Insurance.class);
    }

}
