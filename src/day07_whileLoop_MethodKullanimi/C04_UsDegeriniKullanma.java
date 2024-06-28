package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class C04_UsDegeriniKullanma {
    public static void main(String[] args) {
        //4- Kullanicidan pozitif bir tamsayi ve hesaplamak istedigi üs değerini alın.
        // Üs hesaplandığında eğer sonuc 100’den kucukse
        // “kucuk sayilar icin beni ugrastirma” , 100’den buyukse “istenen islemin sonucu ….” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz: ");
        int sayi= scanner.nextInt();

        System.out.print("Lutfen hesaplamak istediginiz us degerini giriniz: ");
        int us= scanner.nextInt();

        //us hesapkandiginda
        int sonuc=C03_UsDegeridondurme.usHesapla(sayi,us);

        //eğer sonuc 100’den kucukse
        // “kucuk sayilar icin beni ugrastirma” , 100’den buyukse “istenen islemin sonucu ….” yazdirin.

        if(sonuc<100){
            System.out.println("Kucuk Sayilar Icin Beni Ugrastirma");
        }else System.out.println("istenen islemin sonucu: "+ sonuc);
    }
}
