package de.leancoders.asego.common.request.audiogram;

import de.leancoders.asego.common.model.audiogram.EAudiogramField;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramOrderItem extends OrderItem<EAudiogramField> {

    public static AudiogramOrderItem of(EAudiogramField fieldName, Boolean desc) {
        AudiogramOrderItem orderItem = new AudiogramOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }
}