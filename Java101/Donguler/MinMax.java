import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int i, n, max, min, k;
        Scanner input = new Scanner(System.in);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz?: ");
        n = input.nextInt();

        for( i = 1; i <= n; i++) {
            System.out.print(i+". sayıyı girin: ");
            k = input.nextInt();
            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
        System.out.println("En büyük sayı: "+max+"\nEn küçük sayı: "+min);
    }
}
