//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Models.Kategori;
import Repositories.KategoriRepository;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        KategoriRepository kategoriRep=new KategoriRepository();
        System.out.println("-------------------------------------");
        List<Kategori> gelenKategori=kategoriRep.aktifKategorileriGetir();
        System.out.println("Son durum kategori listemiz");
        for(Kategori kat:gelenKategori){
            System.out.println("ID: " + kat.getId() + " | Adı: " + kat.getAdi() + " | Aktif mi?: " + kat.isAktiflik());
        }






    }
}