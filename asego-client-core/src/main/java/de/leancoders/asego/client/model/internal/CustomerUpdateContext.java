package de.leancoders.asego.client.model.internal;

import de.leancoders.asego.common.request.customer.CustomerUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.customer.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor(staticName = "of")
@Getter
public class CustomerUpdateContext {

    @NonNull
    private final CustomerUpdateRequest updateRequest;

    @NonNull
    private final CustomerResponse response;

    @NonNull
    private final CreatedElementResponse debug;

}
