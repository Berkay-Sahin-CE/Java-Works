package Models;
import java.sql.Timestamp;
public class Siparis {
    private int siparisId;
    private int musteriId;
    private int adresId;
    private Timestamp siparisTarihi;
    private double totalTutar;
    private String durum;

    public Siparis(){

    }

    public Siparis(int musteriId, int adresId, Timestamp siparisTarihi, double totalTutar, String durum) {
        this.musteriId = musteriId;
        this.adresId = adresId;
        this.siparisTarihi = siparisTarihi;
        this.totalTutar = totalTutar;
        this.durum = durum;
    }

    public Siparis(int siparisId, int musteriId, int adresId, Timestamp siparisTarihi, double totalTutar, String durum) {
        this.siparisId = siparisId;
        this.musteriId = musteriId;
        this.adresId = adresId;
        this.siparisTarihi = siparisTarihi;
        this.totalTutar = totalTutar;
        this.durum = durum;
    }
    public Siparis(int musteriId, int adresId, double totalTutar, String durum) {
        this.musteriId = musteriId;
        this.adresId = adresId;
        this.totalTutar = totalTutar;
        this.durum = durum;
    }

    public int getSiparisId() {
        return siparisId;
    }

    public void setSiparisId(int siparisId) {
        this.siparisId = siparisId;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public int getAdresId() {
        return adresId;
    }

    public void setAdresId(int adresId) {
        this.adresId = adresId;
    }

    public Timestamp getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisTarihi(Timestamp siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public double getTotalTutar() {
        return totalTutar;
    }

    public void setTotalTutar(double totalTutar) {
        this.totalTutar = totalTutar;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}
