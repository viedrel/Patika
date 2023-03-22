import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOrani, tutar, kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat giriniz: ");
        tutar = input.nextDouble();
        kdvOrani = (tutar<1000.0 ? 0.18 : 0.08);
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV orani: "+kdvOrani);
        System.out.println("KDV tutari: "+kdvTutari);
        System.out.println("KDV'li tutar: "+kdvliTutar);





    }
}