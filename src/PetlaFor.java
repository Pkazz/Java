public class PetlaFor {
    public static void main(String[] args) {
        // (start; warunek; krok)
//        for (int i = 0; i <= 10; i = i + 1) {
//            System.out.println(i);
//        }

        // Wyświetlili wszystkie parzyste liczby całkowite od 10 do 50 włącznie.
//        for (int i = 0; i <= 50; i = i + 1) {
//            if (i >= 10 && i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 10; i <= 50; i = i + 2) {
//            System.out.println(i);
//        }

          int r = 1;
          for (int i = 0; i <= 10; i++) {
              if (i == 0) {
                  System.out.println("Wartość i=" + i + " Wartość r=" + r);
              } else {
                  r = r * 2;
                  System.out.println("Wartość i=" + i + " Wartość r=" + r);
              }
          }

    }
}
