import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (a >= h) {
            System.out.println(1);
        } else if (b >= a) {
            System.out.println("Никогда");
        } else {
            int i = 0;
            int days = 0;
            while (i < h) {
                days++;
                i += a;
                if (i >= h) {
                    break;
                }
                i -= b;
            }
            System.out.println(days);
        }
        scanner.close();
    }
}