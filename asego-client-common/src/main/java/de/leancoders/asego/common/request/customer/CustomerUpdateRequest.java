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
    private String salutationID;

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
    private String insuranceCarrierID;

    @JsonProperty("VersicherungsNummer")
    private String insuranceNumber;

    @JsonProperty("VersicherungsStatus")
    private String insuranceStatus;

    @JsonProperty("IKGesundheitskarte")
    private String healthCardIK;

    @JsonProperty("HNOArztID")
    private String entDoctorID;

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
    private String freeField1;

    @JsonProperty("Freifeld2")
    private String freeField2;

    @JsonProperty("Freifeld3")
    private String freeField3;

    @JsonProperty("Freifeld4")
    private String freeField4;

    @JsonProperty("Freifeld5")
    private String freeField5;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("HearooApp")
    private Boolean hearooApp;

    @JsonProperty("Inst")
    private String branch;
}
