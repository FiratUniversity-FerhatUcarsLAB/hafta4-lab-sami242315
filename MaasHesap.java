/*
 * Ad Soyad: [Sami Yusuf Yıldız]
 * Ogrenci No: [250541081]
 * Tarih: [25.10.2025]
 * Aciklama: [Gorev 3- Maaş Hesaplama]
 */
   import java.util.Scanner;

public class MaasHesaplamaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bilgiler alınır
        System.out.print("Ad Soyad: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        // Kesinti oranları
        double sigortaKesintisiOrani = 0.14;
        double gelirVergisiOrani = 0.15;
        double damgaVergisiOrani = 0.00759;

        // Kesinti hesaplamaları
        double sigortaKesintisi = brutMaas * sigortaKesintisiOrani;
        double gelirVergisi = brutMaas * gelirVergisiOrani;
        double damgaVergisi = brutMaas * damgaVergisiOrani;

        // Toplam kesinti ve net maaş
        double toplamKesinti = sigortaKesintisi + gelirVergisi + damgaVergisi;
        double netMaas = brutMaas - toplamKesinti;

        // Sonuçları ekrana yazdır
        System.out.println("\n----- Maaş Hesaplama Sonucu -----");
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Aylık Brüt Maaş: " + brutMaas + " TL");
        System.out.println("Haftalık Çalışma Saati: " + haftalikSaat + " saat\n");

        System.out.printf("Sigorta Kesintisi (%%14): %.2f TL%n", sigortaKesintisi);
        System.out.printf("Gelir Vergisi (%%15): %.2f TL%n", gelirVergisi);
        System.out.printf("Damga Vergisi (%%0.759): %.2f TL%n", damgaVergisi);
        System.out.println("------------------------------------");
        System.out.printf("Toplam Kesinti: %.2f TL%n", toplamKesinti);
        System.out.printf("Net Maaş: %.2f TL%n", netMaas);

        input.close();
    }
}
--- Maaş Hesaplama Özeti ---
Ad Soyad            : Sami Yusuf Yıldız
Brüt Maaş           : 30000.0 TL
Haftalık Çalışma    : 35.0 saat
SGK Kesintisi       : 4200.0 TL
Gelir Vergisi       : 4500.0 TL
Damga Vergisi       : 227.7 TL
Toplam Kesinti      : 8927.7 TL
Net Maaş            : 21072.3 TL
