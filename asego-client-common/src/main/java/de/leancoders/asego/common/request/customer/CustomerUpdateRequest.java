package de.leancoders.asego.common.request.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.time.OffsetDateTime;

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
    private OffsetDateTime birthDate;

    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitBis")
    private OffsetDateTime coPaymentExemptUntil;

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

    @JsonProperty("Strasse")
    private String street;

    @JsonProperty("Plz")
    private String postalCode;

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
