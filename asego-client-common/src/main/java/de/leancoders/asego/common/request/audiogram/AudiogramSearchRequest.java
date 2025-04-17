package de.leancoders.asego.common.request.audiogram;

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
public class AudiogramSearchRequest extends SearchRequest<AudiogramSearchFilter> {

    public static AudiogramSearchRequest of(@NonNull PageParameter list) {
        AudiogramSearchRequest request = new AudiogramSearchRequest();
        request.setList(list);
        return request;
    }
    
    public static AudiogramSearchRequest of(@Nullable List<OrderItem> orderBy, 
                                           @NonNull PageParameter list, 
                                           @Nullable AudiogramSearchFilter search) {
        AudiogramSearchRequest request = new AudiogramSearchRequest();
        request.setOrderBy(orderBy);
        request.setList(list);
        request.setSearch(search);
        return request;
    }
    
    private AudiogramSearchRequest() {
    }
}
