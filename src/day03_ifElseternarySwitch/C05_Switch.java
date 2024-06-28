package day03_ifElseternarySwitch;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi olarak kacinci ayda oldugumuzu giriniz: ");

        int ayNo=scan.nextInt();

        if (ayNo==1 || ayNo== 2 || ayNo==12){
            System.out.println("Kis");
        } else if (ayNo==3 || ayNo==4 || ayNo==5) {
            System.out.println("Ilkbahar");
        } else if (ayNo==6|| ayNo==7 || ayNo==8) {
            System.out.println("Yaz");

        } else if (ayNo==9 || ayNo==10|| ayNo==11 ) {
            System.out.println("Sonbahar");
        }else {
            System.out.println("Ay numarasi 1-12 arasinda olmali...");
        }

        
    }
}
