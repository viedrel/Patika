import java.util.Scanner;
public class UsHesabi {
    static void exponent() {
        int base, power;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyıı giriniz: ");
        base = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        power = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("Sonuç: "+result);
    }
    public static void main(String[] args) {
        exponent();
    }
}
