package de.leancoders.asego.common.request.doctor;

import de.leancoders.asego.common.model.doctor.EDoctorType;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Data
@EqualsAndHashCode(callSuper = true)
public class DoctorOrderItem extends OrderItem<EDoctorType> {

}
