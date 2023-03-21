import java.util.Scanner;
public class OrtakKatOrt {
    public static void main(String[] args) {
        int sayi, i, count = -1, toplam=0;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (i = 0 ; i <= sayi ; i++) {
            if (i%12 == 0) {
                count++;
                toplam += i;
            }
        }
        ort = (toplam) / (count);
        System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması: "+ort);
    }
}

