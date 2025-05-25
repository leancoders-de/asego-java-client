package de.leancoders.asego.common.model.doctor;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EDoctorField {
    UID("uid"),
    SEARCH_TERM("Suchbegriff"),
    TYPE("Art"),
    PRACTICE_NAME("PraxisName"),
    SALUTATION("Anrede"),
    FIRST_NAME("Vorname"),
    LAST_NAME("Nachname"),
    STREET("Strasse"),
    POSTAL_CODE("Plz"),
    CITY("Ort"),
    PHONE("Tel"),
    FAX("Fax"),
    MOBILE("Handy"),
    WEBSITE("Webseite"),
    DOCTOR_NUMBER("Arztnummer"),
    PRACTICE_NUMBER("Betriebsstaettennummer"),
    SPECIALTY("Fachgebiet"),
    DOCTOR_TYPE("Typ"),
    IS_ENT_DOCTOR("Ohrenarzt"),
    IS_EYE_DOCTOR("Augenarzt"),
    IS_PRIMARY_DOCTOR("Hausarzt");

    private final String jsonProperty;

    EDoctorField(String jsonProperty) {
        this.jsonProperty = jsonProperty;
    }

    @JsonValue
    public String getJsonProperty() {
        return jsonProperty;
    }

    

}