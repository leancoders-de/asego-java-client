package de.leancoders.asego.client.services;

import de.leancoders.asego.client.helper.jackson.ObjectMapperFactory;
import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.model.auth.UserLoginRequest;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import lombok.NonNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class AsegoClientService {

    private final AsegoConfig config;
    private AsegoAuthContext asegoAuthContext;

    @Nonnull
    public AsegoClientService(@Nonnull final AsegoConfig config) {
        this.config = config;
        configureRestAssured();
    }

    //
    protected void configureRestAssured() {
        RestAssured.port = config.getPort();
        RestAssured.baseURI = config.getBaseUrl();
        RestAssured.config =
            RestAssuredConfig.config()
                .objectMapperConfig(
                    new ObjectMapperConfig().jackson2ObjectMapperFactory(
                        (type, s) -> ObjectMapperFactory.createDefaultObjectMapper()
                    ));
    }

    @Nonnull
    public AsegoClientService login(@NonNull final String username,
                                    @NonNull final String password) {
        obtainAccessToken(username, password, AsegoPaths.AUTH_BASE);
        return this;
    }


    @Nonnull
    public CustomerClientService customers() {
        return new CustomerClientService(config, asegoAuthContext);
    }


    @Nonnull
    protected String obtainAccessToken(@NonNull final String username,
                                       @NonNull final String password,
                                       @NonNull final String path) {

        final UserLoginRequest userLoginRequest =
            UserLoginRequest.of(
                username, password
            );

        final String token = RestAssured.given()
            .accept(ContentType.JSON)
            .contentType(ContentType.JSON)
            .body(userLoginRequest)
            .log().all()
            .expect().statusCode(200)
            .log().all()
            .when()
            .post(path)
            .as(String.class);

        this.asegoAuthContext = AsegoAuthContext.success(username, password, token);

        return token;
    }

    @Nullable
    public AsegoAuthContext mageAuthContext() {
        return asegoAuthContext;
    }
}
