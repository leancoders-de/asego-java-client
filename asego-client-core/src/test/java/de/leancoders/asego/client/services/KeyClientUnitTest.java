package de.leancoders.asego.client.services;

import de.leancoders.asego.AbstractTest;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.response.keys.KeyListResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
public class KeyClientUnitTest extends AbstractTest {

    @Override
    public AsegoConfig asegoConfig() {
        return ASEGO_CONFIG_LOCAL;
    }

    @DisplayName("Keys: Fetch Salutations")
    @Test
    public void test_keys_salutationList() {
        final KeyListResponse salutationList = clientService
            .keys()
            .getSalutationList();

        log.info("SalutationList: {}", salutationList);

        assertThat(salutationList).isNotEmpty();
    }

    @DisplayName("Keys: Fetch Titles")
    @Test
    public void test_keys_titleList() {
        final KeyListResponse titleList = clientService
            .keys()
            .getTitleList();

        log.info("TitleList: {}", titleList);

        assertThat(titleList).isNotEmpty();
    }

    @DisplayName("Keys: Fetch Countries")
    @Test
    public void test_keys_countryList() {
        final KeyListResponse countryList = clientService
            .keys()
            .getCountryList();

        log.info("CountryList: {}", countryList);

        assertThat(countryList).isNotEmpty();
    }


}
