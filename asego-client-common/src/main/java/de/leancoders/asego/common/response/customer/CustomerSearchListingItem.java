package de.leancoders.asego.common.response.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Date;
import java.util.UUID;

@Data
public class CustomerSearchListingItem {

    @Nonnull
    @JsonProperty("uid")
    private String uid;

    @Nonnull
    @JsonProperty("Kundennummer")
    private Integer customerNumber;

    @Nullable
    @JsonProperty("AnredeID")
    private String salutationId;

    @Nullable
    @JsonProperty("TitelID")
    private String titleId;

    @Nullable
    @JsonProperty("Vorname")
    private String firstName;

    @Nullable
    @JsonProperty("Nachname")
    private String lastName;

    @Nullable
    @JsonProperty("Namenszusatz")
    private String nameAddition;

    @Nullable
    @JsonProperty("Ordensname")
    private String religiousName;

    @Nullable
    @JsonProperty("Strasse")
    private String street;

    @Nullable
    @JsonProperty("Plz")
    private String postalCode;

    @Nullable
    @JsonProperty("Ort")
    private String city;

    @Nullable
    @JsonProperty("Land")
    private String country;

    @Nullable
    @JsonProperty("Geburtsdatum")
    private Date dateOfBirth;

    @Nullable
    @JsonProperty("Tel")
    private String phone;

    @Nullable
    @JsonProperty("Tel2")
    private String phone2;

    @Nullable
    @JsonProperty("Fax")
    private String fax;

    @Nullable
    @JsonProperty("Handy")
    private String mobile;

    @Nullable
    @JsonProperty("Email")
    private String email;

    @Nullable
    @JsonProperty("Webseite")
    private String website;

    @Nullable
    @JsonProperty("KostentraegerID")
    private String insuranceCarrierId;

    @Nullable
    @JsonProperty("IKGesundheitskarte")
    private String healthCardInstitutionCode;

    @Nullable
    @JsonProperty("VersicherungsNummer")
    private String insuranceNumber;

    @Nullable
    @JsonProperty("VersicherungsStatus")
    private String insuranceStatus;

    @Nullable
    @JsonProperty("Aktenzeichen")
    private String fileNumber;

    @Nullable
    @JsonProperty("GueltigBis")
    private Date validUntil;

    @Nonnull
    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @Nonnull
    @JsonProperty("Beihilfe")
    private Boolean subsidyEligible;

    @Nonnull
    @JsonProperty("AnTaubheitGrenzend")
    private Boolean borderlineDeaf;

    @Nonnull
    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @Nonnull
    @JsonProperty("ZuzahlungsbefreitNein")
    private Boolean notCopaymentExempt;

    @Nullable
    @JsonProperty("ZuzahlungsbefreitBis")
    private Date coPaymentExemptUntil;

    @Nullable
    @JsonProperty("GesundheitskarteGueltigBis")
    private Date healthCardValidUntil;

    @Nullable
    @JsonProperty("Erstellungsdatum")
    private Date creationDate;

    @Nullable
    @JsonProperty("LetzteAenderung")
    private Date lastModified;

    @Nonnull
    @JsonProperty("Werbung")
    private Boolean marketing;

    @Nonnull
    @JsonProperty("WerbungUnterschrieben")
    private Boolean marketingConsentSigned;

    @Nonnull
    @JsonProperty("WerbungTelefon")
    private Boolean marketingByPhone;

    @Nonnull
    @JsonProperty("WerbungPost")
    private Boolean marketingByMail;

    @Nonnull
    @JsonProperty("WerbungEmail")
    private Boolean marketingByEmail;

    @Nonnull
    @JsonProperty("WerbungKeineGewuenscht")
    private Boolean noMarketingWished;

    @Nullable
    @JsonProperty("KeineWerbungDatum")
    private Date noMarketingDate;

    @Nullable
    @JsonProperty("GrundKeineWerbung")
    private UUID reasonNoMarketing;

