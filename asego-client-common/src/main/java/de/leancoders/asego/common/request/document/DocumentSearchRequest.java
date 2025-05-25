package de.leancoders.asego.common.request.document;

import java.util.List;

import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.SearchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DocumentSearchRequest extends SearchRequest<DocumentSearchFilter, DocumentOrderItem> {

    public static DocumentSearchRequest of(PageParameter list) {
        DocumentSearchRequest request = new DocumentSearchRequest();
        request.setList(list);
        return request;
    }

    public static DocumentSearchRequest of(List<DocumentOrderItem> orderBy, PageParameter list, DocumentSearchFilter search) {
        DocumentSearchRequest request = new DocumentSearchRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    }

    private DocumentSearchRequest() {}
}