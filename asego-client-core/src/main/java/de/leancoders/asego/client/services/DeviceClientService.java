package de.leancoders.asego.client.services;

import static de.leancoders.asego.client.services.AsegoPaths.DEVICES__SEARCH;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.device.DeviceOrderItem;
import de.leancoders.asego.common.request.device.DeviceSearchFilter;
import de.leancoders.asego.common.request.device.DeviceSearchRequest;
import de.leancoders.asego.common.response.device.DeviceSearchResponse;
import io.restassured.http.ContentType;

public class DeviceClientService extends BaseClientService {

    public DeviceClientService(@Nonnull final AsegoConfig config,
            @Nonnull final AsegoAuthContext asegoAuthContext) {
        super(config, asegoAuthContext);

    }

    @Nonnull
    public DeviceSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final DeviceSearchFilter deviceSearchFilter) {

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(null, pageParameter, deviceSearchFilter);
    }

    @Nonnull
    public DeviceSearchResponse search(@Nullable final UUID searchToken,
            final int page,
            final int size,
            @Nonnull final List<DeviceOrderItem> orderBy,
            @Nonnull final DeviceSearchFilter deviceSearchFilter) {

        if (orderBy != null && orderBy.isEmpty()) {
            throw new IllegalArgumentException("orderBy must not be empty if provided");
        }

        PageParameter pageParameter = PageParameter.of();
        pageParameter.setSearchToken(searchToken);
        pageParameter.setPageIndex(page);
        pageParameter.setLimit(size);

        return search(orderBy, pageParameter, deviceSearchFilter);
    }

    @Nonnull
    private DeviceSearchResponse search(
            @Nullable List<DeviceOrderItem> orderBy,
            @Nonnull PageParameter pageParameter,
            @Nonnull final DeviceSearchFilter deviceSearchFilter) {

        DeviceSearchRequest deviceSearchRequest = DeviceSearchRequest.of(orderBy, pageParameter, deviceSearchFilter);

        return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(deviceSearchRequest)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(DEVICES__SEARCH)
                .as(DeviceSearchResponse.class);
    }
}
