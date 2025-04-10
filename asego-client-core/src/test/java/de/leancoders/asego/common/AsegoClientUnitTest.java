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

    public static final AsegoConfig ASEGO_CONFIG_DEFAULT =
        AsegoConfig.of(
            "https://asego.mr-hear.leancoders.de/",
            4444
        );
    private static final ObjectMapper OBJECT_MAPPER = ObjectMapperFactory.createDefaultObjectMapper();

    @Test
    public void test_login() {
        final AsegoClientService clientService =
            new AsegoClientService(
                ASEGO_CONFIG_DEFAULT
            );
        clientService.login("ralf", "admin12345");
    }

    @Test
    public void test_customers() {
        final AsegoClientService clientService = new AsegoClientService(
            ASEGO_CONFIG_DEFAULT
        );
        clientService.login("admin", "admin123");

        final CustomerSearchResponse customers =
            clientService
                .customers()
                .searchByEmail(null, 0, 10, "email@email.com");


        System.out.println("customers = " + customers);
    }

}
