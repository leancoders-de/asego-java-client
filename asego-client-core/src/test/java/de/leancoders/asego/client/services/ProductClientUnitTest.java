package de.leancoders.asego.client.services;

import org.junit.jupiter.api.Test;

import de.leancoders.asego.AbstractTest;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.product.ProductSearchFilter;
import de.leancoders.asego.common.response.product.ProductListItem;
import de.leancoders.asego.common.response.product.ProductSearchResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProductClientUnitTest extends AbstractTest {

    private static final String PRODUCT_SKU = "HSI0019";

    
    @Override
    public AsegoConfig asegoConfig() {
        return ASEGO_CONFIG_LOCAL;
    }

    @Test
    public void test_product_Search() {

        final ProductSearchFilter productSearchFilter = ProductSearchFilter.of();

        final ProductSearchResponse products = clientService.products().search(null, 0, 0, productSearchFilter);

        System.out.println("products = " + products);
    }

    @Test
    public void test_product_findBySku() {

        final ProductListItem product = clientService.products().findBySkU(PRODUCT_SKU);

        System.out.println("product = " + product);
    }



}
