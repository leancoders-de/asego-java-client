package de.leancoders.asego.common.request.audiogram;

import de.leancoders.asego.common.request.SearchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AudiogramSearchRequest extends SearchRequest<AudiogramSearchFilter> {

}
