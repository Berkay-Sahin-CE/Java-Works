package Repositories;

import Models.Urun;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class UrunRepository {

    public List<Urun> tumUrunleriGetir(){
        List<Urun> urunListesi=new ArrayList<>();
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            String sqlGonderisi="SELECT * FROM Urunler";
            PreparedStatement kurye=connection.prepareStatement(sqlGonderisi);
            ResultSet gelenTablo=kurye.executeQuery();

            while(gelenTablo.next()){
                int id = gelenTablo.getInt("UrunId");
                String ad = gelenTablo.getString("UrunAdi");
                double fiyat = gelenTablo.getDouble("UrunFiyat");
                int stok = gelenTablo.getInt("UrunStok");
                int kategoriId = gelenTablo.getInt("KategoriId");
                Date tarih = gelenTablo.getDate("UrunTarihi");
                boolean aktiflik = gelenTablo.getBoolean("UrAktiflik");

                Urun cekilenUrun=new Urun(id,ad,fiyat,stok,kategoriId,tarih,aktiflik);
                urunListesi.add(cekilenUrun);
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println("Ürünleri okurken bir hata oluştu.");
            e.printStackTrace();
        }

        return urunListesi;
    }


    public void urunEkle(Urun eklenenUrun){
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            String sqlGonderisi="INSERT INTO Urunler (UrunAdi, UrunFiyat, UrunStok, KategoriId, UrAktiflik) VALUES (?,?,?,?,?) where UrunId=?";
            PreparedStatement kurye=connection.prepareStatement(sqlGonderisi);
            kurye.setString(1,eklenenUrun.getAdi());
            kurye.setDouble(2,eklenenUrun.getFiyat());
            kurye.setInt(3,eklenenUrun.getStok());
            kurye.setInt(4,eklenenUrun.getKategoriId());
            kurye.setBoolean(5,eklenenUrun.isAktiflik());
            int etkilenenSatir= kurye.executeUpdate();
            if(etkilenenSatir>0){
                System.out.println(eklenenUrun.getAdi() + "' adlı ürün başarıyla eklendi.");
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println("Ürün eklenirken bir hata oluştu!");
            e.printStackTrace();
        }
    }


    public void urunGuncelle(Urun guncellenenUrun){
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            String sqlGonderisi="UPDATE Urunler SET Ad = ?, Fiyat = ?, StokMiktari = ?, KategoriId = ?, Aktiflik = ? WHERE Id = ?";
            PreparedStatement kurye=connection.prepareStatement(sqlGonderisi);
            kurye.setString(1,guncellenenUrun.getAdi());
            kurye.setDouble(2,guncellenenUrun.getFiyat());
            kurye.setInt(3,guncellenenUrun.getStok());
            kurye.setInt(4,guncellenenUrun.getKategoriId());
            kurye.setBoolean(5,guncellenenUrun.isAktiflik());
            int etkilenenSatir=kurye.executeUpdate();
            if(etkilenenSatir>0){
                System.out.println(guncellenenUrun.getId()+" ID'li ürün güncellendi.");
            }
            else{
                System.out.println(guncellenenUrun.getId()+" ID'li bir ürün bulunamadı.");
            }
           connection.close();
        }
        catch(Exception e){
            System.out.println("Güncelleme sırasında bir hata oluştu");
            e.printStackTrace();
        }
    }


    public void fiyatGuncelle(int UrunId,double yeniFiyat){
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            String sqlGonderisi="UPDATE Urunler SET UrunFiyat = ? WHERE UrunId = ?";
            PreparedStatement kurye=connection.prepareStatement(sqlGonderisi);
            kurye.setDouble(1,yeniFiyat);
            kurye.setInt(2,UrunId);
            int etkilenenSatir=kurye.executeUpdate();
            if (etkilenenSatir > 0) {

                String sqlLog = "SELECT TOP 1 eskiFiyat, yeniFiyat, DegisimTarihi FROM UrunFiyatLog WHERE UrunId = ? ORDER BY DegisimTarihi DESC";
                PreparedStatement ptt = connection.prepareStatement(sqlLog);
                ptt.setInt(1, UrunId);
                ResultSet resultLog = ptt.executeQuery();

                if (resultLog.next()) {
                    double eskiFiyat = resultLog.getDouble("eskiFiyat");
                    double sonFiyat = resultLog.getDouble("yeniFiyat");
                    System.out.println("ID'si " + UrunId + " olan ürünün fiyatı " +
                            eskiFiyat + " TL'den " + sonFiyat + " TL'ye güncellendi.");
                }
            }
            else{
                System.out.println(UrunId + " ID'li bir ürün bulunamadığı için fiyat güncellenemedi.");
            }
                    
            connection.close();

            }
        catch (Exception e){
            System.out.println("Fiyat güncellenirken hata oluştu");
            e.printStackTrace();


        }
    }
}
