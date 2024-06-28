package day03_ifElseternarySwitch;

import java.util.Scanner;

public class C01_VucutkitleIndexi {
    public static void main(String[] args) {

       //1- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        // hesaplayin  (kilo*10000 / (boy *boy)) ve kisiye durumunu raporlayin
       //vucut kitle endeksi :
       //- 30’dan buyukse obez,
       //        - 25-30 arasi ise kilolu,
       //        - 20-25 arasi ise normal,
       //        - 20’den kucukse zayif yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen KG olarak kilonuzu giriniz: ");
        double kilo= scan.nextDouble();

        System.out.print("Lutfen cm olarak boyunuzu giriniz: ");
        double boy= scan.nextDouble();

        double vke=(kilo*10000/(boy*boy));
        System.out.println("vucut kitle endeksiniz: "+ vke);

        if(vke>30){
            System.out.println("Durumunuz: OBEZ");
        } else if (vke>25) {
            System.out.println("Drumunuz: KILOLU");

        } else if (vke>20&&vke<=25) {
            System.out.println("Durumunu: NORMAL");

        }else {
            System.out.println("Durumunuz: ZAYIF");
        }
    }
}
