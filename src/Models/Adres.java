package Models;

public class Adres {
    private int adresId;
    private int musteriId;
    private String adresBaslik;
    private String ilAdi;
    private String ilceAdi;
    private String acikAdres;
    private boolean adresAktiflik;

    public Adres(){

    }

    public Adres(int musteriId, String adresBaslik, String ilAdi, String ilceAdi, String acikAdres, boolean adresAktiflik) {
        this.musteriId = musteriId;
        this.adresBaslik = adresBaslik;
        this.ilAdi = ilAdi;
        this.ilceAdi = ilceAdi;
        this.acikAdres = acikAdres;
        this.adresAktiflik = adresAktiflik;
    }

    public Adres(int adresId, int musteriId, String adresBaslik, String ilAdi, String ilceAdi, String acikAdres, boolean adresAktiflik) {
        this.adresId = adresId;
        this.musteriId = musteriId;
        this.adresBaslik = adresBaslik;
        this.ilAdi = ilAdi;
        this.ilceAdi = ilceAdi;
        this.acikAdres = acikAdres;
        this.adresAktiflik = adresAktiflik;
    }

    public int getAdresId() {
        return adresId;
    }

    public void setAdresId(int adresId) {
        this.adresId = adresId;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getAdresBaslik() {
        return adresBaslik;
    }

    public void setAdresBaslik(String adresBaslik) {
        this.adresBaslik = adresBaslik;
    }

    public String getIlAdi() {
        return ilAdi;
    }

    public void setIlAdi(String ilAdi) {
        this.ilAdi = ilAdi;
    }

    public String getIlceAdi() {
        return ilceAdi;
    }

    public void setIlceAdi(String ilceAdi) {
        this.ilceAdi = ilceAdi;
    }

    public String getAcikAdres() {
        return acikAdres;
    }

    public void setAcikAdres(String acikAdres) {
        this.acikAdres = acikAdres;
    }

    public boolean isAdresAktiflik() {
        return adresAktiflik;
    }

    public void setAdresAktiflik(boolean adresAktiflik) {
        this.adresAktiflik = adresAktiflik;
    }
}
