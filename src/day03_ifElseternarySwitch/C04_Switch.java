package day03_ifElseternarySwitch;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {

        //4- Kullanicinin 2 basamakli bir sayi alip, sayiyi yazi ile yazdirin.
        Scanner scan=new Scanner(System.in);

        System.out.print("lutfen iki basamakli pozitif bir tam sayi giriniz: ");
        int girilenSayi=scan.nextInt();

        int birlerbasamagindakiRakam=girilenSayi%10;
        int onlarBasamagindakiRakam=girilenSayi/10;

        // once onlar basamagindaki rakami yazi ile yazdiralim.
        // 0,1,2,3,4,5,6,7,8,9

        switch (onlarBasamagindakiRakam){
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kirk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");

        }

        switch (birlerbasamagindakiRakam){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");

        }
    }
}
