import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo, boy, kitle_endeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();

        kitle_endeks = kilo / (boy*boy);

        System.out.println("Vücut kitle endeksiniz: "+kitle_endeks);
    }
}
