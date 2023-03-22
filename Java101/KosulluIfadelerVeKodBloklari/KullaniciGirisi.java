import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, question;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız.");
        } else {
            System.out.print("Şifreniz hatalı, yeni şifre oluşturmak ister misiniz?: ");
            question = inp.nextLine();
                if (question.equals("Evet")) {
                    System.out.print("Yeni şifre: ");
                    password = inp.nextLine();
                    if (password.equals("java123")) {
                        System.out.print("Eski şifrenizden farklı bir şifre girin.");
                        password = inp.nextLine();
                    } else {
                        System.out.print("Şifreniz oluşturuldu.");
                    }
                } else {
                    System.out.print("Lütfen tekrar deneyin.");
                }
        }
    }
}


