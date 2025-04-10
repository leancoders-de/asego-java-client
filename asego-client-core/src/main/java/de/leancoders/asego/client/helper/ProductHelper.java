package de.leancoders.asego.client.helper;

import com.google.common.collect.ImmutableList;
import de.leancoders.asego.common.model.attributeset.AttributeOption;
import de.leancoders.asego.common.model.enums.EProductType;
import de.leancoders.asego.common.model.product.MagentoAttribute;
import de.leancoders.asego.common.model.product.Product;
import de.leancoders.asego.common.request.ConfigurableProductChildUpdateRequest;
import lombok.NonNull;

import static com.google.common.base.Preconditions.checkArgument;

public class ProductHelper {
    @NonNull
    public static Iterable<ConfigurableProductChildUpdateRequest> configurableProductChildUpdateRequests(@NonNull final Product configurableProduct,
                                                                                                         @NonNull final Product simpleProduct) {
        return configurableProductChildUpdateRequests(configurableProduct, ImmutableList.of(simpleProduct));
    }

    @NonNull
    public static Iterable<ConfigurableProductChildUpdateRequest> configurableProductChildUpdateRequests(@NonNull final Product configurableProduct,
                                                                                                         @NonNull final Iterable<Product> simpleProducts) {

        checkArgument(configurableProduct.getProductType() == EProductType.CONFIGURABLE);
        simpleProducts.forEach(product -> checkArgument(product.getProductType() == EProductType.SIMPLE));

        final ImmutableList.Builder<ConfigurableProductChildUpdateRequest> builder = ImmutableList.builder();

        final String configSKU = configurableProduct.getSku();
        for (final Product simpleProduct : simpleProducts) {
            final String simpleSKU = simpleProduct.getSku();
            final ConfigurableProductChildUpdateRequest configurableProductChildUpdateRequest = ConfigurableProductChildUpdateRequest.of(simpleSKU);

            builder.add(configurableProductChildUpdateRequest);
        }

        return builder.build();
    }
}
