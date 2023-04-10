package Giriş;
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight; double height;

        System.out.print("Lütfen kilonuzu (kg) girin: ");
        weight = input.nextDouble();
        System.out.print("Lütfen boyunuzu (m) girin: ");
        height = input.nextDouble();

        double bodyIndex = (weight / (height * height));
        System.out.println("Vücut Kitle Endeksiniz: " + bodyIndex);




    }
}
