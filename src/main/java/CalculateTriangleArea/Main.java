package CalculateTriangleArea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz: ");
        int a = girdi.nextInt();
        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        int b = girdi.nextInt();
        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        int c = girdi.nextInt();

        // üçgenin çevrelerinin toplamının yarısı bize u yu verir
        double u = (a + b + c) / 2;

        // bu formülde u yu kullanarak alanı buluruz
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + area);

    }
}
