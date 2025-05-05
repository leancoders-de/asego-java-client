package de.leancoders.asego.common.request.insurance;

import de.leancoders.asego.common.model.insurance.EInsuranceField;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class InsuranceOrderItem extends OrderItem<EInsuranceField> {
    public static InsuranceOrderItem of(EInsuranceField fieldName, Boolean desc) {
       InsuranceOrderItem orderItem = new InsuranceOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }
}