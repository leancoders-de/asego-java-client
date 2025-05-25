package de.leancoders.asego.common.request.document;

import de.leancoders.asego.common.model.document.EDocumentField;
import de.leancoders.asego.common.request.OrderItem;

public class DocumentOrderItem extends OrderItem<EDocumentField> {

    public static DocumentOrderItem of(EDocumentField fieldName, Boolean desc) {
        DocumentOrderItem orderItem = new DocumentOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }
    
}
