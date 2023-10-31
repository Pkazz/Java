package src;
import java.util.Scanner;
// napisz program który poprosi użytkownika o wpisanie dwóch liczb, a następnie wykona
// na nich podstawowe operacje matematyczne
public class PracaDomowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        int result1 = firstNumber+secondNumber;
        int result2 = firstNumber-secondNumber;
        int result3 = firstNumber*secondNumber;
        int result4 = firstNumber/secondNumber;
        int result5 = firstNumber%secondNumber;
        System.out.println("Wynik dodawania to " + result1);
        System.out.println("Wynik odejmowania to " + result2);
        System.out.println("Wynik mnożenia to " + result3);
        System.out.println("Wynik dzielenia to " + result4);
        System.out.println("Modulo to " + result5);

    }
}
