package de.leancoders.asego.client.services;

import static de.leancoders.asego.client.services.AsegoPaths.PRODUCT__SEARCH;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.product.ProductOrderItem;
import de.leancoders.asego.common.request.product.ProductSearchFilter;
import de.leancoders.asego.common.request.product.ProductSearchRequest;
import de.leancoders.asego.common.response.product.ProductListItem;
import de.leancoders.asego.common.response.product.ProductSearchResponse;
import groovyjarjarantlr4.v4.runtime.misc.Nullable;
import io.restassured.http.ContentType;

public class ProductClientService extends BaseClientService {

    public ProductClientService(@Nonnull final AsegoConfig config,
            @Nonnull final AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);

    }

    @Nonnull
    public ProductSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final ProductSearchFilter productSearchFilter) {

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(null, pageParameter, productSearchFilter);
    }

    @Nonnull
    public ProductSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final List<ProductOrderItem> orderBy,
            @Nonnull final ProductSearchFilter productSearchFilter) {

        if (orderBy != null && orderBy.isEmpty()) {
            throw new IllegalArgumentException("orderBy must not be empty if provided");
        }

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(orderBy, pageParameter, productSearchFilter);
    }

    @javax.annotation.Nullable
    public ProductListItem findBySkU(@Nonnull final String sku) {
        ProductSearchFilter filter = ProductSearchFilter.of();
        filter.setSku(sku);

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setPageIndex(0);
        pageParameter.setLimit(1);

        ProductSearchResponse products = search(null, pageParameter, filter);

        if (products.getItems() != null && !products.getItems().isEmpty()) {
            return products.getItems().get(0);
        }

        return null;
    }

    @Nonnull
    private ProductSearchResponse search(
            @Nullable List<ProductOrderItem> orderBy,
            @Nonnull PageParameter pageParameter,
            @Nonnull final ProductSearchFilter productSearchFilter) {

        ProductSearchRequest productSearchRequest = ProductSearchRequest.of(orderBy, pageParameter, productSearchFilter);

        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(productSearchRequest)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(PRODUCT__SEARCH)
                .as(ProductSearchResponse.class);
    }
}
