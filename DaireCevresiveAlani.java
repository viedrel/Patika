import java.util.Scanner;
public class DaireCevresiveAlani {
    public static void main(String[] args) {
        double pi = 3.14, yariCap, aciOlcusu, cevre, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yariCap = input.nextDouble();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
        aciOlcusu = input.nextDouble();

        cevre = 2 * pi * yariCap;
        alan = pi * (yariCap*yariCap) * (aciOlcusu/360);

        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Dairenin alanı: "+alan);

    }
}
