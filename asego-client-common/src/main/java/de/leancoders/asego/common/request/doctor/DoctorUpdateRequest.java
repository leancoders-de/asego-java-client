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
    private String searchTerm;

    @Nullable
    @JsonProperty("Art")
    private String type;

    @NonNull
    @JsonProperty("PraxisName")
    private String practiceName;

    @Nullable
    @JsonProperty("Anrede")
    private String salutation;

    @NonNull
    @JsonProperty("Vorname")
    private String firstName;

    @NonNull
    @JsonProperty("Nachname")
    private String lastName;

    @Nullable
    @JsonProperty("Strasse")
    private String street;

    @Nullable
    @JsonProperty("Plz")
    private String postalCode;

    @Nullable
    @JsonProperty("Ort")
    private String city;

    @Nullable
    @JsonProperty("Tel")
    private String phone;

    @Nullable
    @JsonProperty("Fax")
    private String fax;

    @Nullable
    @JsonProperty("Handy")
    private String mobile;

    @Nullable
    @JsonProperty("Webseite")
    private String website;

    @Nullable
    @JsonProperty("Arztnummer")
    private String doctorNumber;

    @Nullable
    @JsonProperty("Betriebsstaettennummer")
    private String practiceNumber;

    @Nullable
    @JsonProperty("Fachgebiet")
    private String specialty;

    @Nullable
    @JsonProperty("Ohrenarzt")
    private Boolean entDoctor;

    @Nullable
    @JsonProperty("Hausarzt")
    private Boolean generalPractitioner;

    @Nullable
    @JsonProperty("Augenarzt")
    private Boolean eyeDoctor;

    @Nullable
    @JsonProperty("Inaktiv")
    private Boolean inactive;
}
