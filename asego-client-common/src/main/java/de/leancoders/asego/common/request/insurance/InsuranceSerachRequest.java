package de.leancoders.asego.common.request.insurance;

import de.leancoders.asego.common.request.OrderItem;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.SearchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class InsuranceSerachRequest extends SearchRequest<InsuranceSearchFilter> {

    //  args factory method
    public static InsuranceSerachRequest of(@NonNull PageParameter list) {
        InsuranceSerachRequest request = new InsuranceSerachRequest();
        request.setList(list);
        return request;
    }
    
    public static InsuranceSerachRequest of(@Nullable List<OrderItem> orderBy, 
                                           @NonNull PageParameter list, 
                                           @Nullable InsuranceSearchFilter search) {
        InsuranceSerachRequest request = new InsuranceSerachRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    }
    
    private InsuranceSerachRequest() {
    }
}
