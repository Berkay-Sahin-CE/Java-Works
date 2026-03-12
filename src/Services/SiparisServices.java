package Services;
import Core.DatabaseConnection;
import Models.Siparis;
import Models.SiparisDetay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class SiparisServices {

    public void siparisOlustur(Siparis anaSiparis,List<SiparisDetay> sepet){
        Connection connection=null;
        try{
            connection=DatabaseConnection.getConnection();
            connection.setAutoCommit(false);
            String sqlSiparis="INSERT INTO Siparisler (MusteriId, AdresId, TotalTutar, Durum) VALUES (?, ?, ?, ?)";
            PreparedStatement kurye1=connection.prepareStatement(sqlSiparis,Statement.RETURN_GENERATED_KEYS);
            kurye1.setInt(1,anaSiparis.getMusteriId());
            kurye1.setInt(2,anaSiparis.getAdresId());
            kurye1.setDouble(3,anaSiparis.getTotalTutar());
            kurye1.setString(4,anaSiparis.getDurum());
            kurye1.executeUpdate();
            ResultSet resultSiparisId=kurye1.getGeneratedKeys();
            int yeniSiparisIdsi=0;
            if(resultSiparisId.next()){
                yeniSiparisIdsi=resultSiparisId.getInt(1);
            }

            String sqlDetay="INSERT INTO SiparisDetay (SiparisId, UrunId, Adet, BirimFiyat, KargoDurumu) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement kurye2=connection.prepareStatement(sqlDetay);

            String sqlStokDus="UPDATE Urunler SET UrunStok = UrunStok - ? WHERE UrunId = ?";
            PreparedStatement kurye3=connection.prepareStatement(sqlStokDus);
            for(SiparisDetay item:sepet){
                kurye2.setInt(1,yeniSiparisIdsi);
                kurye2.setInt(2,item.getUrunId());
                kurye2.setInt(3,item.getAdet());
                kurye2.setDouble(4,item.getBirimFiyat());
                kurye2.setString(5, item.getKargoDurum());
                kurye2.executeUpdate();

                kurye3.setInt(1,item.getAdet());
                kurye3.setInt(2,item.getUrunId());
                kurye3.executeUpdate();
            }
            connection.commit();
            System.out.println("Sipariş başarıyla oluşturuldu ve stoklar güncellendi. Fiş No: " + yeniSiparisIdsi);
        }
        catch(Exception e){
            System.out.println("Sipariş işlemi sırasında bir hata oluştu.");
            e.printStackTrace();
            try{
                if(connection!=null){
                    connection.rollback();
                    System.out.println("Güvenlik protokolü devrede: Yapılan tüm işlemler geri alındı.");
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        finally{
            try{
                if(connection!=null){
                    connection.setAutoCommit(true);
                    connection.close();
                }
            }
            catch(Exception exc){
                exc.printStackTrace();
            }
        }
    }

}
