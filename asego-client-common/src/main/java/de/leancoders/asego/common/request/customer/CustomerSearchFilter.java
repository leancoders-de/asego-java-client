package de.leancoders.asego.common.request.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.leancoders.asego.common.request.DateTimeParameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "of")
@Data
public class CustomerSearchFilter {

    @JsonProperty("Inst")
    @Nullable
    private List<String> branch;

    @JsonProperty("SelektionsKuerzelID")
    @Nullable
    private String selectionShortcutId;

    @JsonProperty("LetzteAenderung")
    @Nullable
    private DateTimeParameter lastChange;

    @JsonProperty("Erstellungsdatum")
    @Nullable
    private DateTimeParameter creationDate;

    @JsonProperty("uid")
    @Nullable
    private UUID uid;

    @JsonProperty("Kundennummer")
    @Nullable
    private Integer customerNumber;

    @JsonProperty("AnredeID")
    @Nullable
    private String salutationId;

    @JsonProperty("TitelID")
    @Nullable
    private String titleId;

    @JsonProperty("Vorname")
    @Nullable
    private String firstName;

    @JsonProperty("Nachname")
    @Nullable
    private String lastName;

    @JsonProperty("Namenszusatz")
    @Nullable
    private String nameAddition;

    @JsonProperty("Ordensname")
    @Nullable
    private String religiousName;

    @JsonProperty("Strasse")
    @Nullable
    private String street;

    @JsonProperty("Plz")
    @Nullable
    private String postalCode;

    @JsonProperty("Ort")
    @Nullable
    private String city;

    @JsonProperty("Land")
    @Nullable
    private String country;

    @JsonProperty("Geburtsdatum")
    @Nullable
    private Date birthDate;

    @JsonProperty("Tel")
    @Nullable
    private String phone;

    @JsonProperty("Tel2")
    @Nullable
    private String phone2;

    @JsonProperty("Fax")
    @Nullable
    private String fax;

    @JsonProperty("Handy")
    @Nullable
    private String mobile;

    @JsonProperty("Email")
    @Nullable
    private String email;

    @JsonProperty("Webseite")
    @Nullable
    private String website;

    @JsonProperty("KostentraegerID")
    @Nullable
    private String insuranceCarrierId;

    @JsonProperty("IKGesundheitskarte")
    @Nullable
    private String healthCardInstituionCode;

    @JsonProperty("VersicherungsNummer")
    @Nullable
    private String insuranceNumber;

    @JsonProperty("VersicherungsStatus")
    @Nullable
    private String insuranceStatus;

    @JsonProperty("Aktenzeichen")
    @Nullable
    private String fileReference;

    @JsonProperty("GueltigBis")
    @Nullable
    private Date validUntil;

    @JsonProperty("PrivatVersichert")
    @Nullable
    private Boolean privatelyInsured;

    @JsonProperty("Beihilfe")
    @Nullable
    private Boolean aid;

    @JsonProperty("AnTaubheitGrenzend")
    @Nullable
    private Boolean borderlineDeaf;

    @JsonProperty("Zuzahlungsbefreit")
    @Nullable
    private Boolean coPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitNein")
    @Nullable
    private Boolean notCoPaymentExempt;

    @JsonProperty("ZuzahlungsbefreitBis")
    @Nullable
    private Date coPaymentExemptUntil;

    @JsonProperty("GesundheitskarteGueltigBis")
    @Nullable
    private Date healthCardValidUntil;

    @JsonProperty("Werbung")
    @Nullable
    private Boolean marketing;

    @JsonProperty("WerbungUnterschrieben")
    @Nullable
    private Boolean marketingSigned;

    @JsonProperty("WerbungTelefon")
    @Nullable
    private Boolean marketingPhone;

    @JsonProperty("WerbungPost")
    @Nullable
    private Boolean marketingMail;

    @JsonProperty("WerbungEmail")
    @Nullable
    private Boolean marketingEmail;

    @JsonProperty("WerbungKeineGewuenscht")
    @Nullable
    private Boolean noMarketingDesired;

