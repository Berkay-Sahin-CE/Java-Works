package Models;

public class SiparisDetay {
    private int detayId;
    private int siparisId;
    private int urunId;
    private int adet;
    private double birimFiyat;
    private String kargoDurum;

    public SiparisDetay(){

    }

    public SiparisDetay(int siparisId, int urunId, int adet, double birimFiyat, String kargoDurum) {
        this.siparisId = siparisId;
        this.urunId = urunId;
        this.adet = adet;
        this.birimFiyat = birimFiyat;
        this.kargoDurum = kargoDurum;
    }

    public SiparisDetay(int detayId, int siparisId, int urunId, int adet, double birimFiyat, String kargoDurum) {
        this.detayId = detayId;
        this.siparisId = siparisId;
        this.urunId = urunId;
        this.adet = adet;
        this.birimFiyat = birimFiyat;
        this.kargoDurum = kargoDurum;
    }

    public int getDetayId() {
        return detayId;
    }

    public void setDetayId(int detayId) {
        this.detayId = detayId;
    }

    public int getSiparisId() {
        return siparisId;
    }

    public void setSiparisId(int siparisId) {
        this.siparisId = siparisId;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public String getKargoDurum() {
        return kargoDurum;
    }

    public void setKargoDurum(String kargoDurum) {
        this.kargoDurum = kargoDurum;
    }
}


