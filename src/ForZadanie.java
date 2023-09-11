public class ForZadanie {
    public static void main(String[] args) {
        // Opcja 1 - podzielne przez 3 i 7.
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
                total = total + i;
            }
        }
        System.out.println("Suma liczb to: " + total);

        // Opcja 2 - podzielne przez 3 lub 7.
        total = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
                total = total + i;
            }
        }
        System.out.println("Suma liczb to: " + total);
    }
}
