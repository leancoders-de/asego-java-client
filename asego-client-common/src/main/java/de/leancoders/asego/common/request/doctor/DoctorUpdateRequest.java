package de.leancoders.asego.common.request.doctor;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DoctorUpdateRequest {

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Suchbegriff")
    private String suchbegriff;

    @JsonProperty("Art")
    private String art;

    @JsonProperty("PraxisName")
    private String praxisName;

    @JsonProperty("Anrede")
    private String anrede;

    @JsonProperty("Vorname")
    private String vorname;

    @JsonProperty("Nachname")
    private String nachname;

    @JsonProperty("Strasse")
    private String strasse;

    @JsonProperty("Plz")
    private String plz;

    @JsonProperty("Ort")
    private String ort;

    @JsonProperty("Tel")
    private String tel;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Handy")
    private String handy;

    @JsonProperty("Webseite")
    private String webseite;

    @JsonProperty("Arztnummer")
    private String arztnummer;

    @JsonProperty("Betriebsstaettennummer")
    private String betriebsstaettennummer;

    @JsonProperty("Fachgebiet")
    private String fachgebiet;

    @JsonProperty("Ohrenarzt")
    private Boolean ohrenarzt;

    @JsonProperty("Hausarzt")
    private Boolean hausarzt;

    @JsonProperty("Augenarzt")
    private Boolean augenarzt;

    @JsonProperty("Inaktiv")
    private Boolean inaktiv;


}
