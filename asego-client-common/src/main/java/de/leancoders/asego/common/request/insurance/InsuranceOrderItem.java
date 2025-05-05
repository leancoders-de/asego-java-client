package de.leancoders.asego.common.request.insurance;

import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Data
@EqualsAndHashCode(callSuper = true)
public class InsuranceOrderItem extends OrderItem<InsuranceOrderItem> {

    }