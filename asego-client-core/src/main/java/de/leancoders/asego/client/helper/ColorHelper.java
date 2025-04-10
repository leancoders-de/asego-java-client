package de.leancoders.asego.client.helper;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import de.leancoders.asego.common.model.attributeset.Attribute;
import de.leancoders.asego.common.model.attributeset.AttributeOption;
import de.leancoders.asego.common.model.category.Category;
import de.leancoders.asego.common.model.product.MagentoAttribute;
import lombok.NonNull;

public class ColorHelper {

    @NonNull
    public static Iterable<MagentoAttribute> map(@NonNull final Iterable<AttributeOption> attributeOptions) {
        final ImmutableList.Builder<MagentoAttribute> colorOptionBuilder = ImmutableList.builder();

        for (final AttributeOption attributeOption : attributeOptions) {
            final String label = attributeOption.getLabel();
            final String value = attributeOption.getValue();

            final Integer colorId = Ints.tryParse(value);

            colorOptionBuilder.add(
                MagentoAttribute.of(
                    "color", colorId
                )
            );
        }

        return colorOptionBuilder.build();
    }
}
