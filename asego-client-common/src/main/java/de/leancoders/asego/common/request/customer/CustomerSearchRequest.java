package de.leancoders.asego.common.request.customer;

import de.leancoders.asego.common.request.SearchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerSearchRequest extends SearchRequest<CustomerSearchFilter> {

}
