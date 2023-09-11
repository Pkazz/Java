public class ZestawZadan1 {
    /*
    1. Napisać funkcję, która wyświetli "słupek" z podanego znaku.
    Wysokość słupka oraz znak podajemy jako argumenty.
    np. funkcja("A", 3)
    A
    A
    A

    2. Napisać pętle while co dla parzystych wyświetli napis "OK", a dla nieparzystych "NOT OK".
    Działamy w zakresie <0, 20>

    3. Napisać pętle for, która wyświetli liczby podzielne przez 5 od 90 do 50.

    4. Napisać program, która posiada zmienną do której przypisujemy wartość 1-12.
    Dla 1 mamy wyświetlić Styczeń, dla 2 Luty, dla 3 Marzec itd..
    Dla wartości spoza zakresu podajemy informacje: "Nie rozponano miesiąca"
     */

    /*
    void - funkcja niczego nie zwraca, nie posiada słowa kluczowego return
    typ danych - funkcja zwraca informację za pomocą return, którą możemy np. zapisać do zmiennej.
     */

    /*
    Napisać program który obliczy sumę n elementów ciągu harmonicznego.
    ciąg harmoniczny: 1 + 1/2 + 1/3 + 1/4 + 1/5 + .... + 1/n
    przykładowo dla n = 3
    suma równa: 1 + 1/2 + 1/3
     */
    static void printCharLine(String sign, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(sign);
        }
    }

    static void ciagHarmoniczny(int n) {
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result = result + 1.0/i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
//        printCharLine("*", 2);
//        System.out.println();
//        printCharLine("|", 3);

//        int j = 0;
//        while (j <= 20) {
//            if (j % 2 == 0) {
//                System.out.println("OK");
//            } else {
//                System.out.println("NOT OK");
//            }
//            j++;
//        }
        ciagHarmoniczny(2);
        ciagHarmoniczny(3);
        ciagHarmoniczny(95);

        for (int i = 90; i >= 50; i = i - 5) {
            System.out.println(i);
        }

        int m = 1;
        switch (m) {
            case 1:
                System.out.println("Styczeń.");
                break;
            case 2:
                System.out.println("Luty.");
                break;
            case 3:
                System.out.println("Marzec.");
                break;
            case 4:
                System.out.println("Kwiecień.");
                break;
            case 5:
                System.out.println("Maj.");
                break;
            case 6:
                System.out.println("Czerwiec.");
                break;
            case 7:
                System.out.println("Lipiec.");
                break;
            case 8:
                System.out.println("Sierpień.");
                break;
            case 9:
                System.out.println("Wrzesień.");
                break;
            case 10:
                System.out.println("Październik.");
                break;
            case 11:
                System.out.println("Listopad.");
                break;
            case 12:
                System.out.println("Grudzień.");
                break;
            default:
                System.out.println("Nie rozpoznano miesiąca.");
        }

        int n = 3;
        int x = 2;
        double ciag = 1;
        while (n >= x) {
            ciag = ciag + 1.0/x;
            x = x + 1;
        }
        System.out.println("Suma elementów wynosi: " + ciag);


    }
}
