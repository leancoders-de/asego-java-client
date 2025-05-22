package de.leancoders.asego.common;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import de.leancoders.asego.common.response.keys.KeyListingItem;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class KeyClientUnitTest {
    
    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";

    private static final AsegoConfig ASEGO_CONFIG_DEFAULT =
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
    public void test_keys_salutationList() {
        final List<KeyListingItem> salutationList = clientService
            .keys()
            .getSalutationList();

        System.out.println("salutationList = " + salutationList);
    }

    @Test
    public void test_keys_titleList() {
        final List<KeyListingItem> titleList = clientService
            .keys()
            .getTitleList();

        System.out.println("titleList = " + titleList);
    }

    @Test
    public void test_keys_countryList() {
        final List<KeyListingItem> countryList = clientService
            .keys()
            .getCountryList();

        System.out.println("countryList = " + countryList);
    }

}
