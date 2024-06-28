package day03_ifElseternarySwitch;

import java.util.Scanner;

public class C02_TrafikCezasiHesaplama {
    public static void main(String[] args) {

        // Hiz sinirinin 50 km oldugu bir bolgede kullanicinin hizini alip,
// ceza miktarini hesaplayan bir program yazin
// (asagidaki sinirlarda baslangic dahil degil, bitis dahildir)
// * Eger Hiz 50-75 arasinda ise: Ceza 100 $'dir.
//  * Eger Hiz 75 - 90 arasinda ise: Ceza 150 $'dir.
//  * Eger Hiz 90'dan daha fazla ise: Ceza 500 $'dir.
//  Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
//  Orn: Hiz 77 iken ceza 150$'dir ama kullanicinin ehliyeti yoksa ceza 350 $ olur.
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen hizinizi giriniz: ");
        double hiz=scan.nextDouble();

        System.out.println("ehliyetiniz var mi?: \n1: Evet, 2:Hayir");
        int ehliyetVarMI= scan.nextInt();

        //ehliyet yoksa kismi olmasaydi sadece hizi dusunmek durumunda olacaktik.
        //verilen degisken 1den fazla ise bu durumda nested if-else kullanmaliyiz.
        //degiskenlerden birini ana degisken kabul edecegiz.
        //2 degisken var 1-hiz
        //2-ehliyet var mi?
        //ana degiskenimiz hangisi olsun karari verecegiz. burada ehliyet olacak.
        if(ehliyetVarMI==1) {
            //sadece ehliyeti olanlar kalir/
            if (hiz <= 50) System.out.println("Hiz sinirina uydugunuz icin tesekkur ederiz.");
            else if (hiz <= 75) System.out.println("cezanis: 100$");
            else if (hiz <= 90) System.out.println("cezaniz 150$");
            else System.out.println("Cezaniz 500$");
        }

        if(ehliyetVarMI==2) {
            //sadece ehliyeti olmayanlar kalir/
            if (hiz <= 50) System.out.println("Hiz sinirina uydugunuz icin tesekkur ederiz. \n Ancak ehliyetsiz arac kulanmak suctur");
            else if (hiz <= 75) System.out.println("cezanis: 300$");
            else if (hiz <= 90) System.out.println("cezaniz 350$");
            else System.out.println("Cezaniz 700$");
        }



        if (ehliyetVarMI==1){ //bu ifin icinde sadece ehliyeti olanlar var.
        } else if (ehliyetVarMI==2) {
            //bu suzgecin icinde ehliyeti olmayanlar.
        }else {
            System.out.println("Ehliyet var mi sorusuna 1 veya 2 olarak cevap vermelisiniz. ");
        }

        }

    }
