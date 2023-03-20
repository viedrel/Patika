import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        double km, tutar, kmBasi = 2.20, acilis = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç km gittiniz? : ");
        km = input.nextDouble();
        tutar = (km * kmBasi) + acilis;
        tutar = (tutar<20.0 ? 20.0 : tutar);

        System.out.print("Tutar: "+tutar);

    }
}
