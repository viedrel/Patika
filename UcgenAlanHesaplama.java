import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        double a, b, c, u, alan;


        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin a kenarını giriniz: ");
        a = input.nextDouble();
        System.out.print("Üçgenin b kenarını giriniz: ");
        b = input.nextDouble();
        System.out.print("Üçgenin c kenarını giriniz: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: "+alan);
    }

}
