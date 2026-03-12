package Repositories;

import Models.Kategori;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KategoriRepository {

    public List<Kategori> tumKategorileriGetir(){
        List<Kategori> kategoriListesi= new ArrayList<>();
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            Statement statement=connection.createStatement();
            String sqlSorgusu="SELECT * FROM KATEGORİLER";
            ResultSet resultSet=statement.executeQuery(sqlSorgusu);

            while(resultSet.next()){
                int id=resultSet.getInt("KategoriId");
                String adi=resultSet.getString("KategoriAdi");
                String aciklama=resultSet.getString("Aciklama");
                boolean aktif=resultSet.getBoolean("Aktiflik");
                Integer ustId=resultSet.getInt("UstkategoriId");
                if(resultSet.wasNull()){
                    ustId=null;
                }

                Kategori yeniKategori=new Kategori(id,adi,aciklama,aktif,ustId);
                kategoriListesi.add(yeniKategori);
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println("Kategoleri çekerken hata oluştu");
            e.printStackTrace();
        }
        return kategoriListesi;
    }


    public void kategoriEkle(Kategori eklenenKategori){
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            String sqlGonderisi="insert into Kategoriler(KategoriAdi,Aciklama,Aktiflik,UstkategoriId) values(?,?,?,?);";
            java.sql.PreparedStatement kurye=connection.prepareStatement(sqlGonderisi);
            kurye.setString(1,eklenenKategori.getAdi());
            kurye.setString(2,eklenenKategori.getAciklama());
            kurye.setBoolean(3,eklenenKategori.isAktiflik());
            if(eklenenKategori.getUstKategoriId()!=null){
                kurye.setInt(4,eklenenKategori.getUstKategoriId());
            }else{
                kurye.setNull(4,java.sql.Types.INTEGER);
            }

            kurye.executeUpdate();
            System.out.println(eklenenKategori.getAdi()+" başarıyla veritabanına eklendi.");
            connection.close();
        }
        catch (Exception e){
            System.out.println("Kategori eklenirken hata oluştu.");
            e.printStackTrace();
        }
    }


    public void kategoriGuncelle(Kategori guncelKategori){
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            String sqlGonderisi = "UPDATE Kategoriler SET KategoriAdi = ?, Aciklama = ?, Aktiflik = ?, UstKategoriID = ? WHERE KategoriID = ?";
            java.sql.PreparedStatement kurye=connection.prepareStatement(sqlGonderisi);
            kurye.setString(1,guncelKategori.getAdi());
            kurye.setString(2,guncelKategori.getAciklama());
            kurye.setBoolean(3,guncelKategori.isAktiflik());
            if(guncelKategori.getUstKategoriId()!=null){
                kurye.setInt(4,guncelKategori.getUstKategoriId());
            }else{
                kurye.setNull(4,java.sql.Types.INTEGER);
            }
            kurye.setInt(5,guncelKategori.getId());
            int etkilenenSatir=kurye.executeUpdate();
            if(etkilenenSatir>0){
                System.out.println(guncelKategori.getId()+" ID'li kategori güncellendi");
            }else{
                System.out.println("UYARI:"+guncelKategori.getId()+" ID'li bir kategori bulunamadı");
            }
            connection.close();

        }
        catch (Exception e){
            System.out.println("Güncelleme sırasında hata oluştu");
            e.printStackTrace();
        }
    }


    public void kategoriSil(int silinenId){
        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            String sqlGonderisi="DELETE FROM Kategoriler WHERE KategoriID = ?";
            java.sql.PreparedStatement kurye=connection.prepareStatement(sqlGonderisi);
            kurye.setInt(1,silinenId);
            int etkilenenSatir= kurye.executeUpdate();
            if(etkilenenSatir>0){
                System.out.println(silinenId+" ID'li kategori veritabanından silindi.");
            }else{
                System.out.println("UYARI:"+silinenId+" ID'li bir kategori bulunamadı");
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println("Silme işlemi sırasında hata oluştu.");
            e.printStackTrace();
        }
    }


    public List<Kategori> aktifKategorileriGetir(){
        List<Kategori> kategoriListesi= new ArrayList<>();

        try{
            Connection connection=Core.DatabaseConnection.getConnection();
            Statement statement=connection.createStatement();
            String sqlSorgusu="SELECT * FROM KATEGORİLER where Aktiflik=1";
            ResultSet resultSet=statement.executeQuery(sqlSorgusu);

            while(resultSet.next()){
                int id=resultSet.getInt("KategoriId");
                String adi=resultSet.getString("KategoriAdi");
                String aciklama=resultSet.getString("Aciklama");
                boolean aktif=resultSet.getBoolean("Aktiflik");
                Integer ustId=resultSet.getInt("UstkategoriId");
                if(resultSet.wasNull()){
                    ustId=null;
                }

                Kategori yeniKategori=new Kategori(id,adi,aciklama,aktif,ustId);
                kategoriListesi.add(yeniKategori);
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println("Kategoleri çekerken hata oluştu");
            e.printStackTrace();
        }
        return kategoriListesi;
    }


}
