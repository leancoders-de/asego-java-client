package de.leancoders.asego.common.response.product;

import de.leancoders.asego.common.response.ListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductSearchResponse extends ListResponse<ProductListItem> {
}
