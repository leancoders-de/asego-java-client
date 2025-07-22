package de.leancoders.asego.common.response.product;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class ProductListItem {

    @NonNull
    @JsonProperty("uid")
    private String uid;

    @Nullable
    @JsonProperty("Suchbegriff")
    private String searchTerm;
    
    @Nullable
    @JsonProperty("Bezeichnung")
    private String designation;

    @Nullable
    @JsonProperty("HmvNr")
    private String hmvNumber;

    @Nullable
    @JsonProperty("ArtikelNr")
    private String sku;

    @Nullable
    @JsonProperty("Warengruppe")
    private String productGroup;

    @Nullable
    @JsonProperty("Klassifizierung")
    private String classification;

    @Nullable
    @JsonProperty("ArtikelGruppe")
    private String productGroupById;

    
}
