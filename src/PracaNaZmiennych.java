public class PracaNaZmiennych {
    public static void main(String[] args) {
        String txt = "Welcome";
        System.out.println(txt);
        System.out.println(txt);

        // Operacje na zmiennych
        int x = 10;
        int y = 12;
        int result = x - y;
        System.out.println(x + 5);
        System.out.println(result);

//        Operator modulo
        int z = 10 % 3;
        System.out.println(z);

        // Zapis skrócony, jeżeli pracujemy z tą samą zmienną.
        int a = 10;
        a -= 2; // to samo co a = a - 2;
        System.out.println(a);

        // Inkrementacja i dekrementacja
        int i = 10;
        i++; // i += 1; i = i + 1;
        System.out.println(i);

        // Liczby zmiennoprzecinkowe
        double d = 10.25;
        d = d - 0.25;
        System.out.println(d);
    }
}
