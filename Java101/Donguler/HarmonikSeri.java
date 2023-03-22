import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        int i, number;
        double result= 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scan.nextInt();

        for (i = 1; i <= number; i++) {
            result += (1.0/i);
        }
        System.out.println(result);
    }
}
