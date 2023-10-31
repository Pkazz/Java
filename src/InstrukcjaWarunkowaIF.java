package src;
import java.util.Scanner;

public class InstrukcjaWarunkowaIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podaj drugą liczbę");
        float secondNumber = scanner.nextFloat();

        if (secondNumber == 0) {
            System.out.println("podaj liczbę inną niż 0");
        }
        if (secondNumber != 0) {
            System.out.println("Wynik dzielenia to " + (firstNumber / secondNumber));


        }
    }
}
