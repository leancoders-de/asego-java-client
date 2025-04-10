package de.leancoders.asego.common.response.insurance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class Insurance {

    @JsonProperty("uid")
    private UUID uid;

    @JsonProperty("Suchbegriff")
    private String suchbegriff;

    @JsonProperty("IkNummer")
    private String ikNummer;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Zusatz")
    private String zusatz;

    @JsonProperty("Strasse")
    private String strasse;

    @JsonProperty("Ort")
    private String ort;

    @JsonProperty("Plz")
    private String plz;

    @JsonProperty("Tel")
    private String tel;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Geloescht")
    private Boolean geloescht;
}
