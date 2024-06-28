package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class day07_whileLoop_MethodKullanimi {
    public static void main(String[] args) {
        //1- Kullanicidan pozitif bir tamsayi ve hesaplamak istedigi üs değerini alıp sonucu yazdırın.

        //sayi=2, us 3 ise 2*2*2=8 diyecegiz

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");
        int sayi= scanner.nextInt();

        System.out.println("Lutfen hesaplamak istedginiz us icin pozitif bir tam sayi giriniz: ");
        int us= scanner.nextInt();

        int sonuc=1;

        while (us>0){
            sonuc=sonuc*sayi;
            us--;
        }
        System.out.println("islem sonucu: "+ sonuc);
    }
}
