package de.leancoders.asego.common.request.product;

import de.leancoders.asego.common.model.product.EProductField;
import de.leancoders.asego.common.request.OrderItem;

public class ProductOrderItem extends OrderItem<EProductField> {

    public static ProductOrderItem of(EProductField fieldName, Boolean desc) {
        ProductOrderItem orderItem = new ProductOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }
    
}