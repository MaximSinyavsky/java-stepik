import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        int numberOfStrangers = Integer.parseInt(parts[0]);
        if (numberOfStrangers == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else if (numberOfStrangers < 0) {
            System.out.println("Серьезно? А что так негативно?");
        } else {
            if (parts.length - 1 != numberOfStrangers) {
                System.out.println("Количество имен не соответствует количеству незнакомцев.");
            } else {
                for (int i = 1; i < parts.length; i++) {
                    System.out.println("Привет, " + parts[i]);
                }
            }
        }
        scanner.close();
    }
}