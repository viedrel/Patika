import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Giriş yaptınız.");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktar: ");
                            int priceB = input.nextInt();
                            if (balance > priceB) {
                                balance -= priceB;
                            } else {
                                System.out.println("Yetersiz bakiye.");
                            } break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                    }

                }while (select != 4);
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}