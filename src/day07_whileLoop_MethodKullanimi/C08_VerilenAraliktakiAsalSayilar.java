package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class C08_VerilenAraliktakiAsalSayilar {
    public static void main(String[] args) {
        /*
        Kullanicidan baslagic ve bitis degerleirni alin.
        bu degerler dahil olarak aralarindaki asal sayilari yazdirin.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir baslangic sayisi giriniz: ");
        int baslangic = scanner.nextInt();
        System.out.println("Lutfen bir bitis sayisi giriniz: ");
        int bitis = scanner.nextInt();

        while (baslangic <= bitis) {
            if (C07_AsalMiMethodu.asalMi(baslangic)) {
                System.out.println(baslangic + " ");

            }
            baslangic++;
        }
    }
}
