package de.leancoders.asego.common.response.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class CustomerSearchListingItem {

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("Kundennummer")
    private Integer kundennummer;

    @JsonProperty("AnredeID")
    private String anredeID;

    @JsonProperty("TitelID")
    private String titelID;

    @JsonProperty("Vorname")
    private String vorname;

    @JsonProperty("Nachname")
    private String nachname;

    @JsonProperty("Namenszusatz")
    private String namenszusatz;

    @JsonProperty("Ordensname")
    private String ordensname;

    @JsonProperty("Strasse")
    private String strasse;

    @JsonProperty("Plz")
    private String plz;

    @JsonProperty("Ort")
    private String ort;

    @JsonProperty("Land")
    private String land;

    @JsonProperty("Geburtsdatum")
    private OffsetDateTime geburtsdatum;

    @JsonProperty("Tel")
    private String tel;

    @JsonProperty("Tel2")
    private String tel2;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Handy")
    private String handy;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Webseite")
    private String webseite;

    @JsonProperty("KostentraegerID")
    private String kostentraegerID;

    @JsonProperty("IKGesundheitskarte")
    private String ikGesundheitskarte;

    @JsonProperty("VersicherungsNummer")
    private String versicherungsNummer;

    @JsonProperty("VersicherungsStatus")
    private String versicherungsStatus;

    @JsonProperty("Aktenzeichen")
    private String aktenzeichen;

    @JsonProperty("GueltigBis")
    private OffsetDateTime gueltigBis;

    @JsonProperty("PrivatVersichert")
    private Boolean privatVersichert;

    @JsonProperty("Beihilfe")
    private Boolean beihilfe;

    @JsonProperty("AnTaubheitGrenzend")
    private Boolean anTaubheitGrenzend;

    @JsonProperty("Zuzahlungsbefreit")
    private Boolean zuzahlungsbefreit;

    @JsonProperty("ZuzahlungsbefreitNein")
    private Boolean zuzahlungsbefreitNein;

    @JsonProperty("ZuzahlungsbefreitBis")
    private OffsetDateTime zuzahlungsbefreitBis;

    @JsonProperty("GesundheitskarteGueltigBis")
    private OffsetDateTime gesundheitskarteGueltigBis;

    @JsonProperty("Erstellungsdatum")
    private OffsetDateTime erstellungsdatum;

    @JsonProperty("LetzteAenderung")
    private OffsetDateTime letzteAenderung;

    @JsonProperty("Werbung")
    private Boolean werbung;

    @JsonProperty("WerbungUnterschrieben")
    private Boolean werbungUnterschrieben;

    @JsonProperty("WerbungTelefon")
    private Boolean werbungTelefon;

    @JsonProperty("WerbungPost")
    private Boolean werbungPost;

    @JsonProperty("WerbungEmail")
    private Boolean werbungEmail;

    @JsonProperty("WerbungKeineGewuenscht")
    private Boolean werbungKeineGewuenscht;

    @JsonProperty("KeineWerbungDatum")
    private OffsetDateTime keineWerbungDatum;

    @JsonProperty("GrundKeineWerbung")
    private UUID grundKeineWerbung;

    @JsonProperty("DatenschutzAusgehaendigt")
    private Boolean datenschutzAusgehaendigt;

    @JsonProperty("DataloggingUnterschrieben")
    private Boolean dataloggingUnterschrieben;

    @JsonProperty("LetztesHoergeraetR")
    private OffsetDateTime letztesHoergeraetR;

    @JsonProperty("LetztesHoergeraetL")
    private OffsetDateTime letztesHoergeraetL;

    @JsonProperty("LetzterBesuch")
    private OffsetDateTime letzterBesuch;

    @JsonProperty("NaechsteKontrolle")
    private OffsetDateTime naechsteKontrolle;

    @JsonProperty("BetreuerAkustikKuerzel")
    private String betreuerAkustikKuerzel;

    @JsonProperty("BetreuerOptikKuerzel")
    private String betreuerOptikKuerzel;

    @JsonProperty("Info")
    private String info;

    @JsonProperty("ZusatzInfo")
    private String zusatzInfo;

    @JsonProperty("NeuKundenGrundID")
    private String neuKundenGrundID;

    @JsonProperty("Freifeld1")
    private String freifeld1;

    @JsonProperty("Freifeld2")
    private String freifeld2;

    @JsonProperty("Freifeld3")
    private String freifeld3;

    @JsonProperty("Freifeld4")
    private String freifeld4;

    @JsonProperty("Freifeld5")
    private String freifeld5;

    @JsonProperty("SMSTermin")
    private Boolean smSTermin;

    @JsonProperty("SMSAuftragseingang")
    private Boolean smSAuftragseingang;

    @JsonProperty("SMSMahnung")
    private Boolean smSMahnung;

    @JsonProperty("SMSRatenzahlung")
    private Boolean smSRatenzahlung;

    @JsonProperty("SMSKontrolle")
    private Boolean smSKontrolle;

    @JsonProperty("SMSWerbung")
    private Boolean smSWerbung;

    @JsonProperty("SMSBestellungWE")
    private Boolean smSBestellungWE;

    @JsonProperty("SMSKABewilligung")
    private Boolean smSKABewilligung;

    @JsonProperty("SMSGeburtstag")
    private Boolean smSGeburtstag;

    @JsonProperty("SMSKeineGewuenscht")
    private Boolean smSKeineGewuenscht;

    @JsonProperty("SMSHatKeinHandy")
    private Boolean smSHatKeinHandy;

    @JsonProperty("SMSBrilleAbholbereit")
    private Boolean smSBrilleAbholbereit;

    @JsonProperty("SMSWarenversand")
    private Boolean smSWarenversand;

    @JsonProperty("ArtDesKunden")
    private String artDesKunden;

    @JsonProperty("ArztHNOID")
    private String arztHNOID;

    @JsonProperty("ArztHausID")
    private String arztHausID;

    @JsonProperty("ArztAugenID")
    private String arztAugenID;

    @JsonProperty("BetreuerID")
    private String betreuerID;

    @JsonProperty("BetreuerOptikID")
    private String betreuerOptikID;

    @JsonProperty("Inst")
    private String inst;

    @JsonProperty("InaktivDatum")
    private OffsetDateTime inaktivDatum;

    @JsonProperty("GrundInaktiv")
    private UUID grundInaktiv;

}
