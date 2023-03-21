import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int cinZodyagi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        cinZodyagi = inp.nextInt();

        if (cinZodyagi%12 == 0) {
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (cinZodyagi%12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        } else if (cinZodyagi%12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        } else if (cinZodyagi%12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        } else if (cinZodyagi%12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        } else if (cinZodyagi%12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        } else if (cinZodyagi%12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        } else if (cinZodyagi%12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        } else if (cinZodyagi%12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        } else if (cinZodyagi%12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        } else if (cinZodyagi%12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        } else if (cinZodyagi%12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
    }

}
