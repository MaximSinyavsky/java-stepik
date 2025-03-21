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
        if (n < 1 || n > 100_000) {
            System.err.println("Ошибка: n должно быть в диапазоне от 1 до 10^5.");
            return;
        }
        long prevCost = 0;

        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextLong()) {
                System.err.println("Ошибка: a_i должно быть целым числом.");
                return;
            }
            long ai = scanner.nextLong();
            if (ai < 1 || ai > 1_000_000_000_000_000_000L) {
                System.err.println("Ошибка: a_i должно быть в диапазоне от 1 до 10^18.");
                return;
            }
            long cost = ai * 10;
            if (i > 0) {
                if (cost <= prevCost) {
                    System.out.println(-1);
                    continue;
                }
                if (prevCost > 0 && cost / prevCost > 1_000_000_000_000_000_000L) {
                    System.out.println(-1);
                    continue;
                }
            }
            System.out.println(ai + " " + cost);
            prevCost = cost;
        }
        scanner.close();
    }
}