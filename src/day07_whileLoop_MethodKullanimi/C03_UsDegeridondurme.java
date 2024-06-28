package day07_whileLoop_MethodKullanimi;

public class C03_UsDegeridondurme {
    public static void main(String[] args) {
        // 3- Verilen bir sayi icin istenen üs değerini hesaplayip döndüren bir method olusturun
    }
    public static int usHesapla(int sayi,int us){
        int sonuc=1;

        while(us>0){
            sonuc *= sayi;
            us--;
        }
        return sonuc;
    }
}
