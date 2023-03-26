import java.util.Scanner;
public class HarmonicMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kullanıcıdan sayı dizisini al
        System.out.print("Lütfen sayı dizisini girin (virgülle ayrılmış): ");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        double[] numbers = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Double.parseDouble(parts[i].trim());
        }

        // harmonik ortalamayı hesapla
        double harmonicMean = harmonicMean(numbers);

        // sonucu ekrana yazdır
        System.out.println("Sayıların harmonik ortalaması: " + harmonicMean);
    }

    public static double harmonicMean(double[] numbers) {
        int n = numbers.length;
        double harmonicSum = 0;
        for (double num : numbers) {
            harmonicSum += 1 / num;
        }
        return n / harmonicSum;
    }
}
