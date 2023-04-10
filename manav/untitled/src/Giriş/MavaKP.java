package Giriş;
import java.util.Scanner;

public class MavaKP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican;

        System.out.print("Lütfen armutun kilosunu(kg) girin: ");
         armut= input.nextDouble();
        System.out.print("Lütfen elmanın kilosunu(kg) girin: ");
         elma= input.nextDouble();
        System.out.print("Lütfen domatesin kilosunu(kg) girin: ");
         domates= input.nextDouble();
        System.out.print("Lütfen muzun kilosunu(kg) girin: ");
         muz= input.nextDouble();
        System.out.print("Lütfen patlicanın kilosunu(kg) girin: ");
         patlican= input.nextDouble();


        double armutPrice = armut * 2.14, elmaPrice = elma * 3.67,
               domatesPrice = domates * 1.11, muzPrice = muz * 0.95,
               patlicanPrice = patlican * 5;

        System.out.println("Armut kg: " + armut + "   Armutun tutar: "+ armutPrice +
                            "\nElma kg: " + elma + "   Elmanın tutarı: " + elmaPrice +
                            "\nDomates kg: " + domates + "   Domatesin tutar: " + domatesPrice +
                            "\nMuz kg: " + muz + "   Muzun tutar: " + muzPrice +
                            "\nPatlican kg: " + patlican + "   Patlicanın tutar: " + patlicanPrice);
        System.out.print("Toplam Fiyat:" + (armutPrice+elmaPrice+domatesPrice+muzPrice+patlicanPrice));


    }
}
