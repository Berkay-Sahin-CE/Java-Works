//atm projesi
import java.util.Scanner;
public class AtmProje{
    public static void main (String[] args){
        int bakiye=1000;
        int sifre=1417;
        int bank,secim,para;
        Scanner scan=new Scanner(System.in);
        System.out.println("Berki Banka hos geldiniz");
        System.out.println("Lutfen sifrenizi giriniz");
        bank=scan.nextInt();
        if(bank==sifre){
            while(bakiye>0){
                 System.out.println("Bakiyeniz "+bakiye+"TL");
                 System.out.println("Lutfen yapmak istediginiz islemi secin");
                  System.out.println("1-) para cek");
                   System.out.println("2-) para yatir");
                    System.out.println("3-) cikis");
                    secim=scan.nextInt();
                    switch(secim){
                        case 1:
                             System.out.println("Cekmek istediginiz miktari giriniz");
                             para=scan.nextInt();
                             if(bakiye>=para){
                             bakiye-=para;
                              System.out.println("Mevcut bakiyeniz "+bakiye);}
                              else 
                              System.out.println("Yetersiz bakiye");
                              break;
                        case 2:
                            System.out.println("Yatirmak istediginiz miktari giriniz");
                              para=scan.nextInt();
                            bakiye+=para;
                            System.out.println("Mevcut bakiyeniz "+bakiye);
                            break;
                       case 3:
                           System.out.println("kartinizi almayi unutmayiniz");
                           return;
                       default:
                       System.out.println("Hatali islem sectiniz lutfen tekrar denyiniz");
                       break;
                    }
                    
                
            }
        }
        else{
            System.out.println("Hatali sifre girdiniz");
        }
        
        
        
    }
}