//ucak bileti hesaplama
import java.util.Scanner;
public class UcakBileti{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int yas,yolculuktipi;
        double km;
        double fiyat=0;
        System.out.println("gideceginiz mesafeyi yaziniz");
        km= input.nextInt();
        if(km>0){
            fiyat=km*0.10;
        }
        else{
            System.out.println("hatali km girdiniz");
        }
        System.out.println("yasinizi giriniz");
        yas= input.nextInt();
        if(yas<=12){
          fiyat -= fiyat * 0.50;
        }
        else if(yas>12 && yas<=24){
            fiyat -=fiyat*0.10;
        }
        else if(yas>=65){
            fiyat -=fiyat*0.30;
        }
        else {
            fiyat=fiyat;
        }
         System.out.println("yolcululuk tipinizi seciniz--1)sadece gidis 2)gidis donus");
         yolculuktipi=input.nextInt();
         if(yolculuktipi==1){
             fiyat=fiyat;
              System.out.println("toplam fiyat="+fiyat);
         }
         else if(yolculuktipi==2){
             fiyat -=fiyat*0.20;
              System.out.println("toplam fiyat="+fiyat);
         }
         else{
             System.out.println("hatali giris");
         }
        
    }
}