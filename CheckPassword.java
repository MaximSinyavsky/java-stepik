import java.util.Scanner;

public class Main {
    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        //Напишите свой код здесь
        Scanner scanner = new Scanner(System.in);
        int inputePassword = scanner.nextInt();
        if (inputePassword == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}