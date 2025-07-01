package de.leancoders.asego.client.services;

import de.leancoders.asego.AbstractTest;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

/**
 *
 */
@Log4j2
public class AsegoClientUnitTest extends AbstractTest {

    @Override
    public AsegoConfig asegoConfig() {
        return ASEGO_CONFIG_LOCAL;
    }

    @Test
    public void test_login() {
        final AsegoClientService clientService =
            new AsegoClientService(
                ASEGO_CONFIG_LOCAL
            );
        clientService.login(USERNAME, PASSWORD);
    }

}