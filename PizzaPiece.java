import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountPeoples = scanner.nextInt();
        int amountPiece = scanner.nextInt();
        int amountPizzas = 1;
        while ((amountPizzas * amountPiece) % amountPeoples != 0) {
            amountPizzas++;
        }
        System.out.println(amountPizzas);
        scanner.close();
    }
}