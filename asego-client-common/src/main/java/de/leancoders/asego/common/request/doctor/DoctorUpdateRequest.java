package de.leancoders.asego.common.request.doctor;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.annotation.Nullable;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(staticName = "of")
@Data
public class DoctorUpdateRequest {

    @Nullable
    @JsonProperty("uid")
    private String uid;

    @Nullable
    @JsonProperty("Suchbegriff")
    private String suchbegriff;

    @Nullable
    @JsonProperty("Art")
    private String art;

    @NonNull
    @JsonProperty("PraxisName")
    private String praxisName;

    @Nullable
    @JsonProperty("Anrede")
    private String anrede;

    @NonNull
    @JsonProperty("Vorname")
    private String vorname;

    @NonNull
    @JsonProperty("Nachname")
    private String nachname;

    @Nullable
    @JsonProperty("Strasse")
    private String strasse;

    @Nullable
    @JsonProperty("Plz")
    private String plz;

    @Nullable
    @JsonProperty("Ort")
    private String ort;

    @Nullable
    @JsonProperty("Tel")
    private String tel;

    @Nullable
    @JsonProperty("Fax")
    private String fax;

    @Nullable
    @JsonProperty("Handy")
    private String handy;

    @Nullable
    @JsonProperty("Webseite")
    private String webseite;

    @Nullable
    @JsonProperty("Arztnummer")
    private String arztnummer;

    @Nullable
    @JsonProperty("Betriebsstaettennummer")
    private String betriebsstaettennummer;

    @Nullable
    @JsonProperty("Fachgebiet")
    private String fachgebiet;

    @Nullable
    @JsonProperty("Ohrenarzt")
    private Boolean ohrenarzt;

    @Nullable
    @JsonProperty("Hausarzt")
    private Boolean hausarzt;

    @Nullable
    @JsonProperty("Augenarzt")
    private Boolean augenarzt;

    @Nullable
    @JsonProperty("Inaktiv")
    private Boolean inaktiv;
}
