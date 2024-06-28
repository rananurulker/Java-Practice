package day10_ListsExceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C04_OrtalamaNot {
    public static void main(String[] args) {
        /*
        4- Ogretmenden istedigi kadar not alip,
        ogretmen Q’ya bastiginda girilen not sayisini,
        girilen notlarin ortalamasini ve
        ortalama uzerindeki ogrenci sayisini yazdiran bir method olusturun
         */
        notDegerlendir();
    }

        public static void notDegerlendir(){

            List<Double> notListesi=new ArrayList<>();
            Scanner scanner=new Scanner(System.in);
            double not=0;
            String notOlmayanGiris="";

            do {
                System.out.println("Ogrenci nptu giriniz, bitirmek icin Qya basiniz: ");

                try {
                    not=scanner.nextDouble();
                    notListesi.add(not);
                } catch (InputMismatchException e) {
                    //try bolumunde nextDouble kullanildigindan
                    //double olmayan herhangi bir deger girildiginde exception olusacak
                    // ve kod bu satira gelecek
                    notOlmayanGiris=scanner.nextLine();
                    if (notOlmayanGiris.equalsIgnoreCase("q")){
                        System.out.println("mesaja uygun girs yap");
                    }
                }

            }while (!notOlmayanGiris.equalsIgnoreCase("q"));

            System.out.println(notListesi.size()+"adet not girdiniz.");

            double notToplami=0;

            for (double each : notListesi) {
                notToplami+=each;

            }
            double ortalama =notToplami/notListesi.size();

            System.out.println("Girilen notlarin ortalamasi: "+ notToplami/notListesi.size());

            int ortalamaUzerindekiOgrenciSayisi=0;
            for (double each : notListesi) {
                if (each>ortalama){
                    ortalamaUzerindekiOgrenciSayisi++;
                }

            }

            System.out.println("Ortalama uzerindeki ogrenci sayisi: "+ortalamaUzerindekiOgrenciSayisi);




        }
    }

