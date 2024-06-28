package day04_StringManipulations_ForLoop;

import java.util.Scanner;

public class C04_SifreKontrolu {
    public static void main(String[] args) {

        //4- Kullanicidan bir sifre girmesini isteyin.
        // Sifrenin asagidaki
        // sartlari sagladigini kontrol edin ve saglamadigi her sarti ekranda yazdirin.

        // Eger sifre tum sartlari sagliyorsa     “Sifre basarili sekilde kaydedildi” yazdirin
        ////        //      - sifre buyuk harf icermelidir
        //      - sifre sayi icermelidir
        //sifre “!@#$%^&*<>,.?/\+_-=” sembollerinden en az bir tane icermelidir
       // - sifre bosluk icermemelidir.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz: ");
        String girilenSifre=scan.nextLine();

        //Tum harfleri tek tek ele alip
        //sartlari tek tek kontrol etmek icin her bir sart icin sayac veya flag kullanmaliyiz

        //Sayacta kucuk harfleri sayip, sona geldiginde sayac 0 degilsekucuk harf var diyebilirim.
        //flagda sadece istenen sarti sagliyor veya saglamiyor diye deger atariz
        // en basta false yapip saglayan herhangi bir deger ile karsilastirdigimizda true yapariz
        //biz flag yapiyoruz

        boolean kucukHarfIceriyor=false;
        boolean buyukHarfIceriyor=false;
        boolean sayiIceriyor=false;
        boolean ozelKarakterIceriyor=false;
        boolean boslukIceriyor= false;

        //bir for loop ile sifredeki her karakteri ele alalim.

        for (int i = 0; i <girilenSifre.length() ; i++) {

            char eleAlinanKarakter=girilenSifre.charAt(i);

            if (Character.isLowerCase(eleAlinanKarakter)) kucukHarfIceriyor=true;

            if (Character.isUpperCase(eleAlinanKarakter)) buyukHarfIceriyor=true;

            if (Character.isDigit(eleAlinanKarakter))sayiIceriyor=true;

            String verilenOzelKarakterler= "!@#$%^&*<>,.?/\\+_-=";
            if (verilenOzelKarakterler.contains(eleAlinanKarakter+""))ozelKarakterIceriyor=true;

            if ((eleAlinanKarakter+"").equals(" "))boslukIceriyor=true;

        }
        if (kucukHarfIceriyor==false){
            System.out.println("Sifre kucuk harf icermelidir.");
        }
        if (buyukHarfIceriyor==false){
            System.out.println("Sifre buyuk harf icermelidir.");
        }
        if (sayiIceriyor==false){
            System.out.println("Sifre sayi iceremelidir.");
        }
        if (ozelKarakterIceriyor==false){
            System.out.println("Sifre ozel karakter icermelidir.");
        }

        if (boslukIceriyor==true){
            System.out.println("Sifre bosluk icermemelidir.");
        }

        if (kucukHarfIceriyor == true  &&
                buyukHarfIceriyor == true  &&
                sayiIceriyor==true &&
                ozelKarakterIceriyor==true &&
                boslukIceriyor == false) {

            System.out.println("Sifreniz basarili olarak kaydedildi...");
        }

    }

    }
