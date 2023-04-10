package Giriş;
import java.util.Scanner;

public class DaireAlanı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int r, degree; double pi=3.14;

        System.out.print("Lütfen r uzunluğu girin: ");
        r = input.nextInt();
        System.out.print("Lütfen açıyı girin: ");
        degree = input.nextInt();

        double area = (pi * r * r * degree)/360;
        System.out.println("Dairenin alanı: " + area);








    }
}
