import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        if (arraySize < 2) {
            System.out.println("Размерность массива должна быть более 2");
            return;
        }
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        boolean[] newArray = new boolean[arraySize];
        Arrays.fill(newArray, false);
        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                newArray[i] = true;
            } else {
                newArray[i] = false;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}