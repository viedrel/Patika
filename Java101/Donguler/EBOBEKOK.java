import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[] args) {
        int n1, n2, ebob=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        int i = 1;
        while ( i <= n1) {
            i++;
            if (n1%i == 0 && n2%i == 0) {
                ebob = i;
            }
        }
        System.out.println("EBOB: "+ebob+"\nEKOK: "+(n1*n2)/ebob);
    }
}
