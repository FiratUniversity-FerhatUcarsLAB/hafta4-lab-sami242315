/
Ad Soyad:Sami Yusuf Yıldız
Öğrenci No:250541081
Tarih:25/10/2025
Açıklama:Geometrik Hesap Java
                             /
 import java.util.Scanner;

public class DaireKureHesaplamaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı girin: ");
        double r = input.nextDouble();
        double pi = Math.PI;

        // Daire hesaplamaları
        double daireAlani = pi * r * r;
        double daireCevresi = 2 * pi * r;

        // Küre hesaplamaları
        double kureAlani = 4 * pi * r * r;
        double kureHacmi = (4.0 / 3.0) * pi * r * r * r;

        System.out.println("\n----- Daire Hesaplamaları -----");
        System.out.println("Yarıçap: " + r);
        System.out.printf("Daire Alanı: %.2f%n", daireAlani);
        System.out.printf("Daire Çevresi: %.2f%n", daireCevresi);

        System.out.println("\n----- Küre Hesaplamaları -----");
        System.out.printf("Küre Alanı: %.2f%n", kureAlani);
        System.out.printf("Küre Hacmi: %.2f%n", kureHacmi);

        input.close();
    }
  } 
