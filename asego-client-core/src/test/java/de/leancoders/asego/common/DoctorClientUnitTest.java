package de.leancoders.asego.common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import de.leancoders.asego.common.model.doctor.EDoctorField;
import de.leancoders.asego.common.request.doctor.DoctorOrderItem;
import de.leancoders.asego.common.request.doctor.DoctorSearchFilter;
import de.leancoders.asego.common.request.doctor.DoctorUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.doctor.DoctorListItem;
import de.leancoders.asego.common.response.doctor.DoctorResponse;
import de.leancoders.asego.common.response.doctor.DoctorSearchResponse;
import groovy.util.logging.Log4j;

@Log4j
public class DoctorClientUnitTest {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";
    private static final UUID UID = UUID.fromString("b19788aa-3d76-45c5-84d1-2ece3f6319ad");
    private static final String DOCTOR_NUMBER = "669208619";

    public static final AsegoConfig ASEGO_CONFIG_DEFAULT = AsegoConfig.of(
            "https://localhost/",
            444);

    private AsegoClientService clientService;

    @BeforeEach
    public void setUp() {
        clientService = new AsegoClientService(ASEGO_CONFIG_DEFAULT);
        clientService.login(USERNAME, PASSWORD);
    }

    @Test
    public void test_doctor_search() {

        final DoctorSearchFilter doctorSearchFilter = DoctorSearchFilter.of();
        final DoctorSearchResponse doctors = clientService
                .doctors()
                .search(null, 0, 10, doctorSearchFilter);
        System.out.println("doctors = " + doctors);
    }

    @Test void test_doctor_search_ordered() {
        final DoctorSearchFilter doctorSearchFilter = DoctorSearchFilter.of();
        final List<DoctorOrderItem> orderBy = new ArrayList<>();
        DoctorOrderItem orderByItem =  DoctorOrderItem.of(EDoctorField.FIRST_NAME, true);
        orderBy.add(orderByItem);
        
        final DoctorSearchResponse doctors = clientService
                .doctors()
                .search(null, 0, 10,orderBy, doctorSearchFilter);
        System.out.println("doctors = " + doctors);
    }

    @Test
    public void test_doctor_get_by_id() {
        final DoctorResponse doctor = clientService
                .doctors()
                .getById(UID);
        System.out.println("doctor = " + doctor);
    }

    @Test
    public void test_doctor_create() {
        final DoctorUpdateRequest doctorUpdateRequest = DoctorUpdateRequest.of(
                "John", "Doe", "Cardiology");
        final CreatedElementResponse doctor = clientService
                .doctors()
                .create(doctorUpdateRequest);
        System.out.println("doctor = " + doctor);
    }

    @Test
    public void test_doctor_update() {
        final DoctorUpdateRequest doctorUpdateRequest = DoctorUpdateRequest.of(
                "Cardiology", "John", "Doe");
        clientService
                .doctors()
                .update(UID, doctorUpdateRequest);
    }

    @Test 
    public void test_doctor_find_by_doctor_number() {
        final DoctorListItem doctor = clientService
                .doctors()
                .findByDoctorNumber(DOCTOR_NUMBER);
        System.out.println("doctor = " + doctor);
    }

}