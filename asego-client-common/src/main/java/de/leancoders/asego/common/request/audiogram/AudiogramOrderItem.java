package de.leancoders.asego.common.request.audiogram;

import de.leancoders.asego.common.model.audiogram.EAudiogramField;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramOrderItem extends OrderItem<EAudiogramField> {

    @NonNull
    public static AudiogramOrderItem of(@NonNull final EAudiogramField fieldName,
                                        @NonNull final Boolean desc) {
        final AudiogramOrderItem orderItem = new AudiogramOrderItem();
        orderItem.setFieldName(fieldName);
        orderItem.setDesc(desc);
        return orderItem;
    }
}