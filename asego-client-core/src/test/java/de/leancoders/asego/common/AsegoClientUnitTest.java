package de.leancoders.asego.common;

import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import lombok.extern.log4j.Log4j2;


import org.junit.jupiter.api.Test;

/**
 *
 */
@Log4j2
public class AsegoClientUnitTest {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";
    
    public static final AsegoConfig ASEGO_CONFIG_DEFAULT =
        AsegoConfig.of(
            "https://localhost/",
            444
        );

    @Test
    public void test_login() {
        final AsegoClientService clientService =
            new AsegoClientService(
                ASEGO_CONFIG_DEFAULT
            );
        clientService.login(USERNAME, PASSWORD);
    }

}