package de.leancoders.asego.common.response.insurance;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

import javax.annotation.Nullable;


@Data
public class InsuranceListItem {

    @NonNull
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
    private String additonalName;

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
    private String phone;

    @Nullable
    @JsonProperty("Fax")
    private String fax;

    @Nullable
    @JsonProperty("Email")
    private String email;

    @Nullable
    @JsonProperty("Geloescht")
    private Boolean deleted;
}
