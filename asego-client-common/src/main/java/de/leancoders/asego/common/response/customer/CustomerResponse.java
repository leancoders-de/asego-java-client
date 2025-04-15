package de.leancoders.asego.common.response.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CustomerResponse {

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Kundennummer")
    private Integer customerNumber;

    @JsonProperty("TitelID")
    private String titleId;

    @JsonProperty("AnredeID")
    private String salutationId;

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
    private String healthCardInstitutionCode;

    @JsonProperty("VersicherungsNummer")
    private String insuranceNumber;

    @JsonProperty("VersicherungsStatus")
    private String insuranceStatus;

    @JsonProperty("Aktenzeichen")
    private String fileNumber;

    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @JsonProperty("Beihilfe")
    private Boolean subsidyEligible;

    @JsonProperty("AnTaubheitGrenzend")
    private Boolean borderlineDeaf;

    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitNein")
    private Boolean notCopaymentExempt;

    @JsonProperty("ZuzahlungsbefreitBis")
    private Date coPaymentExemptUntil;

    @JsonProperty("GesundheitskarteGueltigBis")
    private Date healthCardValidUntil;

    @JsonProperty("Erstellungsdatum")
    private Date creationDate;

    @JsonProperty("LetzteAenderung")
    private Date lastModified;

    @JsonProperty("Geburtsdatum")
    private Date dateOfBirth;

    @JsonProperty("Werbung")
    private Boolean marketing;

    @JsonProperty("WerbungUnterschrieben")
    private Boolean marketingConsentSigned;

    @JsonProperty("WerbungTelefon")
    private Boolean marketingByPhone;

    @JsonProperty("WerbungPost")
    private Boolean marketingByMail;

    @JsonProperty("WerbungEmail")
    private Boolean marketingByEmail;

    @JsonProperty("WerbungKeineGewuenscht")
    private Boolean noMarketingWished;

    @JsonProperty("KeineWerbungDatum")
    private Date noMarketingDate;

    @JsonProperty("GrundKeineWerbung")
    private UUID reasonNoMarketing;

    @JsonProperty("DatenschutzAusgehaendigt")
    private Boolean privacyPolicyHandedOver;

    @JsonProperty("DataloggingUnterschrieben")
    private Boolean dataLoggingConsentSigned;

    @JsonProperty("LetztesHoergeraetR")
    private Date lastHearingAidRight;

    @JsonProperty("LetztesHoergeraetL")
    private Date lastHearingAidLeft;

    @JsonProperty("LetzterBesuch")
    private Date lastVisit;

    @JsonProperty("NaechsteKontrolle")
    private Date nextCheckup;

    @JsonProperty("BetreuerAkustikKuerzel")
    private String acousticConsultantAbbreviation;

    @JsonProperty("BetreuerAkustikBenutzerID")
    private String acousticConsultantUserId;

    @JsonProperty("BetreuerOptikKuerzel")
    private String opticalConsultantAbbreviation;

    @JsonProperty("BetreuerOptikBenutzerID")
    private String opticalConsultantUserId;

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
    private Boolean smsOrderWeekend;

    @JsonProperty("SMSKABewilligung")
    private Boolean smsInsuranceApproval;

    @JsonProperty("SMSGeburtstag")
    private Boolean smsBirthday;

    @JsonProperty("SMSKeineGewuenscht")
    private Boolean smsNoneWished;

    @JsonProperty("SMSHatKeinHandy")
    private Boolean smsNoMobilePhonePhone;

    @JsonProperty("SMSBrilleAbholbereit")
    private Boolean smsGlassesReadyForPickup;

    @JsonProperty("SMSWarenversand")
    private Boolean smsProductShipment;

    @JsonProperty("ArtDesKunden")
    private String customerType;

    @JsonProperty("ArztHNOID")
    private String entDoctorId;

    @JsonProperty("ArztHausID")
    private String generalPractitionerId;

    @JsonProperty("ArztAugenID")
    private String ophthDoctorId;

    @JsonProperty("Inst")
    private String institution;

    @JsonProperty("InaktivDatum")
    private Date inactiveDate;

    @JsonProperty("GrundInaktiv")
    private UUID reasonInactive;

    @JsonProperty("NaechsterTerminDatum")
    private Date nextAppointmentDate;

    @JsonProperty("NaechsterTerminID")
    private UUID nextAppointmentId;
}
