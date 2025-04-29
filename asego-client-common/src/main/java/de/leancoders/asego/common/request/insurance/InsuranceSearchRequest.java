package de.leancoders.asego.common.request.insurance;

import java.util.List;

import de.leancoders.asego.common.request.OrderItem;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.SearchRequest;

public class InsuranceSearchRequest extends SearchRequest<InsuranceSearchFilter> {

    public static InsuranceSearchRequest of(PageParameter list) {
        InsuranceSearchRequest request = new InsuranceSearchRequest();
        request.setList(list);
        return request;
    }

    public static InsuranceSearchRequest of(List<OrderItem> orderBy, PageParameter list, InsuranceSearchFilter search) {
        InsuranceSearchRequest request = new InsuranceSearchRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    }

    private InsuranceSearchRequest() {}

}