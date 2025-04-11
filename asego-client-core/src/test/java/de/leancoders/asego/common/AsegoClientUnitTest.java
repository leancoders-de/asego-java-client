package de.leancoders.asego.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.leancoders.asego.client.helper.jackson.ObjectMapperFactory;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import de.leancoders.asego.common.request.customer.CustomerUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.customer.CustomerResponse;
import de.leancoders.asego.common.response.customer.CustomerSearchResponse;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.Test;

/**
 *
 */
@Log4j2
public class AsegoClientUnitTest {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";
    private static final String CUSTOMER_EMAIL = "test@test.de";
    private static final UUID UID = UUID.fromString("53290761-F5D4-4990-AAB2-0CDEAEF30325");
    
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
    public void test_customers_searchByMail() {
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

    @Test
    public void test_customers_getById() {
        final AsegoClientService clientService = new AsegoClientService(
            ASEGO_CONFIG_DEFAULT
        );
        clientService.login(USERNAME, PASSWORD);

        final CustomerResponse customers =
            clientService
                .customers()
                .getById(UID);
        System.out.println("customers = " + customers);
    }

    @Test
    public void test_customers_update() {
        final AsegoClientService clientService = new AsegoClientService(
            ASEGO_CONFIG_DEFAULT
        );
        clientService.login(USERNAME, PASSWORD);

        CustomerUpdateRequest customerUpdateRequest = CustomerUpdateRequest.of(
            "Test", 
            "Test", 
            Date.from(Instant.parse("1990-01-01T00:00:00Z")),
            CUSTOMER_EMAIL, 
            "Strasse 1", 
            "12345",
            "Teststadt");


        final Response response =
            clientService
                .customers()
                .update(UID, customerUpdateRequest);
        System.out.println("response = " + response.statusCode());
    }

    @Test
    public void test_customers_create() {
        final AsegoClientService clientService = new AsegoClientService(
            ASEGO_CONFIG_DEFAULT
        );
        clientService.login(USERNAME, PASSWORD);

        CustomerUpdateRequest customerUpdateRequest = CustomerUpdateRequest.of(
            "Test", 
            "Test", 
            Date.from(Instant.parse("1990-01-01T00:00:00Z")),
            CUSTOMER_EMAIL, 
            "Strasse 1", 
            "12345",
            "Teststadt");

        final CreatedElementResponse customer =
            clientService
                .customers()
                .create(customerUpdateRequest);
        System.out.println("customer = " + customer);
    }
}
