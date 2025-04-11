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
    private Integer kundennummer;

    @JsonProperty("TitelID")
    private String titelID;

    @JsonProperty("AnredeID")
    private String anredeID;

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
    private Date zuzahlungsbefreitBis;

    @JsonProperty("GesundheitskarteGueltigBis")
    private Date gesundheitskarteGueltigBis;

    @JsonProperty("Erstellungsdatum")
    private Date erstellungsdatum;

    @JsonProperty("LetzteAenderung")
    private Date letzteAenderung;

    @JsonProperty("Geburtsdatum")
    private Date geburtsdatum;

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
    private Date keineWerbungDatum;

    @JsonProperty("GrundKeineWerbung")
    private UUID grundKeineWerbung;

    @JsonProperty("DatenschutzAusgehaendigt")
    private Boolean datenschutzAusgehaendigt;

    @JsonProperty("DataloggingUnterschrieben")
    private Boolean dataloggingUnterschrieben;

    @JsonProperty("LetztesHoergeraetR")
    private Date letztesHoergeraetR;

    @JsonProperty("LetztesHoergeraetL")
    private Date letztesHoergeraetL;

    @JsonProperty("LetzterBesuch")
    private Date letzterBesuch;

    @JsonProperty("NaechsteKontrolle")
    private Date naechsteKontrolle;

    @JsonProperty("BetreuerAkustikKuerzel")
    private String betreuerAkustikKuerzel;

    @JsonProperty("BetreuerAkustikBenutzerID")
    private String betreuerAkustikBenutzerID;

    @JsonProperty("BetreuerOptikKuerzel")
    private String betreuerOptikKuerzel;

    @JsonProperty("BetreuerOptikBenutzerID")
    private String betreuerOptikBenutzerID;

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

    @JsonProperty("Inst")
    private String inst;

    @JsonProperty("InaktivDatum")
    private Date inaktivDatum;

    @JsonProperty("GrundInaktiv")
    private UUID grundInaktiv;

    @JsonProperty("NaechsterTerminDatum")
    private Date naechsterTerminDatum;

    @JsonProperty("NaechsterTerminID")
    private UUID naechsterTerminID;

}
