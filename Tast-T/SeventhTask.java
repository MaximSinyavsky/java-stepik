import java.util.Scanner;

public class Main {
    static final long MOD = 998244353;
    static long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
    static long[] fact, invFact;
    static void precomputeFactorials(int maxK) {
        fact = new long[maxK + 1];
        invFact = new long[maxK + 1];
        fact[0] = 1;
        invFact[0] = 1;
        for (int i = 1; i <= maxK; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            invFact[i] = modPow(fact[i], MOD - 2, MOD);
        }
    }
    static long binomial(int p, int q) {
        if (q < 0 || q > p) return 0;
        long numerator = fact[p];
        long denominator = (invFact[q] * invFact[p - q]) % MOD;
        return (numerator * denominator) % MOD;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: n должно быть целым числом.");
            return;
        }
        int n = scanner.nextInt();
        if (n < 2 || n > 2_000_00) {
            System.err.println("Ошибка: n должно быть в диапазоне от 2 до 2*10^5.");
            return;
        }
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: k должно быть целым числом.");
            return;
        }
        int k = scanner.nextInt();
        if (k < 1 || k > 300) {
            System.err.println("Ошибка: k должно быть в диапазоне от 1 до 300.");
            return;
        }
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextLong()) {
                System.err.println("Ошибка: a_i должно быть целым числом.");
                return;
            }
            a[i] = scanner.nextLong();
            if (a[i] < 1 || a[i] > 1_000_000_00) {
                System.err.println("Ошибка: a_i должно быть в диапазоне от 1 до 10^8.");
                return;
            }
        }
        precomputeFactorials(k);
        long[][] powers = new long[n][k + 1];
        for (int i = 0; i < n; i++) {
            powers[i][0] = 1; // a_i^0 = 1
            for (int q = 1; q <= k; q++) {
                powers[i][q] = (powers[i][q - 1] * (a[i] % MOD)) % MOD;
            }
        }
        long[][] suffixSums = new long[k + 1][n + 1];
        for (int q = 0; q <= k; q++) {
            for (int i = n - 1; i >= 0; i--) {
                suffixSums[q][i] = (suffixSums[q][i + 1] + powers[i][q]) % MOD;
            }
        }
        for (int p = 1; p <= k; p++) {
            long fp = 0;
            for (int q = 0; q <= p; q++) {
                long binom = binomial(p, q);
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    long term = (powers[i][q] * (suffixSums[p - q][i + 1])) % MOD;
                    sum = (sum + term) % MOD;
                }
                fp = (fp + (binom * sum) % MOD) % MOD;
            }
            System.out.println(fp);
        }
        scanner.close();
    }
}