import java.util.Scanner;
public class DeseneGoreMetot {
    static void pattern() {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int a = myScanner.nextInt();

        int result = a;

        System.out.print("Çıktısı  :");

        for (int i = 0; result > 0; i++) {
            System.out.print(" " + result);
            result = result - 5;

        }
        for (int j = 1; result <= a; j++) {
            System.out.print(" " + result);
            result = result + 5;

        }
        System.out.println();
        pattern();
    }

    public static void main(String[] args) {
        pattern();
    }
}
