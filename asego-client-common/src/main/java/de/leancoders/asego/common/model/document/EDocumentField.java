package de.leancoders.asego.common.model.document;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EDocumentField {
    UID("uid"),
    FILE_NAME("Dateiname"),
    FILE_SIZE("DateiGroesse"),
    FILE_TYPE("DateiTyp"),
    DATE("Datum");

    private final String jsonProperty;

    EDocumentField(String jsonProperty) {
        this.jsonProperty = jsonProperty;
    }

    @JsonValue
    public String getJsonProperty() {
        return jsonProperty;
    }
}