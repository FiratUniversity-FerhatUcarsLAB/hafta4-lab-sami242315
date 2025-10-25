/
Ad Soyad:Sami Yusuf Yıldız
Öğrenci No:250541081
Tarih:25/10/2025
Açıklama:Geometrik Hesap Java
                             /
  import java.util.Scanner;

public class StudentInfoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci numaranızı girin: ");
        String ogrenciNo = input.nextLine();

        System.out.print("Yaşınızı girin: ");
        int yas = input.nextInt();

        System.out.print("Not ortalamanızı girin: ");
        double notOrtalamasi = input.nextDouble();

        System.out.println("\n----- Öğrenci Bilgileri -----");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Öğrenci Numarası: " + ogrenciNo);
        System.out.println("Yaş: " + yas);
        System.out.println("Not Ortalaması: " + notOrtalamasi);

        input.close();
    }
}
