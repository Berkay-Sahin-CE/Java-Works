package Models;
import java.sql.Date;
public class Urun {
    private int id;
    private String adi;
    private double fiyat;
    private int stok;
    private int kategoriId;
    private Date urunTarihi;
    private boolean aktiflik;

    public Urun(){

    }

    public Urun(int id, String adi, double fiyat, int stok, int kategoriId, Date urunTarihi, boolean aktiflik) {
        this.id = id;
        this.adi = adi;
        this.fiyat = fiyat;
        this.stok = stok;
        this.kategoriId = kategoriId;
        this.urunTarihi = urunTarihi;
        this.aktiflik = aktiflik;
    }

    public Urun(String adi, double fiyat, int stok, int kategoriId, boolean aktiflik) {
        this.adi = adi;
        this.fiyat = fiyat;
        this.stok = stok;
        this.kategoriId = kategoriId;
        this.aktiflik = aktiflik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Date getUrunTarihi() {
        return urunTarihi;
    }

    public void setUrunTarihi(Date urunTarihi) {
        this.urunTarihi = urunTarihi;
    }

    public boolean isAktiflik() {
        return aktiflik;
    }

    public void setAktiflik(boolean aktiflik) {
        this.aktiflik = aktiflik;
    }
}
