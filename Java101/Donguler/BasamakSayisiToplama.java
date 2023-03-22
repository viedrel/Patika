import java.util.Scanner;
public class BasamakSayisiToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int total=0, basValue;

        while (number != 0) {
            basValue = number % 10;
            total += basValue;
            number /= 10;
        }
        System.out.println(total);
    }
}
