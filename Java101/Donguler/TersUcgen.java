import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int i, n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak sayısı girin: ");
        n = inp.nextInt();

        for(i = n - 1; i > 0; i--){
            for(int j = 0; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
