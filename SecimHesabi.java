// Basit seçim sistemi uygulaması
// Kullanıcıdan parti isimleri ve oy sayıları alınır
// Oylar büyükten küçüğe sıralanır ve yüzdeler hesaplanır

import java.util.Scanner;
public class SecimHesabi{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int partiSayisi;
        int toplamOy=0;
        System.out.println("Secime kac parti katilacak");
        partiSayisi=scan.nextInt();
        scan.nextLine();
        String[] partiAdlari=new String[partiSayisi];
        int[] oySayisi=new int[partiSayisi];
        
        for(int i=0;i<partiSayisi;i++){
            System.out.println();
            System.out.println((i+1)+".partinin adini giriniz");
            partiAdlari[i]=scan.nextLine();
            System.out.println();
            System.out.println(partiAdlari[i]+" partisi kac oy aldi");
            oySayisi[i]=scan.nextInt();
           scan.nextLine();
           toplamOy+=oySayisi[i];
            
        }
       for(int i=0;i<partiSayisi-1;i++){
           for(int j=i+1;j<partiSayisi;j++){
               if(oySayisi[j]>oySayisi[i]){
                   int temp=oySayisi[i];
                   oySayisi[i]=oySayisi[j];
                   oySayisi[j]=temp;
                   
                   String tempi=partiAdlari[i];
                   partiAdlari[i]=partiAdlari[j];
                   partiAdlari[j]=tempi;
               }
           }
       }
       System.out.println("Kazanan parti "+partiAdlari[0]+" aldigi oy sayisi: "+oySayisi[0]+" oy yuzdesi: %"+((double)oySayisi[0]/toplamOy*100));
       System.out.println();
       for(int i=1;i<partiSayisi;i++){
           System.out.println(partiAdlari[i]+" partisinin aldigi oy sayisi: "+oySayisi[i]+" oy yuzdesi: %"+((double)oySayisi[i]/toplamOy*100));
           System.out.println();
       }
        
        
        
    }
}