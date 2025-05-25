package de.leancoders.asego.common.request.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.annotation.Nullable;

import java.util.Date;
import java.util.UUID;

@RequiredArgsConstructor(staticName = "of")
@Data
public class CustomerUpdateRequest {

    @Nullable
    @JsonProperty("AnredeID")
    private String salutationId;

    @NonNull
    @JsonProperty("Vorname")
    private String firstName;

    @NonNull
    @JsonProperty("Nachname")
    private String lastName;

    @NonNull
    @JsonProperty("Geburtsdatum")
    private Date birthDate;

    @Nullable
    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @Nullable
    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @Nullable
    @JsonProperty("ZuzahlungsbefreitBis")
    private Date coPaymentExemptUntil;

    @Nullable
    @JsonProperty("KostentraegerID")
    private String insuranceCarrierId;

    @Nullable
    @JsonProperty("VersicherungsNummer")
    private String insuranceNumber;

    @Nullable
    @JsonProperty("VersicherungsStatus")
    private String insuranceStatus;

    @Nullable
    @JsonProperty("IKGesundheitskarte")
    private String healthCardInstituionCode;

    @Nullable
    @JsonProperty("HNOArztID")
    private String entDoctorId;

    @NonNull
    @JsonProperty("EMail")
    private String email;

    @Nullable
    @JsonProperty("Tel")
    private String phone;

    @Nullable
    @JsonProperty("Tel2")
    private String phone2;

    @Nullable
    @JsonProperty("Fax")
    private String fax;

    @Nullable
    @JsonProperty("Handy")
    private String mobile;

    @NonNull
    @JsonProperty("Strasse")
    private String street;

    @NonNull
    @JsonProperty("Plz")
    private String postalCode;

    @NonNull
    @JsonProperty("Ort")
    private String city;

    @Nullable
    @JsonProperty("Freifeld1")
    private String customField1;

    @Nullable
    @JsonProperty("Freifeld2")
    private String customField2;

    @Nullable
    @JsonProperty("Freifeld3")
    private String customField3;

    @Nullable
    @JsonProperty("Freifeld4")
    private String customField4;

    @Nullable
    @JsonProperty("Freifeld5")
    private String customField5;

    @Nullable
    @JsonProperty("uid")
    private UUID uid;

    @Nullable
    @JsonProperty("HearooApp")
    private Boolean hearooApp;

    @Nullable
    @JsonProperty("Inst")
    private String branch;
}
