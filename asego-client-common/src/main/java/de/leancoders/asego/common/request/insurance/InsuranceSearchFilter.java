package de.leancoders.asego.common.request.insurance;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
@Data
public class InsuranceSearchFilter {

    @JsonProperty("AuchGeloeschte")
    private Boolean alsoDeleted;
    @JsonProperty("Geloescht")
    private Boolean deleted;
    @JsonProperty("uid")
    private UUID uid;
    @JsonProperty("Suchbegriff")
    private String searchTerm;
    @JsonProperty("IkNummer")
    private String ikNumber;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Zusatz")
    private String additionalName;
    @JsonProperty("Strasse")
    private String street;
    @JsonProperty("Ort")
    private String city;
    @JsonProperty("Plz")
    private String postalCode;
    @JsonProperty("Tel")
    private String phoneNumber;
    @JsonProperty("Fax")
    private String faxNumber;
    @JsonProperty("Email")
    private String emailAddress;

}