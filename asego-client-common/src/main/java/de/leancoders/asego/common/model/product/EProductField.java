package de.leancoders.asego.common.model.product;

// AsegoApi.Artikel.Models.ListArtikelV1 {
// uid (string): Eindeutige ID des Artikels ,
// Suchbegriff (string, optional): Suchbegriff des Artikel ,
// Bezeichnung (string, optional): Bezeichnung des Artikels ,
// HmvNr (string, optional): HMV Nr des Artikels ,
// ArtikelNr (string, optional): ArtikelNr ,
// Warengruppe (string, optional): ID der Warengruppe (/v1/Keys/Warengruppen) ,
// Klassifizierung (string, optional),
// ArtikelGruppe (string, optional)
// }

public enum EProductField {
    UID("uid"),
    SEARCH_TERM("Suchbegriff"),
    DESIGNATION("Bezeichnung"),
    HMV_NUMBER("HmvNr"),
    SKU("ArtikelNr"),
    PRODUCT_GROUP_ID("Warengruppe"),
    CLASSIFICATION("Klassifizierung"),
    PRODUCT_GROUP("ArtikelGruppe");

    private final String jsonProperty;

    EProductField(String jsonProperty) {
        this.jsonProperty = jsonProperty;
    }

    public String getJsonProperty() {
        return jsonProperty;
    }
}
