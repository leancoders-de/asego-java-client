package de.leancoders.asego.common;

import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import de.leancoders.asego.common.request.customer.CustomerUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.customer.CustomerResponse;
import de.leancoders.asego.common.response.customer.CustomerSearchResponse;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Log4j2
public class CustomerClientUnitTest {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";
    private static final String CUSTOMER_EMAIL = "test@test.de";
    private static final UUID UID = UUID.fromString("53290761-F5D4-4990-AAB2-0CDEAEF30325");

    public static final AsegoConfig ASEGO_CONFIG_DEFAULT = AsegoConfig.of(
            "https://localhost/",
            444);

    private AsegoClientService clientService;

    @BeforeEach
    public void setUp() {
        clientService = new AsegoClientService(ASEGO_CONFIG_DEFAULT);
        clientService.login(USERNAME, PASSWORD);
    }

    @Test
    public void test_customers_searchByMail() {
        final CustomerSearchResponse customers = clientService
                .customers()
                .searchByEmail(null, 0, 10, CUSTOMER_EMAIL);

        System.out.println("customers = " + customers);
    }

    @Test
    public void test_customers_getById() {
        final CustomerResponse customers = clientService
                .customers()
                .getById(UID);
        System.out.println("customers = " + customers);
    }

    @Test
    public void test_customers_update() {
        CustomerUpdateRequest customerUpdateRequest = CustomerUpdateRequest.of(
                "Test",
                "Test",
                Date.from(Instant.parse("1990-01-01T00:00:00Z")),
                CUSTOMER_EMAIL,
                "Strasse 1",
                "12345",
                "Teststadt");

        clientService
                .customers()
                .update(UID, customerUpdateRequest);
    }

    @Test
    public void test_customers_create() {
        CustomerUpdateRequest customerUpdateRequest = CustomerUpdateRequest.of(
                "Test",
                "Test",
                Date.from(Instant.parse("1990-01-01T00:00:00Z")),
                CUSTOMER_EMAIL,
                "Strasse 1",
                "12345",
                "Teststadt");

        final CreatedElementResponse customer = clientService
                .customers()
                .create(customerUpdateRequest);
        System.out.println("customer = " + customer);
    }
}
