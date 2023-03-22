import java.util.Scanner;
public class DortBesKuvvet {
    public static void main(String[] args) {
        int n, i, k;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n = scan.nextInt();
        for (i = 1; i <= n; i *= 20) {
            System.out.print("\n"+i);
        }
    }

}
