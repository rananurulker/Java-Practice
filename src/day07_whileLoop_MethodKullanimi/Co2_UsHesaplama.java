package day07_whileLoop_MethodKullanimi;

public class Co2_UsHesaplama {

    public static void main(String[] args) {
        //2- Verilen bir sayi icin istenen
        // üs değerini hesaplayip yazdiran bir method olusturun

        usYazdir(3,4);
    }
    public static void usYazdir(int sayi,int us){

        int sonuc=1;
        while (us>0){
            sonuc *= sayi;
            us--;

        }
        System.out.println("islem sonucu: "+ sonuc);
    }
}
