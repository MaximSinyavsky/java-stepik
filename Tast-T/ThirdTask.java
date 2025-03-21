package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: n должно быть целым числом.");
            return;
        }
        int n = scanner.nextInt();
        if (n < 3 || n > 2_000_00) {
            System.err.println("Ошибка: n должно быть в диапазоне от 3 до 2*10^5.");
            return;
        }
        if (!scanner.hasNextInt()) {
            System.err.println("Ошибка: m должно быть целым числом.");
            return;
        }
        int m = scanner.nextInt();
        if (m < 1 || m > n - 2) {
            System.err.println("Ошибка: m должно быть в диапазоне от 1 до n-2.");
            return;
        }
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextLong()) {
                System.err.println("Ошибка: a_i должно быть целым числом.");
                return;
            }
            a[i] = scanner.nextLong();
            if (a[i] < 1 || a[i] > 1_000_000_000) {
                System.err.println("Ошибка: a_i должно быть в диапазоне от 1 до 10^9.");
                return;
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                System.err.println("Ошибка: a_i должно быть строго возрастающей последовательностью.");
                return;
            }
        }
        long badDays;
        if (m >= 2) {
            badDays = n - m;
        } else {
            badDays = n - 1;
        }
        System.out.println(badDays);
        scanner.close();
    }
}