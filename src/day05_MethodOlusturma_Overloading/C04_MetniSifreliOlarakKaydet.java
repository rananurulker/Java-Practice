package day05_MethodOlusturma_Overloading;

import java.util.Scanner;

public class C04_MetniSifreliOlarakKaydet {
    public static void main(String[] args) {

        // Verilen bir cumleyi sifrelememiz isteniyor.
// Metni sifrelemek icin her harf kucuk harfe cevrilecek
// ve kendisinden 5 sonraki harfle degistirilecektir (a->f, b->g… gibi),
// eger 5 harf sayarken z'ye gelindiyse basa a harfine donulecektir. (u->z, w->a, x->b.. gibi),
// harf disinda sayi, ozel karakter varsa onlar degistirilmeyecektir.

//Kullanicidan bir metin isteyin, aldiginiz metni sifreli hale getirip cevirip
        //o heliyle kaydedin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scan.nextLine();

       // C03_SifreliYazdirma.sifreliYazdir(metin);

        sifreliMetniDondur(metin);
        //method calisirip sifreli halini bize getirir.
        //eger sadece yazdirmak istiyorsak, kod dunyasinda gelen sonucu yazidrmaliyiz.
        System.out.println(sifreliMetniDondur(metin));


    }

    //metni sifreleyeip, sifreli halini kod dunyasina donduren bir method olusturalim.
    public static String sifreliMetniDondur(String metin) {// Metni sifrelemek icin her harf kucuk harfe cevrilecek
        metin = metin.toLowerCase();
        String sifreliMetin = "";


        //her bir karakteri alip, sifreleme mantigiyla degistirip,
        //sifreliMetin'e ekle.

        for (int i = 0; i < metin.length(); i++) {

            char karakter = metin.charAt(i);
            if (Character.isLetter(karakter)) {//harf olanlar bu suzgecle yakalanir.
                if (karakter <= 'u') {
                    sifreliMetin += (char) (karakter + 5);

                } else {
                    sifreliMetin += (char) (karakter + 5 - 26);
                    //26 z-> 122den sonra a-97ye gecmek icin
                }


            } else { //harf olmayanlar icin
                sifreliMetin += karakter;


            }

        }return sifreliMetin;


    }
}
