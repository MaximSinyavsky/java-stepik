import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: n должно быть целым числом.");
            return;
        }
        int n = scanner.nextInt();
        if (n < 1 || n > 2_000_00) {
            System.err.println("Ошибка: n должно быть в диапазоне от 1 до 2*10^5.");
            return;
        }
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: x должно быть целым числом.");
            return;
        }
        long x = scanner.nextLong();
        if (x < 1 || x > 1_000_000) {
            System.err.println("Ошибка: x должно быть в диапазоне от 1 до 10^6.");
            return;
        }
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: y должно быть целым числом.");
            return;
        }
        long y = scanner.nextLong();
        if (y < 1 || y > 1_000_000) {
            System.err.println("Ошибка: y должно быть в диапазоне от 1 до 10^6.");
            return;
        }
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: z должно быть целым числом.");
            return;
        }
        long z = scanner.nextLong();
        if (z < 1 || z > 1_000_000) {
            System.err.println("Ошибка: z должно быть в диапазоне от 1 до 10^6.");
            return;
        }
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextLong()) {
                System.err.println("Ошибка: a_i должно быть целым числом.");
                return;
            }
            a[i] = scanner.nextLong();
            if (a[i] < 1 || a[i] > 1_000_000_000_000_000_000L) {
                System.err.println("Ошибка: a_i должно быть в диапазоне от 1 до 10^18.");
                return;
            }
        }
        boolean hasX = false;
        boolean hasY = false;
        boolean hasZ = false;
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean canBeX = (a[i] + x - 1) / x * x <= 1_000_000_000_000_000_000L;
            boolean canBeY = (a[i] + y - 1) / y * y <= 1_000_000_000_000_000_000L;
            boolean canBeZ = (a[i] + z - 1) / z * z <= 1_000_000_000_000_000_000L;
            if (canBeX && !hasX) {
                hasX = true;
            } else if (canBeY && !hasY) {
                hasY = true;
            } else if (canBeZ && !hasZ) {
                hasZ = true;
            }
            if (hasX && hasY && hasZ) {
                k = i + 1;
                break;
            }
        }
        if (k == 0) {
            System.out.println(-1);
        } else {
            System.out.println(k);
        }
        scanner.close();
    }
}