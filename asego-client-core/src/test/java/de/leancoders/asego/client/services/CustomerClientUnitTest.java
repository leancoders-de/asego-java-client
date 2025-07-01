package de.leancoders.asego.client.services;

import de.leancoders.asego.AbstractTest;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.model.internal.CustomerUpdateContext;
import de.leancoders.asego.common.model.customer.ECustomerField;
import de.leancoders.asego.common.request.customer.CustomerOrderItem;
import de.leancoders.asego.common.request.customer.CustomerSearchFilter;
import de.leancoders.asego.common.request.customer.CustomerUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.customer.CustomerResponse;
import de.leancoders.asego.common.response.customer.CustomerSearchResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Log4j2
public class CustomerClientUnitTest extends AbstractTest {

    private static final String CUSTOMER_EMAIL = "test@test.de";
    private static final UUID UID = UUID.fromString("53290761-F5D4-4990-AAB2-0CDEAEF30325");

    @Override
    public AsegoConfig asegoConfig() {
        return ASEGO_CONFIG_DEV;
    }

    @Test
    void testRandomizedFunction() {
        final CustomerClientService customers = clientService.customers();
        final CustomerUpdateContext customerUpdateContext = CustomerResourceHelper.randomCustomer(customers);
        System.out.println("customerUpdateContext = " + customerUpdateContext);
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
            LocalDateTime.of(1990, 1, 1, 0, 0, 0),
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
            LocalDateTime.of(1990, 1, 1, 0, 0, 0),
                CUSTOMER_EMAIL,
                "Strasse 1",
                "12345",
                "Teststadt");

        final CreatedElementResponse customer = clientService
                .customers()
                .create(customerUpdateRequest);
        System.out.println("customer = " + customer);
    }

    @Test
    public void test_customers_searchWithOrdering() {
        CustomerSearchFilter searchFilter = CustomerSearchFilter.of();

        // Create ordering parameters
        List<CustomerOrderItem> orderBy = new ArrayList<>();
        orderBy.add(CustomerOrderItem.of(ECustomerField.LAST_NAME, true)); 

        // Execute search with ordering
        final CustomerSearchResponse customers = clientService
                .customers()
                .search(null, 0, 10, orderBy, searchFilter);

        System.out.println("Ordered customers search result = " + customers);
        
      
    }
}
