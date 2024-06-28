package day04_StringManipulations_ForLoop;

import java.util.Scanner;

public class C01_MetindenSayiAlma {
    public static void main(String[] args) {

       // 1- Bir web sayfasi yapilan arama sonucunda
        // “Aradiginiz Nutella icin 124.456.112 sonuc bulunmustur” diye sonuc yazdirmaktadir.
         //       Web sayfasinda arama sonucunda alinan cumledeki bulunan
        //       sonuc sayisinin 100 binden fazla oldugunu test eden kod yaziniz.

        String sonucYazisi="Aradiginiz Nutella icin 124.456.112 sonuc bulunmustur.";

        sonucYazisi=sonucYazisi.replaceAll("\\D","");
        System.out.println(sonucYazisi);//124456112

        int sonucSayisi=Integer.parseInt(sonucYazisi); //124456112

        if (sonucSayisi>100000){
            System.out.println("Arama sonuc sayisi testi: Passed");
        }else System.out.println("Arama sonuc sayisi testi: Failed");

    }
}
