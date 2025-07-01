package de.leancoders.asego;

import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractTest {

    protected static final String USERNAME = "test";
    protected static final String PASSWORD = "XxyL8X1GT6";

    protected static final AsegoConfig ASEGO_CONFIG_LOCAL =
        de.leancoders.asego.client.model.internal.AsegoConfig.of(
            "https://localhost/",
            444
        );

    protected static final AsegoConfig ASEGO_CONFIG_DEV =
        de.leancoders.asego.client.model.internal.AsegoConfig.of(
            "https://asego.dev.leancoders.de/",
            444
        );

    protected AsegoClientService clientService;

    public abstract AsegoConfig asegoConfig();

    @BeforeEach
    public void setUp() {
        clientService = new AsegoClientService(asegoConfig());
        clientService.login(USERNAME, PASSWORD);
    }
}
