package src;

public class OperatoryPorównania {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = firstNumber > secondNumber;
        System.out.println(result);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber); // tak sprawdzamy czy liczby są różne od siebie
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
    }
}
