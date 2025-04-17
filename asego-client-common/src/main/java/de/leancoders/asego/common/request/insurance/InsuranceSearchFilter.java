package de.leancoders.asego.common.request.insurance;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "of")
@Data
public class InsuranceSearchFilter {

    @Nullable
    @JsonProperty("AuchGeloeschte")
    private Boolean alsoDeleted;

    @Nullable
    @JsonProperty("Geloescht")
    private Boolean deleted;

    @Nullable
    @JsonProperty("uid")
    private UUID uid;

    @Nullable
    @JsonProperty("Suchbegriff")
    private String searchTerm;

    @Nullable
    @JsonProperty("IkNummer")
    private String institutionCode;

    @Nullable
    @JsonProperty("Name")
    private String name;

    @Nullable
    @JsonProperty("Zusatz")
    private String additionalName;

    @Nullable
    @JsonProperty("Strasse")
    private String street;

    @Nullable
    @JsonProperty("Ort")
    private String city;

    @Nullable
    @JsonProperty("Plz")
    private String postalCode;

    @Nullable
    @JsonProperty("Tel")
    private String phoneNumber;

    @Nullable
    @JsonProperty("Fax")
    private String faxNumber;

    @Nullable
    @JsonProperty("Email")
    private String emailAddress;

}