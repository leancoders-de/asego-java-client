package de.leancoders.asego.common.model.audiogram;

public enum EAudiogramField {
    DATE("Datum"),
    DESCRIPTION("Beschreibung"),
    UID("uid"),
    TONE("Tone"),
    SPEECH("Speech");

    private final String jsonProperty;

    EAudiogramField(String jsonProperty) {
        this.jsonProperty = jsonProperty;
    }

    
    public String getJsonProperty() {
        return jsonProperty;
    }

    @Override
    public String toString() {
        return jsonProperty;
    }
}