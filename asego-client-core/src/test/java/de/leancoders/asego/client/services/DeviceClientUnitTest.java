package de.leancoders.asego.client.services;

import org.junit.jupiter.api.Test;

import de.leancoders.asego.AbstractTest;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.model.device.EDeviceEarSide;
import de.leancoders.asego.common.request.device.DeviceSearchFilter;
import de.leancoders.asego.common.response.device.DeviceSearchResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DeviceClientUnitTest extends AbstractTest {


    @Override
    public AsegoConfig asegoConfig() {
        return ASEGO_CONFIG_LOCAL;
    }

    @Test
    public void test_device_Search() {

        final DeviceSearchFilter deviceSearchFilter =  DeviceSearchFilter.of();

        final DeviceSearchResponse devices =  clientService.devices().search(null, 0, 0, deviceSearchFilter);

        System.out.println("devices = " + devices);
    }

    @Test
    public void test_device_search_filter_ear_side() {

        final DeviceSearchFilter deviceSearchFilter = DeviceSearchFilter.of();
        deviceSearchFilter.setEarSide(EDeviceEarSide.LEFT);

        final DeviceSearchResponse devices = clientService.devices().search(null, 0, 0, deviceSearchFilter);

        System.out.println("devices = " + devices);
    }

}