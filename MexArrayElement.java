import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = Math.abs(scanner.nextInt());
        if (arraySize == 0) {
            System.out.println("Массив нулевого размера");
            return;
        }
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}