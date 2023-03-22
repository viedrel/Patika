import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int i, k, t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        i = scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = scan.nextInt();
        int total = 1;

        for (t = 1; t <= k; t++) {
            total *= i;
        }
        System.out.println("Sonuç: "+total);
    }
}
