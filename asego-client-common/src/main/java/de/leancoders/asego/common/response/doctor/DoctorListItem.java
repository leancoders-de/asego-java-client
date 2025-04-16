package de.leancoders.asego.common.response.doctor;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
import javax.annotation.Nullable;
import java.util.UUID;

@Data
@NoArgsConstructor
public class DoctorListItem {

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

}