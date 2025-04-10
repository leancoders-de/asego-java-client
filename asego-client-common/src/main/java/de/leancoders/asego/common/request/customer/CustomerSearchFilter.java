package de.leancoders.asego.common.request.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.leancoders.asego.common.request.DateTimeParameter;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class CustomerSearchFilter {

    @JsonProperty("Inst")
    private List<String> branch;

    @JsonProperty("SelektionsKuerzelID")
    private String selectionShortcutID;

    @JsonProperty("LetzteAenderung")
    private DateTimeParameter lastChange;

    @JsonProperty("Erstellungsdatum")
    private DateTimeParameter creationDate;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Kundennummer")
    private Integer customerNumber;

    @JsonProperty("AnredeID")
    private String salutationID;

    @JsonProperty("TitelID")
    private String titleID;

    @JsonProperty("Vorname")
    private String firstName;

    @JsonProperty("Nachname")
    private String lastName;

    @JsonProperty("Namenszusatz")
    private String nameAddition;

    @JsonProperty("Ordensname")
    private String religiousName;

    @JsonProperty("Strasse")
    private String street;

    @JsonProperty("Plz")
    private String postalCode;

    @JsonProperty("Ort")
    private String city;

    @JsonProperty("Land")
    private String country;

    @JsonProperty("Geburtsdatum")
    private OffsetDateTime birthDate;

    @JsonProperty("Tel")
    private String phone;

    @JsonProperty("Tel2")
    private String phone2;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Handy")
    private String mobile;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Webseite")
    private String website;

    @JsonProperty("KostentraegerID")
    private String insuranceCarrierID;

    @JsonProperty("IKGesundheitskarte")
    private String healthCardIK;

    @JsonProperty("VersicherungsNummer")
    private String insuranceNumber;

    @JsonProperty("VersicherungsStatus")
    private String insuranceStatus;

    @JsonProperty("Aktenzeichen")
    private String fileReference;

    @JsonProperty("GueltigBis")
    private OffsetDateTime validUntil;

    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @JsonProperty("Beihilfe")
    private Boolean aid;

    @JsonProperty("AnTaubheitGrenzend")
    private Boolean borderingDeafness;

    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitNein")
    private Boolean notCoPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitBis")
    private OffsetDateTime coPaymentExemptUntil;

    @JsonProperty("GesundheitskarteGueltigBis")
    private OffsetDateTime healthCardValidUntil;

    @JsonProperty("Werbung")
    private Boolean advertising;

    @JsonProperty("WerbungUnterschrieben")
    private Boolean advertisingSigned;

    @JsonProperty("WerbungTelefon")
    private Boolean advertisingPhone;

    @JsonProperty("WerbungPost")
    private Boolean advertisingMail;

    @JsonProperty("WerbungEmail")
    private Boolean advertisingEmail;

    @JsonProperty("WerbungKeineGewuenscht")
    private Boolean noAdvertisingDesired;

    @JsonProperty("KeineWerbungDatum")
    private OffsetDateTime noAdvertisingDate;

    @JsonProperty("GrundKeineWerbung")
    private UUID reasonNoAdvertising;

    @JsonProperty("DatenschutzAusgehaendigt")
    private Boolean privacyPolicyHandedOut;

    @JsonProperty("DataloggingUnterschrieben")
    private Boolean dataLoggingSigned;

    @JsonProperty("LetztesHoergeraetR")
    private OffsetDateTime lastHearingAidRight;

    @JsonProperty("LetztesHoergeraetL")
    private OffsetDateTime lastHearingAidLeft;

    @JsonProperty("LetzterBesuch")
    private OffsetDateTime lastVisit;

    @JsonProperty("NaechsteKontrolle")
    private OffsetDateTime nextControl;

    @JsonProperty("BetreuerAkustikKuerzel")
    private String acousticsConsultantShortcut;

    @JsonProperty("BetreuerOptikKuerzel")
    private String opticsConsultantShortcut;

    @JsonProperty("Info")
    private String info;

    @JsonProperty("ZusatzInfo")
    private String additionalInfo;

    @JsonProperty("NeuKundenGrundID")
    private String newCustomerReasonID;

    @JsonProperty("Freifeld1")
    private String freeField1;

    @JsonProperty("Freifeld2")
    private String freeField2;

    @JsonProperty("Freifeld3")
    private String freeField3;

    @JsonProperty("Freifeld4")
    private String freeField4;

    @JsonProperty("Freifeld5")
    private String freeField5;

    @JsonProperty("SMSTermin")
    private Boolean smsAppointment;

    @JsonProperty("SMSAuftragseingang")
    private Boolean smsOrderReceipt;

    @JsonProperty("SMSMahnung")
    private Boolean smsReminder;

    @JsonProperty("SMSRatenzahlung")
    private Boolean smsInstallmentPayment;

    @JsonProperty("SMSKontrolle")
    private Boolean smsControl;

    @JsonProperty("SMSWerbung")
    private Boolean smsAdvertising;

    @JsonProperty("SMSBestellungWE")
    private Boolean smsOrderWE;

    @JsonProperty("SMSKABewilligung")
    private Boolean smsKABApproval;

    @JsonProperty("SMSGeburtstag")
    private Boolean smsBirthday;

    @JsonProperty("SMSKeineGewuenscht")
    private Boolean smsNotDesired;

    @JsonProperty("SMSHatKeinHandy")
    private Boolean smsNoMobile;

    @JsonProperty("SMSBrilleAbholbereit")
    private Boolean smsGlassesReadyForPickup;

    @JsonProperty("SMSWarenversand")
    private Boolean smsGoodsShipping;

    @JsonProperty("ArtDesKunden")
    private String customerType;

    @JsonProperty("ArztHNOID")
    private String entDoctorID;

    @JsonProperty("ArztHausID")
    private String generalPractitionerID;

    @JsonProperty("ArztAugenID")
    private String eyeDoctorID;

    @JsonProperty("BetreuerID")
    private String supervisorID;

    @JsonProperty("BetreuerOptikID")
    private String opticsSupervisorID;

    @JsonProperty("InaktivDatum")
    private OffsetDateTime inactiveDate;

    @JsonProperty("GrundInaktiv")
    private UUID reasonInactive;

}
