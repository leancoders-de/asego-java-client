package de.leancoders.asego.common.request.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.leancoders.asego.common.request.DateTimeParameter;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class CustomerSearchFilter {

    @JsonProperty("Inst")
    private List<String> branch;

    @JsonProperty("SelektionsKuerzelID")
    private String selectionShortcutId;

    @JsonProperty("LetzteAenderung")
    private DateTimeParameter lastChange;

    @JsonProperty("Erstellungsdatum")
    private DateTimeParameter creationDate;

    @JsonProperty("uid")
    private UUID uid;

    @JsonProperty("Kundennummer")
    private Integer customerNumber;

    @JsonProperty("AnredeID")
    private String salutationId;

    @JsonProperty("TitelID")
    private String titleId;

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
    private Date birthDate;

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
    private String insuranceCarrierId;

    @JsonProperty("IKGesundheitskarte")
    private String healthCardInstituionCode;

    @JsonProperty("VersicherungsNummer")
    private String insuranceNumber;

    @JsonProperty("VersicherungsStatus")
    private String insuranceStatus;

    @JsonProperty("Aktenzeichen")
    private String fileReference;

    @JsonProperty("GueltigBis")
    private Date validUntil;

    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @JsonProperty("Beihilfe")
    private Boolean aid;

    @JsonProperty("AnTaubheitGrenzend")
    private Boolean borderlineDeaf;

    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitNein")
    private Boolean notCoPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitBis")
    private Date coPaymentExemptUntil;

    @JsonProperty("GesundheitskarteGueltigBis")
    private Date healthCardValidUntil;

    @JsonProperty("Werbung")
    private Boolean marketing;

    @JsonProperty("WerbungUnterschrieben")
    private Boolean marketingSigned;

    @JsonProperty("WerbungTelefon")
    private Boolean marketingPhone;

    @JsonProperty("WerbungPost")
    private Boolean marketingMail;

    @JsonProperty("WerbungEmail")
    private Boolean marketingEmail;

    @JsonProperty("WerbungKeineGewuenscht")
    private Boolean noMarketingDesired;

    @JsonProperty("KeineWerbungDatum")
    private Date noMarketingDate;

    @JsonProperty("GrundKeineWerbung")
    private UUID reasonNoMarketing;

    @JsonProperty("DatenschutzAusgehaendigt")
    private Boolean privacyPolicyHandedOut;

    @JsonProperty("DataloggingUnterschrieben")
    private Boolean dataLoggingSigned;

    @JsonProperty("LetztesHoergeraetR")
    private Date lastHearingAidRight;

    @JsonProperty("LetztesHoergeraetL")
    private Date lastHearingAidLeft;

    @JsonProperty("LetzterBesuch")
    private Date lastVisit;

    @JsonProperty("NaechsteKontrolle")
    private Date nextCheckup;

    @JsonProperty("BetreuerAkustikKuerzel")
    private String acousticsConsultantShortcut;

    @JsonProperty("BetreuerOptikKuerzel")
    private String opticsConsultantShortcut;

    @JsonProperty("Info")
    private String info;

    @JsonProperty("ZusatzInfo")
    private String additionalInfo;

    @JsonProperty("NeuKundenGrundID")
    private String newCustomerReasonId;

    @JsonProperty("Freifeld1")
    private String customField1;

    @JsonProperty("Freifeld2")
    private String customField2;

    @JsonProperty("Freifeld3")
    private String customField3;

    @JsonProperty("Freifeld4")
    private String customField4;

    @JsonProperty("Freifeld5")
    private String customField5;

    @JsonProperty("SMSTermin")
    private Boolean smsAppointment;

    @JsonProperty("SMSAuftragseingang")
    private Boolean smsOrderReceipt;

    @JsonProperty("SMSMahnung")
    private Boolean smsReminder;

    @JsonProperty("SMSRatenzahlung")
    private Boolean smsInstallmentPayment;

    @JsonProperty("SMSKontrolle")
    private Boolean smsCheckup;

    @JsonProperty("SMSWerbung")
    private Boolean smsMarketing;

    @JsonProperty("SMSBestellungWE")
    private Boolean smsOrderWE;

    @JsonProperty("SMSKABewilligung")
    private Boolean smsKABApproval;

    @JsonProperty("SMSGeburtstag")
    private Boolean smsBirthday;

    @JsonProperty("SMSKeineGewuenscht")
    private Boolean smsNotDesired;

    @JsonProperty("SMSHatKeinHandy")
    private Boolean smsNoMobilePhone;

    @JsonProperty("SMSBrilleAbholbereit")
    private Boolean smsGlassesReadyForPickup;

    @JsonProperty("SMSWarenversand")
    private Boolean smsProductShipping;

    @JsonProperty("ArtDesKunden")
    private String customerType;

    @JsonProperty("ArztHNOID")
    private String entDoctorId;

    @JsonProperty("ArztHausID")
    private String generalPractitionerId;

    @JsonProperty("ArztAugenID")
    private String ophthDoctorId;

    @JsonProperty("BetreuerID")
    private String supervisorId;

    @JsonProperty("BetreuerOptikID")
    private String opticsSupervisorId;

    @JsonProperty("InaktivDatum")
    private Date inactiveDate;

    @JsonProperty("GrundInaktiv")
    private UUID reasonInactive;

}
