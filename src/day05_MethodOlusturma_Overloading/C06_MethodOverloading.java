package day05_MethodOlusturma_Overloading;

public class C06_MethodOverloading {
    /*
    overloading bir methodu farkli farkli kullanabilmektir.
     */

    //Biz bir methodu overload etmek istersek ne yapariz?
    //Bir classda her seyi ayni olan iki method olusturulmaz
    //eger classda ayni isimde birden fazla method olusturmak isterseniz
    //signature farkli olmalidir.

   // signature= method adi ve parametrelerin data turudur
    //signature nasil farklilasir?
    //1-ismini degistirmek(o zaman overloading olmaz)
    //2- parametre sayisini degistirmek
    //3-parametrelerin data turlerini degistirme
    

    public static void main(String[] args) {

        String str = "java candir";
        System.out.println(str.replace('a','b'));
        System.out.println(str.replace("java","Java"));

        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));
    }
}
