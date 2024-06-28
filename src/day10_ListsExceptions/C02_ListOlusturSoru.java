package day10_ListsExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_ListOlusturSoru {
    public static void main(String[] args) {
        /*
        2- Kullanicidan listeye eklenmek uzere isimler isteyip,
        kullanici Q girince girilen isimleri bir list olarak donduren bir method olusturun
         */


    }
    public static List<String> isimListOlustur() {
        List <String> isimler= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String isim="";
        do {
            System.out.print("lutfen listeye eklenecek ismi giriniz: ");
            isim = scanner.nextLine();

            if (!isim.equalsIgnoreCase("q"));
            isimler.add(isim);
        }
            while (!isim.equalsIgnoreCase("q")) ;

        return isimler;

    }
}