    @Nonnull
    @JsonProperty("DatenschutzAusgehaendigt")
    private Boolean privacyPolicyHandedOver;

    @Nonnull
    @JsonProperty("DataloggingUnterschrieben")
    private Boolean dataLoggingConsentSigned;

    @Nullable
    @JsonProperty("LetztesHoergeraetR")
    private Date lastHearingAidRight;

    @Nullable
    @JsonProperty("LetztesHoergeraetL")
    private Date lastHearingAidLeft;

    @Nullable
    @JsonProperty("LetzterBesuch")
    private Date lastVisit;

    @Nullable
    @JsonProperty("NaechsteKontrolle")
    private Date nextCheckup;

    @Nullable
    @JsonProperty("BetreuerAkustikKuerzel")
    private String acousticConsultantAbbreviation;

    @Nullable
    @JsonProperty("BetreuerOptikKuerzel")
    private String opticalConsultantAbbreviation;

    @Nullable
    @JsonProperty("Info")
    private String info;

    @Nullable
    @JsonProperty("ZusatzInfo")
    private String additionalInfo;

    @Nullable
    @JsonProperty("NeuKundenGrundID")
    private String newCustomerReasonId;

    @Nullable
    @JsonProperty("Freifeld1")
    private String customField1;

    @Nullable
    @JsonProperty("Freifeld2")
    private String customField2;

    @Nullable
    @JsonProperty("Freifeld3")
    private String customField3;

    @Nullable
    @JsonProperty("Freifeld4")
    private String customField4;

    @Nullable
    @JsonProperty("Freifeld5")
    private String customField5;

    @Nonnull
    @JsonProperty("SMSTermin")
    private Boolean smsAppointment;

    @Nonnull
    @JsonProperty("SMSAuftragseingang")
    private Boolean smsOrderReceipt;

    @Nonnull
    @JsonProperty("SMSMahnung")
    private Boolean smsReminder;

    @Nonnull
    @JsonProperty("SMSRatenzahlung")
    private Boolean smsInstallmentPayment;

    @Nonnull
    @JsonProperty("SMSKontrolle")
    private Boolean smsCheckup;

    @Nonnull
    @JsonProperty("SMSWerbung")
    private Boolean smsMarketing;

    @Nonnull
    @JsonProperty("SMSBestellungWE")
    private Boolean smsOrderWeekend;

    @Nonnull
    @JsonProperty("SMSKABewilligung")
    private Boolean smsInsuranceApproval;

    @Nonnull
    @JsonProperty("SMSGeburtstag")
    private Boolean smsBirthday;

    @Nonnull
    @JsonProperty("SMSKeineGewuenscht")
    private Boolean smsNoneWished;

    @Nonnull
    @JsonProperty("SMSHatKeinHandy")
    private Boolean smsNoMobilePhonePhone;

    @Nonnull
    @JsonProperty("SMSBrilleAbholbereit")
    private Boolean smsGlassesReadyForPickup;

    @Nonnull
    @JsonProperty("SMSWarenversand")
    private Boolean smsProductShipment;

    @Nullable
    @JsonProperty("ArtDesKunden")
    private String customerType;

    @Nullable
    @JsonProperty("ArztHNOID")
    private String entDoctorId;

    @Nullable
    @JsonProperty("ArztHausID")
    private String generalPractitionerId;

    @Nullable
    @JsonProperty("ArztAugenID")
    private String ophthDoctorId;

    @Nullable
    @JsonProperty("BetreuerID")
    private String consultantId;

    @Nullable
    @JsonProperty("BetreuerOptikID")
    private String opticalConsultantId;

    @Nullable
    @JsonProperty("Inst")
    private String institution;

    @Nullable
    @JsonProperty("InaktivDatum")
    private Date inactiveDate;

    @Nullable
    @JsonProperty("GrundInaktiv")
    private UUID reasonInactive;
}
