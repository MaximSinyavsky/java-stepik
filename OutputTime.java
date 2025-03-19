import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = (seconds % 3600) / 60;
        int hours = (seconds / 3600) % 24;
        int remainingSecond = (seconds % 3600) % 60;
        System.out.printf("%d:%02d:%02d", hours, minutes, remainingSecond);
    }
}