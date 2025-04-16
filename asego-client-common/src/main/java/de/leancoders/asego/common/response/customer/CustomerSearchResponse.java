package de.leancoders.asego.common.response.customer;

import de.leancoders.asego.common.response.ListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerSearchResponse extends ListResponse<CustomerSearchListingItem> {
}
