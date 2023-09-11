public class WhileZadania {
    public static void main(String[] args) {
        // Za pomocą pętli while obliczyć silnię liczby n.
        // 5! = 5 * 4 * 3 * 2 * 1
        int n = 5;
        int result = 1;
        while (n > 1) {
            result = result * n;
            n = n - 1;
        }
        System.out.println("Silnia: " + result);

        // Za pomocą pętli while wyświetlić wszystkie potęgi liczby 3 od 0 do 10.
        int potega = 0;
        int total = 1;
        while (potega <= 10) {
            if (potega != 0) {
                total = total * 3;
            }
            System.out.println(total);
            potega++;
        }
        // Za pomocą pętli while wyświetlić wszystkie liczby podzielne przez 3 z przedziału <0, 60>.
        int j = 0;
        while (j <= 60) {
            System.out.println(j);
            j = j + 3;
        }
    }
}
