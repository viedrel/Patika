import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int islem;
        Scanner inp = new Scanner(System.in);

        System.out.print("İlk değeri giriniz: ");
        int deger1 = inp.nextInt();
        System.out.print("İkinci değeri giriniz: ");
        int deger2 = inp.nextInt();

        System.out.println("Toplama için '1'\nÇıkarma için'2' \nÇarpma için '3' \nBölme için '4'\n");
        System.out.print("Seçiminiz: ");
        islem = inp.nextInt();
        switch (islem) {
            case 1:
                islem = deger1 + deger2;
                System.out.println("Sonuç: "+islem);
                break;
            case 2:
                islem = deger1 - deger2;
                System.out.println("Sonuç: "+islem);
                break;
            case 3:
                islem = deger1 * deger2;
                System.out.println("Sonuç: "+islem);
                break;
            case 4:
                islem = deger1 / deger2;
                System.out.println("Sonuç: "+islem);
                break;
            default:
                System.out.print("Geçersiz işlem.");

        }
    }
}