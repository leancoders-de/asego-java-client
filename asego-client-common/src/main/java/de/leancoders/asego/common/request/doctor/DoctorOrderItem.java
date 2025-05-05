package de.leancoders.asego.common.request.doctor;

import de.leancoders.asego.common.model.doctor.EDoctorField;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class DoctorOrderItem extends OrderItem<EDoctorField> {

    public static DoctorOrderItem of(EDoctorField fieldName, Boolean desc) {
       DoctorOrderItem orderItem = new DoctorOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }


    private DoctorOrderItem() {
        super();
    }

}
