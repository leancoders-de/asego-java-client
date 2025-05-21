package de.leancoders.asego.common.response.doctor;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.leancoders.asego.common.model.doctor.EDoctorType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

import javax.annotation.Nullable;

@Data
@NoArgsConstructor
public class DoctorResponse {

    @NonNull
    @JsonProperty("uid")
    private UUID uid;

    @Nullable
    @JsonProperty("Suchbegriff")
    private String searchTerm;

    @Nullable
    @JsonProperty("Art")
    private String type;

    @Nullable
    @JsonProperty("PraxisName")
    private String practiceName;

    @Nullable
    @JsonProperty("Anrede")
    private String salutation;

    @Nullable
    @JsonProperty("Vorname")
    private String firstName;

    @Nullable
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
    
    @NonNull
    @JsonProperty("Typ")
    private EDoctorType doctorType;
    
    @NonNull
    @JsonProperty("Ohrenarzt")
    private Boolean isENTDoctor;
    
    @NonNull
    @JsonProperty("Augenarzt")
    private Boolean isEyeDoctor;
    
    @NonNull
    @JsonProperty("Hausarzt")
    private Boolean isPrimaryDoctor;
}
