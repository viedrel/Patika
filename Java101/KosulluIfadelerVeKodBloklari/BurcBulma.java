import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int gun;
        String ay;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        ay = inp.nextLine();
        System.out.print("Doğduğunuz gün: ");
        gun = inp.nextInt();

        if ( ay.equals("Aralık") || ay.equals("aralık")) {
            if ( gun >= 22 ) {
                System.out.println("Oğlak burcusunuz.");
            } else {
                System.out.println("Yay burcusunuz.");
            }
        } else if ( ay.equals("Ocak") || ay.equals("ocak")) {
            if ( gun <= 21 ) {
                System.out.println("Oğlak burcusunuz.");
            } else {
                System.out.println("Kova burcusunuz.");
            }
        } else if ( ay.equals("Şubat") || ay.equals("şubat")) {
            if ( gun <= 19 ) {
                System.out.println("Kova burcusunuz.");
            } else {
                System.out.println("Balık burcusunuz.");
            }
        } else if ( ay.equals("Mart") || ay.equals("mart")) {
            if ( gun <= 20 ) {
                System.out.println("Balık burcusunuz.");
            } else {
                System.out.println("Koç burcusunuz.");
            }

        } else if ( ay.equals("Nisan") || ay.equals("nisan")) {
            if ( gun <= 20 ) {
                System.out.println("Koç burcusunuz.");
            } else {
                System.out.println("Boğa burcusunuz.");
            }
        } else if ( ay.equals("Mayıs") || ay.equals("mayıs")) {
            if ( gun <= 21 ) {
                System.out.println("Boğa burcusunuz.");
            } else {
                System.out.println("İkizler burcusunuz.");
            }
        } else if ( ay.equals("Haziran") || ay.equals("haziran")) {
            if ( gun <= 22) {
                System.out.println("İkizler burcusunuz.");
            } else {
                System.out.println("Yengeç burcusunuz.");
            }
        } else if ( ay.equals("Temmuz") || ay.equals("temmuz")) {
            if ( gun <= 22) {
                System.out.println("Yengeç burcusunuz.");
            } else {
                System.out.println("Aslan burcusunuz.");
            }
        } else if ( ay.equals("Ağustos") || ay.equals("ağustos")) {
            if ( gun <= 23) {
                System.out.println("Aslan burcusunuz.");
            } else {
                System.out.println("Başak burcusunuz.");
            }
        } else if ( ay.equals("Eylül") || ay.equals("eylül")) {
            if ( gun <= 22 ) {
                System.out.println("Başak burcusunuz.");
            } else {
                System.out.println("Terazi burcusunuz.");
            }
        } else if ( ay.equals("Ekim") || ay.equals("ekim")) {
            if ( gun <= 23 ) {
                System.out.println("Terazi burcusunuz.");
            } else {
                System.out.println("Akrep burcusunuz.");
            }
        } else if ( ay.equals("Kasım") || ay.equals("kasım")) {
            if ( gun <= 21) {
                System.out.println("Akrep burcusunuz.");
            } else {
                System.out.println("Yay burcusunuz.");
            }
        }
    }
}
