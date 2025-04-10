package de.leancoders.asego.client.services;

public interface AsegoPaths {

    // https://localhost:444/v1/Kunden/Create

    String AUTH_BASE = "/auth/token";

    String AUDIOGRAM_V1_BASE = "/v1/Audiogramm/";
    String AUDIOGRAM__LIST = AUDIOGRAM_V1_BASE + "Suche/";
    String AUDIOGRAM__CUSTOMER_SPEECH_CREATE = AUDIOGRAM_V1_BASE + "Kunden/{kundenUid}/Sprache/";
    String AUDIOGRAM__CUSTOMER_TONE_CREATE = AUDIOGRAM_V1_BASE + "Kunden/{kundenUid}/Ton/";

    String CUSTOMERS_V1_BASE = "/v1/Kunden/";
    String CUSTOMERS__CREATE = CUSTOMERS_V1_BASE + "Create/";
    String CUSTOMERS__UPDATE_BY_ID = CUSTOMERS_V1_BASE + "{uuid}/";
    String CUSTOMERS__LIST = CUSTOMERS_V1_BASE + "Suche/";
    String CUSTOMERS__GET_BY_ID = CUSTOMERS_V1_BASE + "{uuid}/";


}
