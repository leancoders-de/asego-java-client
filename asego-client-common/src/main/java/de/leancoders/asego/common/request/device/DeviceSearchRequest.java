package de.leancoders.asego.common.request.device;

import java.util.List;

import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.SearchRequest;


public class DeviceSearchRequest extends SearchRequest<DeviceSearchFilter, DeviceOrderItem>{

    public static DeviceSearchRequest of(PageParameter list) {
        DeviceSearchRequest request = new DeviceSearchRequest();
        request.setList(list);
        return request;
    }

    public static DeviceSearchRequest of(List<DeviceOrderItem> orderBy, PageParameter list, DeviceSearchFilter search) {
        DeviceSearchRequest request = new DeviceSearchRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    } 

    private DeviceSearchRequest() {
    }
    
}
