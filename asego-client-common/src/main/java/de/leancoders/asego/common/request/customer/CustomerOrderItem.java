package de.leancoders.asego.common.request.customer;

import de.leancoders.asego.common.model.customer.ECustomerField;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Data
@EqualsAndHashCode(callSuper = true)
class CustomerOrderItem extends OrderItem<ECustomerField> {
}