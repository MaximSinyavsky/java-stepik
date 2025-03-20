import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int current;
        while ((current = scanner.nextInt()) != 0) {
            if (current > input) {
                input = current;
            }
        }
        System.out.println(input);
        scanner.close();
    }
}