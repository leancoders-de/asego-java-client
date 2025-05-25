package de.leancoders.asego.common.request.customer;

import de.leancoders.asego.common.model.customer.ECustomerField;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerOrderItem extends OrderItem<ECustomerField> {
    public static CustomerOrderItem of(ECustomerField fieldName, Boolean desc) {
        CustomerOrderItem orderItem = new CustomerOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }
}