package day10_ListsExceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ListedenIsimAlma {
    public static void main(String[] args) {
        /*
        3- Verilen bir listeden, verilen istenmeyen harf iceren isimleri silip,
        kalan isimleri bir list olarak donduren bir method olusturun
         */
        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Cem"));
        String istenmeyenHarf = "e";

        for (int i = 0; i < isimler.size(); i++) {

            //i. indexteki isim istenmeyenHarf iceriyorsa i. indexteki ismi silelim.
            if (isimler.get(i).contains(istenmeyenHarf)) {

                isimler.remove(i);
                i--;

            }
        }
        System.out.println(isimler);
    }

    public static List<String> istenmeyenIsimleriSil(List<String> isimler, String istenmeyenHarf) {

        for (int i = 0; i < isimler.size(); i++) {

            //i. indexteki isim istenmeyenHarf iceriyorsa i. indexteki ismi silelim.
            if (isimler.get(i).contains(istenmeyenHarf)) {

                isimler.remove(i);
                i--;

            }


    }return isimler;
    }
}
