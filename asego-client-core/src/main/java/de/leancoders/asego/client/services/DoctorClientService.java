package de.leancoders.asego.client.services;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import de.leancoders.asego.client.model.internal.AsegoAuthContext;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.model.page.Page;
import de.leancoders.asego.common.request.OrderItem;
import de.leancoders.asego.common.request.PageParameter;
import de.leancoders.asego.common.request.doctor.DoctorSearchFilter;
import de.leancoders.asego.common.request.doctor.DoctorSearchRequest;
import de.leancoders.asego.common.request.doctor.DoctorUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.doctor.DoctorListItem;
import de.leancoders.asego.common.response.doctor.DoctorResponse;
import de.leancoders.asego.common.response.doctor.DoctorSearchResponse;
import io.restassured.http.ContentType;
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
            
            PageParameter pageParameter = PageParameter.of(); 
            pageParameter.setSearchToken(searchToken);
            pageParameter.setPageIndex(page);
            pageParameter.setLimit(size);                               
            
            return search( null, pageParameter, doctorSearchFilter);
        }



        @Nullable
        public DoctorListItem findByDoctorNumber(@Nonnull final String doctornumber) {
            DoctorSearchFilter filter = DoctorSearchFilter.of();
            filter.setDoctorNumber(doctornumber);
            DoctorSearchResponse response = search(null, 0, 1, filter );

            if (response.getItems().isEmpty()) {
                return null;
            }
            
            return response.getItems().get(0);
        }
        
        @Nonnull
        private  DoctorSearchResponse search(
                                          @Nullable List<OrderItem> orderBy,
                                          @Nonnull PageParameter pageParameter,
                                          @Nonnull final DoctorSearchFilter doctorSearchFilter) {
            
            DoctorSearchRequest request = DoctorSearchRequest.of(orderBy, pageParameter , doctorSearchFilter) ;                               

            return request()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request)
                .log().all()
                .expect().statusCode(200)
                .log().all()
                .when()
                .post(AsegoPaths.DOCTOR__LIST)
                .as(DoctorSearchResponse.class);
        }

}