    @JsonProperty("KeineWerbungDatum")
    @Nullable
    private Date noMarketingDate;

    @JsonProperty("GrundKeineWerbung")
    @Nullable
    private UUID reasonNoMarketing;

    @JsonProperty("DatenschutzAusgehaendigt")
    @Nullable
    private Boolean privacyPolicyHandedOut;

    @JsonProperty("DataloggingUnterschrieben")
    @Nullable
    private Boolean dataLoggingSigned;

    @JsonProperty("LetztesHoergeraetR")
    @Nullable
    private Date lastHearingAidRight;

    @JsonProperty("LetztesHoergeraetL")
    @Nullable
    private Date lastHearingAidLeft;

    @JsonProperty("LetzterBesuch")
    @Nullable
    private Date lastVisit;

    @JsonProperty("NaechsteKontrolle")
    @Nullable
    private Date nextCheckup;

    @JsonProperty("BetreuerAkustikKuerzel")
    @Nullable
    private String acousticsConsultantShortcut;

    @JsonProperty("BetreuerOptikKuerzel")
    @Nullable
    private String opticsConsultantShortcut;

    @JsonProperty("Info")
    @Nullable
    private String info;

    @JsonProperty("ZusatzInfo")
    @Nullable
    private String additionalInfo;

    @JsonProperty("NeuKundenGrundID")
    @Nullable
    private String newCustomerReasonId;

    @JsonProperty("Freifeld1")
    @Nullable
    private String customField1;

    @JsonProperty("Freifeld2")
    @Nullable
    private String customField2;

    @JsonProperty("Freifeld3")
    @Nullable
    private String customField3;

    @JsonProperty("Freifeld4")
    @Nullable
    private String customField4;

    @JsonProperty("Freifeld5")
    @Nullable
    private String customField5;

    @JsonProperty("SMSTermin")
    @Nullable
    private Boolean smsAppointment;

    @JsonProperty("SMSAuftragseingang")
    @Nullable
    private Boolean smsOrderReceipt;

    @JsonProperty("SMSMahnung")
    @Nullable
    private Boolean smsReminder;

    @JsonProperty("SMSRatenzahlung")
    @Nullable
    private Boolean smsInstallmentPayment;

    @JsonProperty("SMSKontrolle")
    @Nullable
    private Boolean smsCheckup;

    @JsonProperty("SMSWerbung")
    @Nullable
    private Boolean smsMarketing;

    @JsonProperty("SMSBestellungWE")
    @Nullable
    private Boolean smsOrderWE;

    @JsonProperty("SMSKABewilligung")
    @Nullable
    private Boolean smsKABApproval;

    @JsonProperty("SMSGeburtstag")
    @Nullable
    private Boolean smsBirthday;

    @JsonProperty("SMSKeineGewuenscht")
    @Nullable
    private Boolean smsNotDesired;

    @JsonProperty("SMSHatKeinHandy")
    @Nullable
    private Boolean smsNoMobilePhone;

    @JsonProperty("SMSBrilleAbholbereit")
    @Nullable
    private Boolean smsGlassesReadyForPickup;

    @JsonProperty("SMSWarenversand")
    @Nullable
    private Boolean smsProductShipping;

    @JsonProperty("ArtDesKunden")
    @Nullable
    private String customerType;

    @JsonProperty("ArztHNOID")
    @Nullable
    private String entDoctorId;

    @JsonProperty("ArztHausID")
    @Nullable
    private String generalPractitionerId;

    @JsonProperty("ArztAugenID")
    @Nullable
    private String ophthDoctorId;

    @JsonProperty("BetreuerID")
    @Nullable
    private String supervisorId;

    @JsonProperty("BetreuerOptikID")
    @Nullable
    private String opticsSupervisorId;

    @JsonProperty("InaktivDatum")
    @Nullable
    private Date inactiveDate;

    @JsonProperty("GrundInaktiv")
    @Nullable
    private UUID reasonInactive;

}
