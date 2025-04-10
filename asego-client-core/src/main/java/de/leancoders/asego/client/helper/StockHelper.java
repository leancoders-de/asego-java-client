package de.leancoders.asego.client.helper;

import com.google.common.collect.ImmutableMap;

import javax.annotation.Nonnull;
import java.util.Map;

public class StockHelper {

    @Nonnull
    public static Map<String, Map<String, Object>> map(final long stockId, final long quantity) {
        return ImmutableMap.of(
            "stock_item",
            ImmutableMap.of(
                "stock_id", stockId,
                "qty", quantity,
                "is_in_stock", quantity > 0,
                "min_qty", 0,
                "use_config_min_sale_qty", 1,
                "min_sale_qty", 1
            )
        );
    }

}
