package de.leancoders.asego.common.response.audiogram;

import de.leancoders.asego.common.response.ListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AudiogramSearchResponse extends ListResponse<AudiogramListingItem> {
}
