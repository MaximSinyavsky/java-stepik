import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        if (arraySize <= 0) {
            System.out.println("Массив не может быть равен нулю");
            return;
        }
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += sum;
            }
        }
        System.out.println(sum);
    }
}