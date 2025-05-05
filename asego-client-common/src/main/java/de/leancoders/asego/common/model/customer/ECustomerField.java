package de.leancoders.asego.common.model.customer;


public enum ECustomerField {
    UID("uid"),
    CUSTOMER_NUMBER("Kundennummer"),
    SALUTATION_ID("AnredeID"),
    TITLE_ID("TitelID"),
    FIRST_NAME("Vorname"),
    LAST_NAME("Nachname"),
    NAME_ADDITION("Namenszusatz"),
    RELIGIOUS_NAME("Ordensname"),
    STREET("Strasse"),
    POSTAL_CODE("Plz"),
    CITY("Ort"),
    COUNTRY("Land"),
    DATE_OF_BIRTH("Geburtsdatum"),
    PHONE("Tel"),
    PHONE2("Tel2"),
    FAX("Fax"),
    MOBILE("Handy"),
    EMAIL("Email"),
    WEBSITE("Webseite"),
    INSURANCE_CARRIER_ID("KostentraegerID"),
    HEALTH_CARD_INSTITUTION_CODE("IKGesundheitskarte"),
    INSURANCE_NUMBER("VersicherungsNummer"),
    INSURANCE_STATUS("VersicherungsStatus"),
    FILE_NUMBER("Aktenzeichen"),
    VALID_UNTIL("GueltigBis"),
    PRIVATELY_INSURED("PrivatVersichert"),
    SUBSIDY_ELIGIBLE("Beihilfe"),
    BORDERLINE_DEAF("AnTaubheitGrenzend"),
    CO_PAYMENT_EXEMPT("Zuzahlungsbefreit"),
    NOT_COPAYMENT_EXEMPT("ZuzahlungsbefreitNein"),
    CO_PAYMENT_EXEMPT_UNTIL("ZuzahlungsbefreitBis"),
    HEALTH_CARD_VALID_UNTIL("GesundheitskarteGueltigBis"),
    CREATION_DATE("Erstellungsdatum"),
    LAST_MODIFIED("LetzteAenderung"),
    MARKETING("Werbung"),
    MARKETING_CONSENT_SIGNED("WerbungUnterschrieben"),
    MARKETING_BY_PHONE("WerbungTelefon"),
    MARKETING_BY_MAIL("WerbungPost"),
    MARKETING_BY_EMAIL("WerbungEmail"),
    NO_MARKETING_WISHED("WerbungKeineGewuenscht"),
    NO_MARKETING_DATE("KeineWerbungDatum"),
    REASON_NO_MARKETING("GrundKeineWerbung"),
    PRIVACY_POLICY_HANDED_OVER("DatenschutzAusgehaendigt"),
    DATA_LOGGING_CONSENT_SIGNED("DataloggingUnterschrieben"),
    LAST_HEARING_AID_RIGHT("LetztesHoergeraetR"),
    LAST_HEARING_AID_LEFT("LetztesHoergeraetL"),
    LAST_VISIT("LetzterBesuch"),
    NEXT_CHECKUP("NaechsteKontrolle"),
    ACOUSTIC_CONSULTANT_ABBREVIATION("BetreuerAkustikKuerzel"),
    OPTICAL_CONSULTANT_ABBREVIATION("BetreuerOptikKuerzel"),
    INFO("Info"),
    ADDITIONAL_INFO("ZusatzInfo"),
    NEW_CUSTOMER_REASON_ID("NeuKundenGrundID"),
    CUSTOM_FIELD1("Freifeld1"),
    CUSTOM_FIELD2("Freifeld2"),
    CUSTOM_FIELD3("Freifeld3"),
    CUSTOM_FIELD4("Freifeld4"),
    CUSTOM_FIELD5("Freifeld5"),
    SMS_APPOINTMENT("SMSTermin"),
    SMS_ORDER_RECEIPT("SMSAuftragseingang"),
    SMS_REMINDER("SMSMahnung"),
    SMS_INSTALLMENT_PAYMENT("SMSRatenzahlung"),
    SMS_CHECKUP("SMSKontrolle"),
    SMS_MARKETING("SMSWerbung"),
    SMS_ORDER_WEEKEND("SMSBestellungWE"),
    SMS_INSURANCE_APPROVAL("SMSKABewilligung"),
    SMS_BIRTHDAY("SMSGeburtstag"),
    SMS_NONE_WISHED("SMSKeineGewuenscht"),
    SMS_NO_MOBILE_PHONE("SMSHatKeinHandy"),
    SMS_GLASSES_READY_FOR_PICKUP("SMSBrilleAbholbereit"),
    SMS_PRODUCT_SHIPMENT("SMSWarenversand"),
    CUSTOMER_TYPE("ArtDesKunden"),
    ENT_DOCTOR_ID("ArztHNOID"),
    GENERAL_PRACTITIONER_ID("ArztHausID"),
    OPHTH_DOCTOR_ID("ArztAugenID"),
    CONSULTANT_ID("BetreuerID"),
    OPTICAL_CONSULTANT_ID("BetreuerOptikID"),
    INSTITUTION("Inst"),
    INACTIVE_DATE("InaktivDatum"),
    REASON_INACTIVE("GrundInaktiv");

    private final String jsonProperty;

    ECustomerField(String jsonProperty) {
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