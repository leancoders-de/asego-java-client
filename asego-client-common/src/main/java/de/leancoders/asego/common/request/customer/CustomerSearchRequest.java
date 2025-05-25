package de.leancoders.asego.common.request.customer;

import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.SearchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerSearchRequest extends SearchRequest<CustomerSearchFilter, CustomerOrderItem > {

    public static CustomerSearchRequest of(@NonNull PageParameter list) {
        CustomerSearchRequest request = new CustomerSearchRequest();
        request.setList(list);
        return request;
    }
    
    public static CustomerSearchRequest of(@Nullable List<CustomerOrderItem> orderBy, 
                                          @NonNull PageParameter list, 
                                          @Nullable CustomerSearchFilter search) {
        CustomerSearchRequest request = new CustomerSearchRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    }
    
    private CustomerSearchRequest() {
    }
}
