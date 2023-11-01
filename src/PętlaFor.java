package src;

public class PętlaFor {
    public static void main(String[] args) {
        int number = 100;

        for (int i =0; i < number; i=i+2) { // Wypisujemy liczby od 0 do 100 ale co 2 czyli w sumie parzyste
            System.out.println(i);

            for (int i =0; i < number; i++){ // tutaj wypisujemy liczby od 0 do 100 podzielne przez 5
              if (i%5==0)
                 System.out.println(i);

               for (int j =0; j < number;j++){ // tutaj wypisujemy 100 razy zdanie bede robil prace domową
                   System.out.println("Bedę robił pracę domową");
                }
            }
        }
    }
}
