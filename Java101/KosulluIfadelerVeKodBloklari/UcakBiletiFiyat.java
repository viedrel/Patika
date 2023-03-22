import java.util.Scanner;
public class UcakBiletiFiyat {
    public static void main(String[] args) {
        double mesafe, yas, normalTutar, yasIndirimi, yasIndirimOrani, indirimliTutar, gidisDonusIndirimi, toplamTutar, mesafeBasi = 0.10;
        byte tip;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = inp.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextDouble();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = inp.nextByte();

        switch (tip) {
            case 1:
                if (yas < 12 && yas >= 0) {
                    normalTutar = (mesafe) * (mesafeBasi);
                    yasIndirimOrani = 0.50;
                    yasIndirimi = (normalTutar) * (yasIndirimOrani);
                    indirimliTutar = (normalTutar) - (yasIndirimi);
                    toplamTutar = indirimliTutar;
                    System.out.println("Toplam tutarınız: " + toplamTutar);

                } else if (yas >= 12 && yas <= 24) {
                    normalTutar = (mesafe) * (mesafeBasi);
                    yasIndirimOrani = 0.10;
                    yasIndirimi = (normalTutar) * (yasIndirimOrani);
                    indirimliTutar = (normalTutar) - (yasIndirimi);
                    toplamTutar = indirimliTutar;
                    System.out.println("Toplam tutarınız: " + toplamTutar);

                } else if (yas > 65) {
                    normalTutar = (mesafe) * (mesafeBasi);
                    yasIndirimOrani = 0.30;
                    yasIndirimi = (normalTutar) * (yasIndirimOrani);
                    indirimliTutar = (normalTutar) - (yasIndirimi);
                    toplamTutar = indirimliTutar;
                    System.out.println("Toplam tutarınız: " + toplamTutar);
                } else {
                    System.out.println("Hatalı veri girdiniz!");
                }
                break;
            case 2:
                if (yas < 12 && yas >= 0) {
                    normalTutar = (mesafe) * (mesafeBasi);
                    yasIndirimOrani = 0.50;
                    yasIndirimi = (normalTutar) * (yasIndirimOrani);
                    indirimliTutar = (normalTutar) - (yasIndirimi);
                    gidisDonusIndirimi = (indirimliTutar) * (0.20);
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * (2);
                    System.out.println("Toplam tutarınız: " + toplamTutar);
                } else if ( yas >= 12 && yas <= 24) {
                    normalTutar = (mesafe) * (mesafeBasi);
                    yasIndirimOrani = 0.10;
                    yasIndirimi = (normalTutar) * (yasIndirimOrani);
                    indirimliTutar = (normalTutar) - (yasIndirimi);
                    gidisDonusIndirimi = (indirimliTutar) * (0.20);
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * (2);
                    System.out.println("Toplam tutarınız: " + toplamTutar);
                } else if (yas > 65) {
                    normalTutar = (mesafe) * (mesafeBasi);
                    yasIndirimOrani = 0.30;
                    yasIndirimi = (normalTutar) * (yasIndirimOrani);
                    indirimliTutar = (normalTutar) - (yasIndirimi);
                    gidisDonusIndirimi = (indirimliTutar) * (0.20);
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * (2);
                    System.out.println("Toplam tutarınız: " + toplamTutar);
                } else {
                    System.out.println("Hatalı veri girdiniz!");
                }
                    break;
            default:
                System.out.println("Hatalı veri girdiniz!");
                break;
        }
    }
}
