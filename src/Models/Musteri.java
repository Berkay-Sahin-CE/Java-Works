package Models;
import java.sql.Date;
public class Musteri {
    private int musteriId;
    private String musteriAdi;
    private String MusteriSoyadi;
    private String mai;
    private String sifre;
    private String telNo;
    private Date musteriTarihi;
    private boolean musteriAktiflik;

    public Musteri(){

    }

    public Musteri(String musteriAdi, String musteriSoyadi, String mai, String sifre, String telNo, Date musteriTarihi, boolean musteriAktiflik) {
        this.musteriAdi = musteriAdi;
        MusteriSoyadi = musteriSoyadi;
        this.mai = mai;
        this.sifre = sifre;
        this.telNo = telNo;
        this.musteriTarihi = musteriTarihi;
        this.musteriAktiflik = musteriAktiflik;
    }

    public Musteri(int musteriId, String musteriAdi, String musteriSoyadi, String mai, String sifre, String telNo, Date musteriTarihi, boolean musteriAktiflik) {
        this.musteriId = musteriId;
        this.musteriAdi = musteriAdi;
        MusteriSoyadi = musteriSoyadi;
        this.mai = mai;
        this.sifre = sifre;
        this.telNo = telNo;
        this.musteriTarihi = musteriTarihi;
        this.musteriAktiflik = musteriAktiflik;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return MusteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        MusteriSoyadi = musteriSoyadi;
    }

    public String getMai() {
        return mai;
    }

    public void setMai(String mai) {
        this.mai = mai;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public Date getMusteriTarihi() {
        return musteriTarihi;
    }

    public void setMusteriTarihi(Date musteriTarihi) {
        this.musteriTarihi = musteriTarihi;
    }

    public boolean isMusteriAktiflik() {
        return musteriAktiflik;
    }

    public void setMusteriAktiflik(boolean musteriAktiflik) {
        this.musteriAktiflik = musteriAktiflik;
    }
}


