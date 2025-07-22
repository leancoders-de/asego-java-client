package de.leancoders.asego.common.response.device;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.leancoders.asego.common.model.device.EDeviceEarSide;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class DeviceListItem {

    @NonNull
    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Suchbegriff")
    private String searchTerm;

    @JsonProperty("Bezeichnung")
    private String designation;

    @JsonProperty("LieferantenID")
    private String supplierId;

    @JsonProperty("KundenID")
    private String customerId;

    @JsonProperty("ArtikelID")
    private String articleId;

    @JsonProperty("Seriennummer")
    private String serialNumber;

    @JsonProperty("Modulnummer")
    private String moduleNumber;

    @JsonProperty("WareneingangsNummer")
    private String goodsReceiptNumber;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("LagerStatus")
    private String storageStatus;

    @JsonProperty("Datum")
    private String date;

    @JsonProperty("LieferscheinDatum")
    private String deliveryNoteDate;

    @JsonProperty("LieferscheinNr")
    private String deliveryNoteNumber;

    @JsonProperty("EkPreis")
    private Double purchasePrice;

    @JsonProperty("Inventurwert")
    private Double inventoryValue;

    @JsonProperty("OhrSeite")
    private EDeviceEarSide earSide;

    @JsonProperty("Batterietyp")
    private String batteryType;

    @JsonProperty("Farbe")
    private String color;

    @JsonProperty("RueckgabeBis")
    private String returnBy;

    @JsonProperty("FremdGeraet")
    private Boolean foreignDevice;

    @JsonProperty("WareneingangAm")
    private String goodsReceiptDate;

    @JsonProperty("ReserviertZentrale")
    private Boolean reservedCentral;

    @JsonProperty("Reserviert")
    private Boolean reserved;

    @JsonProperty("ReserviertSeit")
    private String reservedSince;

    @JsonProperty("ReserviertKundenID")
    private String reservedCustomerId;

    @JsonProperty("ReserviertDurchKuerzel")
    private String reservedByInitials;

    @JsonProperty("ReserviertDurchBenutzerID")
    private String reservedByUserId;

    @JsonProperty("HmvNummer")
    private String hmvNumber;

    @JsonProperty("GeraeteWarengruppenID")
    private String deviceGroupId;

        
}
