package de.leancoders.asego.client.services;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import javax.annotation.Nonnull;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public abstract class BaseClientService {

    protected final AsegoConfig config;
    protected final AsegoAuthContext asegoAuthContext;

    @Nonnull
    protected RequestSpecification request() {
        if (asegoAuthContext.isAuthenticated()) {
            return authorizedRequest();
        }
        else {
            return unauthorizedRequest();
        }
    }

    @Nonnull
    protected RequestSpecification authorizedRequest() {
        return RestAssured.given()
            .accept(ContentType.JSON)
            .header("Authorization", "Bearer " + asegoAuthContext.getToken());
    }

    @Nonnull
    protected RequestSpecification unauthorizedRequest() {
        return RestAssured.given()
            .accept(ContentType.JSON);
    }


    @Nonnull
    protected String encode(@NonNull final String text) {
        return URLEncoder.encode(text, StandardCharsets.UTF_8);
    }

}
