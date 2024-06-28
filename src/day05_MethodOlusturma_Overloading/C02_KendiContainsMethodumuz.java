package day05_MethodOlusturma_Overloading;

public class C02_KendiContainsMethodumuz {

    public static void main(String[] args) {

        // Verilen bir String’de, verilen bir char karakterin bulunup bulunmadigini
        // kontrol edip varsa true, yoksa false donduren kendiContains( ) method’umuzu olusturun

        //Ornek: metin-> Java Candir, aranan karakter: a

        String str="Java Candir";
        System.out.println(kendiContains(str, 'a'));
        System.out.println(kendiContains(str, 'b'));

        //verilen metinde aranan char varsa "gorev tamamlandi"
        //char yoksa yeniden denemelisin yazdirin.

        kendiContains(str,'k');

        if (kendiContains(str,'k')==true){//sari yazar cunku asagida olusturdugumuz
            // methodun kendisinde boolean var.
            //ifin icine yazidigimiz sey booleansa ==true demeye gerek yok
            System.out.println("Gorev tamamlandi");
        }else {
            System.out.println("Yeniden denemelisin");
        }
    }

    public static boolean kendiContains(String metin,char arananKarakter){

        boolean sonuc= false;
        for (int i = 0; i <metin.length() ; i++) {
          if (metin.charAt(i)==arananKarakter){
              sonuc=true;
          }
        }
        return sonuc;
    }
}
