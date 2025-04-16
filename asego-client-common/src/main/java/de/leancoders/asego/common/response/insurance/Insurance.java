package de.leancoders.asego.common.response.insurance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
public class Insurance {

    @JsonProperty("uid")
    private UUID uid;

    @JsonProperty("Suchbegriff")
    private String searchTerm;

    @JsonProperty("IkNummer")
    private String institutionCode;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Zusatz")
    private String additionalInfo;

    @JsonProperty("Strasse")
    private String street;

    @JsonProperty("Ort")
    private String city;

    @JsonProperty("Plz")
    private String postalCode;

    @JsonProperty("Tel")
    private String phone;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Geloescht")
    private Boolean deleted;
}
