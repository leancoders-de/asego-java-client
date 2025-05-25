package de.leancoders.asego.common.model.insurance;

public enum EInsuranceField {
    UID("uid"),
    SEARCH_TERM("Suchbegriff"),
    INSTITUTION_CODE("IkNummer"),
    NAME("Name"),
    ADDITIONAL_INFO("Zusatz"),
    STREET("Strasse"),
    CITY("Ort"),
    POSTAL_CODE("Plz"),
    PHONE("Tel"),
    FAX("Fax"),
    EMAIL("Email"),
    DELETED("Geloescht");

    private final String jsonProperty;

    EInsuranceField(String jsonProperty) {
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