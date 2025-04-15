package de.leancoders.asego.common.request.doctor;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(staticName = "of")
@Data
public class DoctorSearchFilter {

    @JsonProperty("AuchInaktive")
    private Boolean includeInactive;

    @JsonProperty("Inaktiv")
    private Boolean inactive;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Suchbegriff")
    private String searchTerm;

    @JsonProperty("Art")
    private String type;
    
    @JsonProperty("PraxisName")
    private String practiceName;
    
    @JsonProperty("Anrede")
    private String salutation;
    
    @JsonProperty("Vorname")
    private String firstName;
    
    @JsonProperty("Nachname")
    private String lastName;
    
    @JsonProperty("Strasse")
    private String street;
    
    @JsonProperty("Plz")
    private String postalCode;
    
    @JsonProperty("Ort")
    private String city;
    
    @JsonProperty("Tel")
    private String phone;
    
    @JsonProperty("Fax")
    private String fax;
    
    @JsonProperty("Handy")
    private String mobile;
    
    @JsonProperty("Webseite")
    private String website;
    
    @JsonProperty("Arztnummer")
    private String doctorNumber;
    
    @JsonProperty("Betriebsstaettennummer")
    private String practiceNumber;
    
    @JsonProperty("Fachgebiet")
    private String specialty;
    
    @JsonProperty("Typ")
    private Integer typeId;
    
    @JsonProperty("Ohrenarzt")
    private Boolean earDoctor;
    
    @JsonProperty("Augenarzt")
    private Boolean eyeDoctor;
    
    @JsonProperty("Hausarzt")
    private Boolean familyDoctor;

}
