package de.leancoders.asego.common.request.doctor;

import java.util.List;

import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.SearchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DoctorSearchRequest extends SearchRequest<DoctorSearchFilter, DoctorOrderItem> {

    public static DoctorSearchRequest of(PageParameter list) {
        DoctorSearchRequest request = new DoctorSearchRequest();
        request.setList(list);
        return request;
    }

    public static DoctorSearchRequest of(List<DoctorOrderItem> orderBy, PageParameter list, DoctorSearchFilter search) {
        DoctorSearchRequest request = new DoctorSearchRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    }

    private DoctorSearchRequest() {}
}
