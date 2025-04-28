package de.leancoders.asego.client.services;

import java.util.UUID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.request.doctor.DoctorSearchFilter;
import de.leancoders.asego.common.request.doctor.DoctorUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.doctor.DoctorResponse;
import de.leancoders.asego.common.response.doctor.DoctorSearchResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.NonNull;

public class DoctorClientService extends BaseClientService {
    
        public DoctorClientService(@Nonnull final AsegoConfig config,
                                @NonNull final AsegoAuthContext asegoAuthContext) {
            super(config, asegoAuthContext);
        }

        @Nonnull
        public DoctorResponse getById(@Nonnull final UUID uuid) {
            return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .get(AsegoPaths.DOCTOR__GET_BY_ID, uuid)
                .as(DoctorResponse.class);
        }

        @Nonnull
        public CreatedElementResponse create(@Nonnull final DoctorUpdateRequest doctor) {
            return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(doctor)
                .log().all()
                .expect().statusCode(201)
                .log().all()
                .when()
                .post(AsegoPaths.DOCTOR__CREATE)
                .as(CreatedElementResponse.class);
        }

        public void update(@Nonnull final UUID uuid,
                                          @Nonnull final DoctorUpdateRequest doctor) {
            request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(doctor)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .patch(AsegoPaths.DOCTOR__UPDATE_BY_ID, uuid);
                                          
        }

        @Nonnull
        public DoctorSearchResponse search(@Nullable final UUID searchToken,
                                          final int page,
                                          final int size,
                                          @Nonnull final DoctorSearchFilter doctorSearchFilter) {
            return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(doctorSearchFilter)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(AsegoPaths.DOCTOR__LIST)
                .as(DoctorSearchResponse.class);
        }
        
    
}
