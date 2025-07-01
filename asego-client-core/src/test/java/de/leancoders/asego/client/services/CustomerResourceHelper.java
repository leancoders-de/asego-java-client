package de.leancoders.asego.client.services;

import de.leancoders.asego.client.model.internal.CustomerUpdateContext;
import de.leancoders.asego.common.request.customer.CustomerUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.customer.CustomerResponse;

import javax.annotation.Nonnull;
import java.time.LocalDateTime;
import java.util.UUID;

import static de.leancoders.asego.TestHelper.randomBoolean;
import static de.leancoders.asego.TestHelper.randomText;

public class CustomerResourceHelper {

    @Nonnull
    public static CustomerUpdateContext randomCustomer(@Nonnull final CustomerClientService customerClientService) {
        final CustomerUpdateRequest request = CustomerUpdateRequest.of(
            // firstname
            randomText(10),
            // lastname
            randomText(10),
            // birth
            LocalDateTime.now(),
            // email
            randomText(10) + "@" + randomText(5) + ".com",
            // street
            randomText(10),
            // zipcode
            randomText(5),
            // city
            randomText(10)
        );


        request.setPrivatelyInsured(randomBoolean());
        request.setCoPaymentExempt(randomBoolean());
        request.setCoPaymentExemptUntil(LocalDateTime.now());
        request.setPhone(randomText(10));
        request.setPhone2(randomText(10));
        request.setFax(randomText(10));
        request.setCellular(randomText(10));
        request.setCustomField1(randomText(10));
        request.setCustomField2(randomText(10));
        request.setCustomField3(randomText(10));
        request.setCustomField4(randomText(10));
        request.setCustomField5(randomText(10));
        request.setBranch(randomText(10));
        request.setHearooApp(randomBoolean());

        // TODO
        //  request.setInsuranceNumber(randomText(10));
        //  request.setInsuranceStatus(randomText(10));
        //  request.setHealthCardInstitutionCode(randomText(10));
        //  request.setUid();
        //  request.setSalutationId();
        //  request.setInsuranceCarrierId();
        //  request.setEarNoseThroatDoctorId();

        final CreatedElementResponse createdElementResponse = customerClientService.create(request);
        final UUID createdUid = createdElementResponse.getCreatedUid();

        final CustomerResponse byId = customerClientService.getById(createdUid);

        return CustomerUpdateContext.of(request, byId, createdElementResponse);

    }

}
