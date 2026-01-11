//gelismis sayisal loto
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class SayisalLoto{
    public static void main(String[] args){
        int lotoSayilari=6;
        int sayi;
        int sayac=0;
        boolean kazanan=true;
        int[] girilenLoto= new int[lotoSayilari];
        int[] kazananLoto= new int[lotoSayilari];
        List<Integer> sayilar= new ArrayList<>();
        for(int i=0;i<91;i++){
            sayilar.add(i);
        }
        Collections.shuffle(sayilar);
        for(int i=0;i<lotoSayilari;i++){
            kazananLoto[i]= sayilar.get(i);
        }
        Arrays.sort(kazananLoto);
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen oynayacaginiz 6 sayiyi girin");
        for(int i=0;i<lotoSayilari;){
            boolean kontrol=false;
            sayi=scan.nextInt();
            if(sayi<0||sayi>90){
                System.out.println("Lutfen 0 ile 90 arasinda sayilar giriniz ");
                continue;
            }
            for(int j=0;j<i;j++){
                if(girilenLoto[j]==sayi){
                    kontrol=true;
                    break;
                }
            }
            if(kontrol){
                System.out.println("Ayni sayiyi girdiniz lutfen baska sayi giriniz ");
                continue;
            }
            girilenLoto[i]=sayi;
            i++;
            
        }
        Arrays.sort(girilenLoto);
        for(int i=0;i<lotoSayilari;i++){
            if(girilenLoto[i] !=kazananLoto[i]){
                kazanan=false;
            }
            
        }
        for(int i=0;i<lotoSayilari;i++){
            for(int j=0;j<lotoSayilari;j++){
                if(girilenLoto[j]==kazananLoto[i]){
                    sayac++;
                }
            }
        }
        if(kazanan==true){
            System.out.println("TEBRIKLER!!! kazandınız ");
            System.out.println("Kazanan loto sayilari "+Arrays.toString(kazananLoto));
            System.out.println();
            System.out.println("Girdiginiz loto sayilari "+Arrays.toString(girilenLoto));
        }
        else if(sayac<2){
            System.out.println("Uzgunuz tekrar deneyin ");
            System.out.println();
            System.out.println("Kazanan loto sayilari "+Arrays.toString(kazananLoto));
            System.out.println();
            System.out.println("Girdiginiz loto sayilari "+Arrays.toString(girilenLoto));
            System.out.println();
            System.out.println("Tutturdugunuz sayi adeti "+sayac);
        }
        switch(sayac){
            case 2:
                System.out.println("TEBRİKLER amorti kazandınız ");
                System.out.println();
            System.out.println("Kazanan loto sayilari "+Arrays.toString(kazananLoto));
            System.out.println();
            System.out.println("Girdiginiz loto sayilari "+Arrays.toString(girilenLoto));
            System.out.println();
            System.out.println("Tutturdugunuz sayi adeti "+sayac);
        }
    }
}