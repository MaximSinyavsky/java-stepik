import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 1;
        int current;
        while ((current = scanner.nextInt()) != 0) {
            input += current;
            i++;
        }
        int average = input / i;
        System.out.println(average);
        scanner.close();
    }
}