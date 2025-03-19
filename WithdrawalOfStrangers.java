import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStrangers = scanner.nextInt();
        scanner.nextLine();
        if (numberOfStrangers == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else if (numberOfStrangers < 0) {
            System.out.println("Серьезно? А что так негативно?");
        } else {
            String namesInput = scanner.nextLine();
            String[] namesOfStrangers = namesInput.split(" ");
            if (namesOfStrangers.length == numberOfStrangers) {
                for (String name : namesOfStrangers) {
                    System.out.println("Привет, " + name);
                }
            } else {
                System.out.println("Количество имен не соответствует количеству незнакомцев.");
            }
        }

        scanner.close();
    }
}