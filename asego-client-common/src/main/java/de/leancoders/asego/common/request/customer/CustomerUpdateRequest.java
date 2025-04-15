package de.leancoders.asego.common.request.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;


@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
@Data
public class CustomerUpdateRequest {


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

    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitBis")
    private Date coPaymentExemptUntil;

    @JsonProperty("KostentraegerID")
    private String insuranceCarrierId;

    @JsonProperty("VersicherungsNummer")
    private String insuranceNumber;

    @JsonProperty("VersicherungsStatus")
    private String insuranceStatus;

    @JsonProperty("IKGesundheitskarte")
    private String healthCardInstituionCode;

    @JsonProperty("HNOArztID")
    private String entDoctorId;

    @NonNull
    @JsonProperty("EMail")
    private String email;

    @JsonProperty("Tel")
    private String phone;

    @JsonProperty("Tel2")
    private String phone2;

    @JsonProperty("Fax")
    private String fax;

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

    @JsonProperty("Freifeld1")
    private String customField1;

    @JsonProperty("Freifeld2")
    private String customField2;

    @JsonProperty("Freifeld3")
    private String customField3;

    @JsonProperty("Freifeld4")
    private String customField4;

    @JsonProperty("Freifeld5")
    private String customField5;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("HearooApp")
    private Boolean hearooApp;

    @JsonProperty("Inst")
    private String branch;
}
