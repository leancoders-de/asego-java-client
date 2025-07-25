package de.leancoders.asego.client.services;


public interface AsegoPaths {

    // https://localhost:444/v1/Kunden/Create

    String AUTH_BASE = "/auth/token";

    String AUDIOGRAM_V1_BASE = "/v1/Audiogramm/";
    String AUDIOGRAM__LIST = AUDIOGRAM_V1_BASE + "Suche/";
    String AUDIOGRAM__TONE_GET_BY_ID = AUDIOGRAM_V1_BASE + "{uuid}/Ton/";
    String AUDIOGRAM__SPEECH_GET_BY_ID = AUDIOGRAM_V1_BASE + "{uuid}/Sprache/";
    String AUDIOGRAM__GET_BY_CUSTOMER_ID = AUDIOGRAM_V1_BASE + "Kunden/{kundenUid}/";
    String AUDIOGRAM__CUSTOMER_SPEECH_CREATE = AUDIOGRAM_V1_BASE + "Kunden/{kundenUid}/Sprache/";
    String AUDIOGRAM__CUSTOMER_TONE_CREATE = AUDIOGRAM_V1_BASE + "Kunden/{kundenUid}/Ton/";

    String CUSTOMERS_V1_BASE = "/v1/Kunden/";
    String CUSTOMERS__CREATE = CUSTOMERS_V1_BASE + "Create/";
    String CUSTOMERS__UPDATE_BY_ID = CUSTOMERS_V1_BASE + "{uuid}/";
    String CUSTOMERS__LIST = CUSTOMERS_V1_BASE + "Suche/";
    String CUSTOMERS__GET_BY_ID = CUSTOMERS_V1_BASE + "{uuid}/";

    String CUSTOMERS__DOCUMENTS_SEARCH = CUSTOMERS_V1_BASE + "{kundenUid}/Dokumente/Suche/";
    String CUSTOMERS__DOCUMENTS_GET_BY_ID = CUSTOMERS_V1_BASE + "{kundenUid}/Dokumente/{dokumentUid}/";
    String CUSTOMERS__DOCUMENTS_DOCUMENT = CUSTOMERS_V1_BASE + "{kundenUid}/Dokumente/";
    String CUSTOMERS__DOCUMENTS_CREATE = CUSTOMERS_V1_BASE + "{kundenUid}/Dokumente/";

    String INSURANCE_V1_BASE = "/v1/Kostentraeger/";
    String INSURANCE__LIST = INSURANCE_V1_BASE + "Suche/";
    String INSURANCE__GET_BY_ID = INSURANCE_V1_BASE + "{uuid}/";

    String DOCTOR_V1_BASE = "/v1/Arzt/";
    String DOCTOR__LIST = DOCTOR_V1_BASE + "Suche/";
    String DOCTOR__GET_BY_ID = DOCTOR_V1_BASE + "{uuid}/";
    String DOCTOR__CREATE = DOCTOR_V1_BASE + "Create/";
    String DOCTOR__UPDATE_BY_ID = DOCTOR_V1_BASE + "{uuid}/";

    String KEYS_V1_BASE = "/v1/Keys/";
    String KEYS__COUNTRY_LIST = KEYS_V1_BASE + "Land/";
    String KEYS__SALUTATION_LIST = KEYS_V1_BASE + "Anreden/";
    String KEYS__TITLE_LIST = KEYS_V1_BASE + "Titel/";

    String DEVICES_V1_BASE = "/v1/Geraete/";
    String DEVICES__SEARCH = DEVICES_V1_BASE + "Suche/";

    String PRODUCT_V1_BASE = "/v1/Artikel/";
    String PRODUCT__SEARCH = PRODUCT_V1_BASE + "Suche/";

}
