package de.leancoders.asego.common.request.device;

import de.leancoders.asego.common.model.device.EDeviceField;
import de.leancoders.asego.common.request.OrderItem;

public class DeviceOrderItem extends OrderItem<EDeviceField> {

    public static DeviceOrderItem of(EDeviceField fieldName, Boolean desc) {
        DeviceOrderItem orderItem = new DeviceOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }
    
}
