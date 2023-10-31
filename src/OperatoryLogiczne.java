package src;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue); // && to operator I, zwróci on wartość true gdy dwa wyrażenia składowe są równie true
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || fourthValue); // || to operator lub, zwróci wartość true gdy chociaż jendo wyrażenie składowe jest równe true
        System.out.println(!firstValue); // ! - operator negacji, zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!secondValue); //
        System.out.println(!(firstValue && secondValue)); // tutaj mamy negację tego porównania któe jest w nawiasie. Ono samo w sobie jest false, więc negacja tego nawiasu zwraca true

    }
}
