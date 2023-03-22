import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        int n, r;
        Scanner scan = new Scanner(System.in);

        System.out.println("C(n,r):");
        System.out.println("n'i giriniz: ");
        n = scan.nextInt();
        System.out.println("r'yi giriniz: ");
        r = scan.nextInt();

        int totaln=1;
        int totalr=1;
        int totalnr=1;

        for(int i=1; i<=n ; i++){
            totaln = totaln*i;
        }
        for(int i=1; i<=r; i++){
            totalr = totalr*i;
        }
        for(int i=1; i<=(n-r); i++){
            totalnr = totalnr*i;
        }

        System.out.println(" Kombinasyon: C("+n+","+r+") = "+(totaln/(totalr*totalnr)));

        scan.close();


    }
}
