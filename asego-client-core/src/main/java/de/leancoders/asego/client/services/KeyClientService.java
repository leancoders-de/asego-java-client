package de.leancoders.asego.client.services;


import java.util.List;

import javax.annotation.Nonnull;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.response.keys.KeyListingItem;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;

public class KeyClientService  extends BaseClientService {

    public KeyClientService(AsegoConfig config, AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);
    }

    @Nonnull
    public List<KeyListingItem> getSalutationList() {
        return request()
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(AsegoPaths.KEYS__SALUTATION_LIST).as(new TypeRef<List<KeyListingItem>>() {
                });
    }

    @Nonnull
    public List<KeyListingItem> getTitleList() {
        return request()
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(AsegoPaths.KEYS__TITLE_LIST).as(new TypeRef<List<KeyListingItem>>() {
                });
    }

    @Nonnull
    public List<KeyListingItem> getCountryList() {
        return request()
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(AsegoPaths.KEYS__COUNTRY_LIST).as(new TypeRef<List<KeyListingItem>>() {
                });
    }
    
}
