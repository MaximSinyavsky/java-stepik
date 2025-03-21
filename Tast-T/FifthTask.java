import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: n должно быть целым числом.");
            return;
        }
        int n = scanner.nextInt();
        if (n < 1 || n > 250_000) {
            System.err.println("Ошибка: n должно быть в диапазоне от 1 до 250000.");
            return;
        }
        if (!scanner.hasNextLong()) {
            System.err.println("Ошибка: s должно быть целым числом.");
            return;
        }
        long s = scanner.nextLong();
        if (s < 1 || s > 1_000_000_000_000_000L) {
            System.err.println("Ошибка: s должно быть в диапазоне от 1 до 10^15.");
            return;
        }
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextLong()) {
                System.err.println("Ошибка: a_i должно быть целым числом.");
                return;
            }
            a[i] = scanner.nextLong();
            long maxAi = Math.min(s, 1_000_000_000L);
            if (a[i] < 1 || a[i] > maxAi) {
                System.err.println("Ошибка: a_i должно быть в диапазоне от 1 до min(s, 10^9).");
                return;
            }
        }
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + a[i];
        }
        long totalSum = 0;
        for (int l = 0; l < n; l++) {
            long currentSum = 0;
            int parts = 0;
            for (int r = l; r < n; r++) {
                currentSum += a[r];
                if (currentSum > s) {
                    parts++;
                    currentSum = a[r];
                }
                int f_lr = parts + (currentSum > 0 ? 1 : 0);
                totalSum += f_lr;
            }
        }
        System.out.println(totalSum);
        scanner.close();
    }
}