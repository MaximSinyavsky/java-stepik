
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: n должно быть целым числом.");
            return;
        }
        int n = scanner.nextInt();
        if (n < 3 || n > 300) {
            System.err.println("Ошибка: n должно быть в диапазоне от 3 до 300.");
            return;
        }
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextLong()) {
                System.err.println("Ошибка: x_i должно быть целым числом.");
                return;
            }
            x[i] = scanner.nextLong();
            if (x[i] < -1_000_000_000 || x[i] > 1_000_000_000) {
                System.err.println("Ошибка: x_i должно быть в диапазоне от -10^9 до 10^9.");
                return;
            }
            if (!scanner.hasNextLong()) {
                System.err.println("Ошибка: y_i должно быть целым числом.");
                return;
            }
            y[i] = scanner.nextLong();
            if (y[i] < -1_000_000_000 || y[i] > 1_000_000_000) {
                System.err.println("Ошибка: y_i должно быть в диапазоне от -10^9 до 10^9.");
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i] == x[j] && y[i] == y[j]) {
                    System.err.println("Ошибка: все точки должны быть различными.");
                    return;
                }
            }
        }
        boolean[] used = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (used[i] || used[j] || used[k]) {
                        continue;
                    }
                    long area = x[i] * (y[j] - y[k]) + x[j] * (y[k] - y[i]) + x[k] * (y[i] - y[j]);
                    if (area != 0) {
                        count++;
                        used[i] = true;
                        used[j] = true;
                        used[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}