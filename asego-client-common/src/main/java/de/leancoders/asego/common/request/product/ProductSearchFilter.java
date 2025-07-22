package de.leancoders.asego.common.request.product;

import java.util.List;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor(staticName = "of")
@Data
public class ProductSearchFilter {

    @JsonProperty("AuchGeloeschteUndInaktive")
    private Boolean includeDeletedAndInactive;

    @JsonProperty("Inst")
    private List<String> branches;

    @JsonProperty("ArtikelAttribute")
    private List<String> articleAttributes;

    @JsonProperty("Warengruppe")
    private List<String> productGroups;

    @JsonProperty("Klassifizierung")
    private List<String> classifications;

    @JsonProperty("ArtikelGruppe")
    private List<String> productGroupsById;

    @Nullable
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
}