package de.leancoders.asego.common.response.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Nullable;

@Data
public class CustomerResponse {

    @NonNull
    @JsonProperty("uid")
    private String uid;

    @NonNull
    @JsonProperty("Kundennummer")
    private Integer customerNumber;

    @Nullable
    @JsonProperty("TitelID")
    private String titleId;

    @Nullable
    @JsonProperty("AnredeID")
    private String salutationId;

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

    @NonNull
    @JsonProperty("PrivatVersichert")
    private Boolean privatelyInsured;

    @NonNull
    @JsonProperty("Beihilfe")
    private Boolean subsidyEligible;

    @NonNull
    @JsonProperty("AnTaubheitGrenzend")
    private Boolean borderlineDeaf;

    @NonNull
    @JsonProperty("Zuzahlungsbefreit")
    private Boolean coPaymentExempt;

    @NonNull
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

    @Nullable
    @JsonProperty("Geburtsdatum")
    private Date dateOfBirth;

    @NonNull
    @JsonProperty("Werbung")
    private Boolean marketing;

    @NonNull
    @JsonProperty("WerbungUnterschrieben")
    private Boolean marketingConsentSigned;

    @NonNull
    @JsonProperty("WerbungTelefon")
    private Boolean marketingByPhone;

    @NonNull
    @JsonProperty("WerbungPost")
    private Boolean marketingByMail;

    @NonNull
    @JsonProperty("WerbungEmail")
    private Boolean marketingByEmail;

    @NonNull
    @JsonProperty("WerbungKeineGewuenscht")
    private Boolean noMarketingWished;

    @Nullable
    @JsonProperty("KeineWerbungDatum")
    private Date noMarketingDate;

    @Nullable
    @JsonProperty("GrundKeineWerbung")
    private UUID reasonNoMarketing;

    @NonNull
    @JsonProperty("DatenschutzAusgehaendigt")
    private Boolean privacyPolicyHandedOver;

    @NonNull
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
    @JsonProperty("BetreuerAkustikBenutzerID")
    private String acousticConsultantUserId;

    @Nullable
    @JsonProperty("BetreuerOptikKuerzel")
    private String opticalConsultantAbbreviation;

    @Nullable
    @JsonProperty("BetreuerOptikBenutzerID")
    private String opticalConsultantUserId;

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

    @NonNull
    @JsonProperty("SMSTermin")
    private Boolean smsAppointment;

    @NonNull
    @JsonProperty("SMSAuftragseingang")
    private Boolean smsOrderReceipt;

    @NonNull
    @JsonProperty("SMSMahnung")
    private Boolean smsReminder;

    @NonNull
    @JsonProperty("SMSRatenzahlung")
    private Boolean smsInstallmentPayment;

    @NonNull
    @JsonProperty("SMSKontrolle")
    private Boolean smsCheckup;

    @NonNull
    @JsonProperty("SMSWerbung")
    private Boolean smsMarketing;

    @NonNull
    @JsonProperty("SMSBestellungWE")
    private Boolean smsOrderWeekend;

    @NonNull
    @JsonProperty("SMSKABewilligung")
    private Boolean smsInsuranceApproval;

    @NonNull
    @JsonProperty("SMSGeburtstag")
    private Boolean smsBirthday;

    @NonNull
    @JsonProperty("SMSKeineGewuenscht")
    private Boolean smsNoneWished;

    @NonNull
    @JsonProperty("SMSHatKeinHandy")
    private Boolean smsNoMobilePhonePhone;

    @NonNull
    @JsonProperty("SMSBrilleAbholbereit")
    private Boolean smsGlassesReadyForPickup;

    @NonNull
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
    @JsonProperty("Inst")
    private String institution;

    @Nullable
    @JsonProperty("InaktivDatum")
    private Date inactiveDate;

    @Nullable
    @JsonProperty("GrundInaktiv")
    private UUID reasonInactive;

    @Nullable
    @JsonProperty("NaechsterTerminDatum")
    private Date nextAppointmentDate;

    @Nullable
    @JsonProperty("NaechsterTerminID")
    private UUID nextAppointmentId;
}
