package Models;

public class Kategori {
    private int id;
    private String adi;
    private String aciklama;
    private boolean aktiflik;
    private Integer ustKategoriId;

    public Kategori(int id, String adi, String aciklama, boolean aktiflik, Integer ustKategoriId) {
        this.id = id;
        this.adi = adi;
        this.aciklama = aciklama;
        this.aktiflik = aktiflik;
        this.ustKategoriId = ustKategoriId;
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

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public boolean isAktiflik() {
        return aktiflik;
    }

    public void setAktiflik(boolean aktiflik) {
        this.aktiflik = aktiflik;
    }

    public Integer getUstKategoriId() {
        return ustKategoriId;
    }

    public void setUstKategoriId(Integer ustKategoriId) {
        this.ustKategoriId = ustKategoriId;
    }
}
