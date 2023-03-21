import java.util.Scanner;
public class HavaDurumunaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık değeri giriniz: ");
        sicaklik = inp.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } else {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
