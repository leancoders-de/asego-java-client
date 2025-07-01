package de.leancoders.asego.client.services;


import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.response.keys.KeyListResponse;
import io.restassured.http.ContentType;

import javax.annotation.Nonnull;

public class KeyClientService  extends BaseClientService {

    public KeyClientService(AsegoConfig config, AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public KeyListResponse getSalutationList() {
        return request()
            .accept(ContentType.JSON)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .get(AsegoPaths.KEYS__SALUTATION_LIST)
            .as(KeyListResponse.class);
    }

    @Nonnull
    public KeyListResponse getTitleList() {
        return request()
            .accept(ContentType.JSON)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .get(AsegoPaths.KEYS__TITLE_LIST)
            .as(KeyListResponse.class);
    }

    @Nonnull
    public KeyListResponse getCountryList() {
        return request()
            .accept(ContentType.JSON)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .get(AsegoPaths.KEYS__COUNTRY_LIST)
            .as(KeyListResponse.class);
    }
    
}
