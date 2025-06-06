package de.leancoders.asego.common.response.document;

import de.leancoders.asego.common.response.ListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentSearchResponse extends ListResponse<DocumentListItem> {
}