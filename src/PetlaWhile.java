public class PetlaWhile {
    public static void main(String[] args) {
//        int n = 0;
//        while (n <= 10) {
//            System.out.println(n);
//            n++;
//        }

        int a = 100;
        int b = 110;
        int i = 0;
        // NWD to 6.
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            i++;
        }
        System.out.println("NWD to: " + a + ", Ilość iteracji: " + i);
    }
}
