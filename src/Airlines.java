import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Ya��n�z� giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini se�iniz (1: Tek Y�n, 2: Gidi�-D�n��): ");
        int yolculukTipi = scanner.nextInt();

        // Ge�erlilik kontrol�
        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatal� Veri Girdiniz!");
            return;
        }

        // Mesafe ba��na �cret
        double kmFiyat = 0.10;
        double toplamFiyat = mesafe * kmFiyat;

        // �ndirim hesaplama
        if (yas < 12) {
            toplamFiyat *= 0.5; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            toplamFiyat *= 0.9; // %10 indirim
        } else if (yas >= 65) {
            toplamFiyat *= 0.7; // %30 indirim
        }

        if (yolculukTipi == 2) {
            toplamFiyat *= 0.8; // %20 indirim
        }

        // Sonucu yazd�rma
        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");

        scanner.close();
    }
}
