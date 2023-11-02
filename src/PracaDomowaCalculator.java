package src;
import java.util.Scanner;
// napisz program który poprosi użytkownika o wpisanie dwóch liczb, a następnie wykona
// na nich podstawowe operacje matematyczne
public class PracaDomowaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        Calculator calculator = new Calculator();
        System.out.println("Wynik dodawania to " + calculator.dodawanie(firstNumber,secondNumber));
        System.out.println("Wynik odejmowania to " + calculator.odejmowanie(firstNumber,secondNumber));
        System.out.println("Wynik mnożenia to " + calculator.mnozenie(firstNumber,secondNumber));
        System.out.println("Wynik dzielenia to " + calculator.dzielenie(firstNumber,secondNumber));
        System.out.println("Modulo to " + calculator.modulo(firstNumber,secondNumber));

    }
}
