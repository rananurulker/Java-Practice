package day10_ListsExceptions;

import day07_whileLoop_MethodKullanimi.C07_AsalMiMethodu;

import java.util.ArrayList;
import java.util.List;

public class C05_AsalSayiList {
    public static void main(String[] args) {

        /*
        5- Verilen baslangic ve bitis degerleri dahil olmak uzere
        aralarindaki asal sayilari bir liste olarak donduren bir method olusturun.
         */

        System.out.println(asalSayiListesi(5, 20));

    }
    public static List<Integer> asalSayiListesi(int baslangic, int bitis){

        List<Integer> asalSayilarListesi=new ArrayList<>();

        for (int i = baslangic; i <=bitis ; i++) {

            if (C07_AsalMiMethodu.asalMi(i)){

                asalSayilarListesi.add(i);
            }
            
        }
        return asalSayilarListesi;
        
    }
}
