package de.leancoders.asego.common.request.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.time.OffsetDateTime;

@Data
public class CustomerUpdateRequest {

    @JsonProperty("AnredeID")
    private String anredeID;

    @NonNull
    @JsonProperty("Vorname")
    private String vorname;

    @NonNull
    @JsonProperty("Nachname")
    private String nachname;

    @NonNull
    @JsonProperty("Geburtsdatum")
    private OffsetDateTime geburtsdatum;

    @JsonProperty("PrivatVersichert")
    private Boolean privatVersichert;

    @JsonProperty("Zuzahlungsbefreit")
    private Boolean zuzahlungsbefreit;

    @JsonProperty("ZuzahlungsbefreitBis")
    private OffsetDateTime zuzahlungsbefreitBis;

    @JsonProperty("KostentraegerID")
    private String kostentraegerID;

    @JsonProperty("VersicherungsNummer")
    private String versicherungsNummer;

    @JsonProperty("VersicherungsStatus")
    private String versicherungsStatus;

    @JsonProperty("IKGesundheitskarte")
    private String ikGesundheitskarte;

    @JsonProperty("HNOArztID")
    private String hnOArztID;

    @JsonProperty("EMail")
    private String email;

    @JsonProperty("Tel")
    private String tel;

    @JsonProperty("Tel2")
    private String tel2;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Handy")
    private String handy;

    @JsonProperty("Strasse")
    private String strasse;

    @JsonProperty("Plz")
    private String plz;

    @JsonProperty("Ort")
    private String ort;

    @JsonProperty("Freifeld1")
    private String freifeld1;

    @JsonProperty("Freifeld2")
    private String freifeld2;

    @JsonProperty("Freifeld3")
    private String freifeld3;

    @JsonProperty("Freifeld4")
    private String freifeld4;

    @JsonProperty("Freifeld5")
    private String freifeld5;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("HearooApp")
    private Boolean hearooApp;

    @JsonProperty("Inst")
    private String inst;


}
