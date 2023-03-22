import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int mat, fiz, kim, biyo, tarih, muzik;

            Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fiz = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kim = inp.nextInt();
        System.out.print("Biyoloji notunuz : ");
        biyo = inp.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        double ort = (mat+fiz+kim+biyo+tarih+muzik)/6;

        System.out.println("Ortalamaniz: "+ort);
        String sonuc = ((ort > 60.0 ? "Gectiniz." : "Kaldiniz."));

        System.out.println(sonuc);



    }
}