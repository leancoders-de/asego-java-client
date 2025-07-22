package de.leancoders.asego.common.request.device;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor(staticName = "of")
@Data
public class DeviceSearchFilter {

    @Nullable
    @JsonProperty("Datum")
    private String date;

    @Nullable
    @JsonProperty("LieferscheinDatum")
    private String deliveryNoteDate;

    @Nullable
    @JsonProperty("RueckgabeBis")
    private String returnBy;

    @Nullable
    @JsonProperty("ReserviertSeit")
    private String reservedSince;

    @Nullable
    @JsonProperty("WareneingangAm")
    private String goodsReceiptDate;

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
    @JsonProperty("LieferantenID")
    private String supplierId;

    @Nullable
    @JsonProperty("KundenID")
    private String customerId;

    @Nullable
    @JsonProperty("ArtikelID")
    private String articleId;

    @Nullable
    @JsonProperty("Seriennummer")
    private String serialNumber;

    @Nullable
    @JsonProperty("Modulnummer")
    private String moduleNumber;

    @Nullable
    @JsonProperty("WareneingangsNummer")
    private String goodsReceiptNumber;

    @Nullable
    @JsonProperty("Status")
    private String status;

    @Nullable
    @JsonProperty("LagerStatus")
    private String storageStatus;

    @Nullable
    @JsonProperty("LieferscheinNr")
    private String deliveryNoteNumber;

    @Nullable
    @JsonProperty("EkPreis")
    private Double purchasePrice;

    @Nullable
    @JsonProperty("Inventurwert")
    private Double inventoryValue;

    @Nullable
    @JsonProperty("OhrSeite")
    private String earSide;

    @Nullable
    @JsonProperty("Batterietyp")
    private String batteryType;

    @Nullable
    @JsonProperty("Farbe")
    private String color;

    @Nullable
    @JsonProperty("FremdGeraet")
    private Boolean foreignDevice;

    @Nullable
    @JsonProperty("ReserviertZentrale")
    private Boolean reservedCentral;

    @Nullable
    @JsonProperty("Reserviert")
    private Boolean reserved;

    @Nullable
    @JsonProperty("ReserviertKundenID")
    private String reservedCustomerId;

    @Nullable
    @JsonProperty("ReserviertDurchKuerzel")
    private String reservedByInitials;

    @Nullable
    @JsonProperty("ReserviertDurchBenutzerID")
    private String reservedByUserId;

    @Nullable
    @JsonProperty("HmvNummer")
    private String hmvNumber;

    @Nullable
    @JsonProperty("GeraeteWarengruppenID")
    private String deviceGroupId;
    
}
