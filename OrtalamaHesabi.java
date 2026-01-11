//not ortalama hesaplamasi
import java.util.Scanner;
public class OrtalamaHesabi{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int quizNotu,vizeNotu,finalNotu;
        double ortalama;
        System.out.println("Not ortalama hesaplamasina hos geldiniz");
        System.out.println("Quiz notunuzu girin:");
        quizNotu=input.nextInt();
        System.out.println("Vize notunuzu giriniz:");
        vizeNotu=input.nextInt();
        System.out.println("Final notunuzu giriniz:");
        finalNotu=input.nextInt();
        ortalama=(20.0*quizNotu/100)+(40.0*vizeNotu/100)+(40.0*finalNotu/100);
        if (ortalama>=50){
            System.out.println("Tebrikler dersi gectiniz notunuz: "+ortalama);
        }
        else {
            System.out.println("Maalesef dersi gecemediniz notunuz: "+ortalama);
        }
        
        
    }
}
