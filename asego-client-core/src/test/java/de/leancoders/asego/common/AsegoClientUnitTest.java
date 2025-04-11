package de.leancoders.asego.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.leancoders.asego.client.helper.jackson.ObjectMapperFactory;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import de.leancoders.asego.common.response.customer.CustomerSearchResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

/**
 *
 */
@Log4j2
public class AsegoClientUnitTest {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";
    private static final String CUSTOMER_EMAIL = "test@test.de";
    
    public static final AsegoConfig ASEGO_CONFIG_DEFAULT =
        AsegoConfig.of(
            "https://localhost/",
            444
        );
    private static final ObjectMapper OBJECT_MAPPER = ObjectMapperFactory.createDefaultObjectMapper();

    @Test
    public void test_login() {
        final AsegoClientService clientService =
            new AsegoClientService(
                ASEGO_CONFIG_DEFAULT
            );
        clientService.login(USERNAME, PASSWORD);
    }

    @Test
    public void test_customers() {
        final AsegoClientService clientService = new AsegoClientService(
            ASEGO_CONFIG_DEFAULT
        );
        clientService.login(USERNAME, PASSWORD);

        final CustomerSearchResponse customers =
            clientService
                .customers()
                .searchByEmail(null, 0, 10, CUSTOMER_EMAIL);

        System.out.println("customers = " + customers);
    }

}
