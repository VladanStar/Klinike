package com.company;

public class KJlinika {
    private String naziv;
    private String adresa;
    private int brojZaposlenih;
    private int brojPacijenata;
    private double prosecnaPlata;
    private TipKlinike tip;
    public enum TipKlinike {
        PRIVATNA_KLINIKA,DRZAVNA_KLINIKA
    }

    public KJlinika() {
    }

    public KJlinika(String naziv, String adresa, int brojZaposlenih, int brojPacijenata, double prosecnaPlata, TipKlinike tip) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.brojZaposlenih = brojZaposlenih;
        this.brojPacijenata = brojPacijenata;
        this.prosecnaPlata = prosecnaPlata;
        this.tip = tip;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getBrojZaposlenih() {
        return brojZaposlenih;
    }

    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }

    public int getBrojPacijenata() {
        return brojPacijenata;
    }

    public void setBrojPacijenata(int brojPacijenata) {
        this.brojPacijenata = brojPacijenata;
    }

    public double getProsecnaPlata() {
        return prosecnaPlata;
    }

    public void setProsecnaPlata(double prosecnaPlata) {
        this.prosecnaPlata = prosecnaPlata;
    }

    public TipKlinike getTip() {
        return tip;
    }

    public void setTip(TipKlinike tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "KJlinika{" +
                "naziv='" + naziv + '\'' +
                ", adresa='" + adresa + '\'' +
                ", brojZaposlenih=" + brojZaposlenih +
                ", brojPacijenata=" + brojPacijenata +
                ", prosecnaPlata=" + prosecnaPlata +
                ", tip=" + tip +
                '}';
    }
}
