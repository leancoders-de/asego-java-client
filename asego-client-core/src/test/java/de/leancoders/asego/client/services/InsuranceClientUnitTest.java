package de.leancoders.asego.client.services;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.insurance.InsuranceSearchFilter;
import de.leancoders.asego.common.model.insurance.EInsuranceField;
import de.leancoders.asego.common.request.insurance.InsuranceOrderItem;
import groovy.util.logging.Log4j2;

@Log4j2
public class InsuranceClientUnitTest {
    
    public static String USERNAME = "test";
    public static String PASSWORD = "XxyL8X1GT6";
    public static UUID UID = UUID.fromString("fb7df5f7-6c75-46eb-8269-f19ed3575301");	

    public static final AsegoConfig ASEGO_CONFIG_DEFAULT =
        AsegoConfig.of(
            "https://localhost/",
            444
        );
    
    private AsegoClientService clientService;

    @BeforeEach
    public void setUp() {
        clientService = new AsegoClientService(ASEGO_CONFIG_DEFAULT);
        clientService.login(USERNAME, PASSWORD);
    }

    @Test
    public void test_insurance_search() {
        final InsuranceSearchFilter insuranceSearchFilter = InsuranceSearchFilter.of();
        
        final var insurance = clientService
            .insurance()
            .search(null, 0, 10, insuranceSearchFilter);


        
        System.out.println("insurance = " + insurance);
    }

    @Test 
    public void test_insurance_getById() {
        final var insurance = clientService
            .insurance()
            .getById(UID);
        System.out.println("insurance = " + insurance);
    }

    @Test
    public void test_insurance_search_with_order() {
        // Create search filter
        final InsuranceSearchFilter insuranceSearchFilter = InsuranceSearchFilter.of();
        

        List<InsuranceOrderItem> orderBy = new ArrayList<>();

        orderBy.add(InsuranceOrderItem.of(EInsuranceField.NAME, true));

        final var orderedInsurances = clientService
            .insurance()
            .search(null, 0, 10, orderBy, insuranceSearchFilter);
        
        System.out.println("Ordered insurance search results = " + orderedInsurances);
        
    }
}
