public class FunkcjeZadania {
    /*
    1. Napisz funkcję, która wyświetli sumę dwóch podanych liczb. Nic nie zwraca.
    2. Napisać funkcję, która obliczy i zwróci NWD dwóch podanych liczb jako argumenty.
    3. Napisać funkcję, która wyświetli liczby parzyste z podanego zakresu. Zakres podajemy jako argumenty
        funkcji. Nic nie zwracamy
    4. Napisać funkcję, która zwróci True jeżeli podana liczba jako argument jest
        podzielna przez 3, 5 i 10. W przeciwnym razie zwraca false.
        Następnie wykorzystać tę funkcję jako warunek if napisany w mainie.
     */

    static int NWD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    static void printOnlyEven(int start, int end) {
        for (int i = start; i <= end; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static boolean correctValue(int x) {
        if (x % 3 == 0 && x % 5 == 0 && x % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(NWD(18, 12));
        System.out.println(NWD(100, 110));
        System.out.println();
        printOnlyEven(1, 5);
        System.out.println();
        printOnlyEven(2, 10);
        System.out.println();

        if (correctValue(30)) {
            System.out.println("Liczba jest podzielna przez: 3, 5 i 10.");
        }
    }
}
