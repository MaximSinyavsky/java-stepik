//Недавно маленький Антон научился читать некоторые буквы! Точнее, он научился читать буквы ,  и . Кроме того, набор из трех букв , ,  ему кажется правильным, если в нем символ  находится раньше, чем символ .
//        Определите, является ли строка  правильной по мнению Антона.
//        Формат входных данных
//        Дана строка  из трех символов, содержащая один символ , один символ  и один символ .
//        Формат выходных данных
//        Выведите , если символ  находится в строке  раньше, чем символ . В противном случае выведите .
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpute = scanner.nextLine();
        int indexR = inpute.indexOf("R");
        int indexM = inpute.indexOf("M");
        System.out.println(indexR < indexM ? "Yes" : "No");
        scanner.close();
    }
}