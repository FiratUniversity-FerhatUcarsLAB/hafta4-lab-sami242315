/*
 * Ad Soyad: [Sami Yusuf Yıldız]
 * Ogrenci No: [250541081]
 * Tarih: [25.10.2025]
 * Aciklama: Gorev 2 Geometrik Hesap
 */
 import java.util.Scanner;

public class GeometriHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yarıçap al
        System.out.print("Yarıçapı giriniz: ");
        double r = input.nextDouble();

        // Daire hesaplamaları
        double cap = 2 * r;
        double daireAlani = Math.PI * r * r;
        double daireCevresi = 2 * Math.PI * r;

        // Küre hesaplamaları
        double kureAlani = 4 * Math.PI * r * r;
        double kureHacmi = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        // Sonuçları yazdır
        System.out.println("\n--- Hesap Sonuçları ---");
        System.out.println("Dairenin Çapı       : " + cap);
        System.out.println("Dairenin Alanı      : " + daireAlani);
        System.out.println("Dairenin Çevresi    : " + daireCevresi);
        System.out.println("Kürenin Alanı       : " + kureAlani);
        System.out.println("Kürenin Hacmi       : " + kureHacmi);

        input.close();
    }
}
