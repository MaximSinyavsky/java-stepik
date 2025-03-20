import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double sqrtD = Math.sqrt(d);
            double x1 = (-b - sqrtD) / (2 * a);
            double x2 = (-b + sqrtD) / (2 * a);
            if (x1 > x2) {
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }
            System.out.println(x1 + " " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("без корней");
        }
        scanner.close();
    }
}