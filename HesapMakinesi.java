//hesap makinesi
import java.util.Scanner;
public class HesapMakinesi{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double sayi1,sayi2;
        int sayi3;
        System.out.println("ilk sayiyi giriniz: ");
        sayi1=input.nextDouble();
        System.out.println("ikinci sayiyi giriniz: ");
        sayi2=input.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi secin: ");
        System.out.println("1)toplama 2)cikarma 3)carpma 4)bolme");
        sayi3=input.nextInt();
        switch(sayi3){
            case 1:
                System.out.println(sayi1+sayi2);
                break;
            case 2:
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                System.out.println(sayi1*sayi2);
                break;
            case 4:
                if(sayi2!=0){
                     System.out.println(sayi1/sayi2);
                     break;
                }
           else{
               System.out.println("islem yapilamaz");
           }
           default:
           System.out.println("gecersiz");
            
        }
    }
    
}