import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkAmount = scanner.nextInt();
        int friendsAmount = scanner.nextInt();
        if (checkAmount < 0) {
            System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
        } else if (friendsAmount <= 0) {
            System.out.println("Кто здесь?!");
        } else {
            int amountForEveryFriend = (int) Math.round(checkAmount * 1.1 / friendsAmount);
            System.out.println(amountForEveryFriend);
        }
        scanner.close();
    }
}