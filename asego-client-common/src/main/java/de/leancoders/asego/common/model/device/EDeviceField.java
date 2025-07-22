package de.leancoders.asego.common.model.device;

public enum EDeviceField {
    UID("uid"),
    SEARCH_TERM("Suchbegriff"),
    DESIGNATION("Bezeichnung"),
    SUPPLIER_ID("LieferantenID"),
    CUSTOMER_ID("KundenID"),
    ARTICLE_ID("ArtikelID"),
    SERIAL_NUMBER("Seriennummer"),
    MODULE_NUMBER("Modulnummer"),
    GOODS_RECEIPT_NUMBER("WareneingangsNummer"),
    STATUS("Status"),
    STORAGE_STATUS("LagerStatus"),
    DATE("Datum"),
    DELIVERY_NOTE_DATE("LieferscheinDatum"),
    DELIVERY_NOTE_NUMBER("LieferscheinNr"),
    PURCHASE_PRICE("EkPreis"),
    INVENTORY_VALUE("Inventurwert"),
    EAR_SIDE("OhrSeite"),
    BATTERY_TYPE("Batterietyp"),
    COLOR("Farbe"),
    RETURN_BY("RueckgabeBis"),
    FOREIGN_DEVICE("FremdGeraet"),
    GOODS_RECEIPT_DATE("WareneingangAm"),
    RESERVED_CENTRAL("ReserviertZentrale"),
    RESERVED("Reserviert"),
    RESERVED_SINCE("ReserviertSeit"),
    RESERVED_CUSTOMER_ID("ReserviertKundenID"),
    RESERVED_BY_INITIALS("ReserviertDurchKuerzel"),
    RESERVED_BY_USER_ID("ReserviertDurchBenutzerID"),
    HMV_NUMBER("HmvNummer"),
    DEVICE_GROUP_ID("GeraeteWarengruppenID");

    private final String jsonProperty;

    EDeviceField(String jsonProperty) {
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