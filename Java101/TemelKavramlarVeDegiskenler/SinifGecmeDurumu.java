import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double ort;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        //Geçersiz notlar "0" olarak kabul ediliyor.
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz matematik notu, ortalamaya alınmayacak.");
            ort = (fizik + turkce + kimya + muzik) / 5;
        } else if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz fizik notu, ortalamaya alınmayacak.");
            ort = (mat + turkce + kimya + muzik) / 5;
        } else if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz türkçe notu, ortalamaya alınmayacak.");
            ort = (fizik + mat + kimya + muzik) / 5;
        } else if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz kimya notu, ortalamaya alınmayacak.");
            ort = (fizik + turkce + mat + muzik) / 5;
        } else if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz müzik notu, ortalamaya alınmayacak.");
            ort = (fizik + turkce + kimya + mat) / 5;
        } else {
            ort = (fizik + mat + turkce + kimya + muzik) / 5;
        }

        if (ort >= 55) {
                System.out.print("Geçtiniz.\nOrtalamanız: " +ort);
        } else {
                System.out.print("Kaldınız.\nOrtalamanız: " +ort);
            }
    }
}
