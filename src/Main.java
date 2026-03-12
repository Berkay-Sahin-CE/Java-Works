//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Models.Siparis;
import Models.SiparisDetay;
import Services.SiparisServices;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SiparisServices siparisServis=new SiparisServices();
        Siparis anaFis=new Siparis(1,1,32000.00,"Hazırlanıyor");
        List<SiparisDetay> musteriSepeti=new ArrayList<>();
        SiparisDetay birinciItem=new SiparisDetay(0,1,1,28999.99,"Beklemede");
        musteriSepeti.add(birinciItem);
        SiparisDetay ikinciItem=new SiparisDetay(0,4,2,1500.00,"Yola çıktı");
        musteriSepeti.add(ikinciItem);
        siparisServis.siparisOlustur(anaFis,musteriSepeti);
        System.out.println("--- İŞLEM TAMAMLANDI ---");





    }
}