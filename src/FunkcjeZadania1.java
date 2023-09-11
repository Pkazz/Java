public class FunkcjeZadania1 {
    // 1. Napisz funkcję, która wyświetli sumę dwóch podanych liczb. Nic nie zwraca.

    // Nic nie zwraca - void
    // Suma dwóch liczb - dwa argumenty dla funkcji
    static void addTwoNumbers(double x, double y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        // IDE jakim jest IntelliJ jest dziwne.
        // Ponieważ wstawia nazwy argumentów jeżeli podajemy wartości
        // Tak naprawdę pod spodem napisałem:
        // Wpisujecie argumenty jako wartości!
        /*
            addTwoNumbers(10.5, 19.5);
            addTwoNumbers(-10, -7);
            addTwoNumbers(0, 12.99);
         */
        addTwoNumbers(10.5, 19.5);
        addTwoNumbers(-10, -7);
        addTwoNumbers(0, 12.99);


        double d1 = 19;
        double d2 = 1;
        addTwoNumbers(d1, d2);
    }
}
