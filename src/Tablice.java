package src;

public class Tablice {
    public static void main(String[] args) {
        String[] winterMonths = new String[3]; //tutaj tworzymy pusta tablicę, nadajemy ilość elementów (3) a następnie przypisujemy wartości do elementów
        winterMonths[0] = "grudzien";
        winterMonths[1] = "styczen";
        winterMonths[2] = "luty";

        int[] numbers = new int[] {1,4,6}; // tutaj nadajemy elementom wartości już podczas tworzenia tablicy, to są równoważne sposoby
        System.out.println(winterMonths[0]);
        System.out.println(winterMonths[1]);
        System.out.println(winterMonths[2]);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(winterMonths.length); //tak wyswietlamy wielkość tablicy

        for (int i=0; i< winterMonths.length; i++) { //Tutaj zaczynam od i=0 i tak iterujemy aż wypiszemy wszystkie elementy tablicy
            System.out.println(winterMonths[i]);
        }
    }
}
// w Javie zawsze liczymy od zera, i zawsze liczymy od lewej do prawej, jesli wpisujemy cos w nawias
