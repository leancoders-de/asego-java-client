package de.leancoders.asego.common.request.audiogram;

import de.leancoders.asego.common.model.audiogram.EAudiogramField;
import de.leancoders.asego.common.request.OrderItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramOrderItem extends OrderItem<EAudiogramField> {}