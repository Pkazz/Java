public class instrukcjaIf {
    public static void main(String[] args) {
        // Przykłady warunków
//        boolean warunekFalse = (10 == 12);
//        boolean warunekTrue = true;
//        System.out.println(warunekFalse);
//        System.out.println(warunekTrue);

        // Instrukcja if
        int x = 30;
        if (x % 2 == 0) {
            System.out.println("Liczba x jest parzysta.");
        } else if (x % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else if (x % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 5.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 2,3,5.");
        }

        // Operatory logiczne
        // && - AND, || - OR
        if (x % 2 == 0 && x % 3 == 0 && x % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 2, 3 i 5.");
        }
    }
}
