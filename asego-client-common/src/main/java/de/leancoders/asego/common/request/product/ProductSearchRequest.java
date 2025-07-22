package de.leancoders.asego.common.request.product;

import java.util.List;

import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.SearchRequest;

public class ProductSearchRequest extends SearchRequest<ProductSearchFilter, ProductOrderItem> {

    public static ProductSearchRequest of(PageParameter list) {
        ProductSearchRequest request = new ProductSearchRequest();
        request.setList(list);
        return request;
    }

    public static ProductSearchRequest of(List<ProductOrderItem> orderBy, PageParameter list, ProductSearchFilter search) {
        ProductSearchRequest request = new ProductSearchRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    }

    private ProductSearchRequest() {}

    
}