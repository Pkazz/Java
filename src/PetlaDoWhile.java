package src;
public class PetlaDoWhile {
    public static void main(String[] args) {
        int number = 21;
        do {
            System.out.println("Moja wartosc to : " +number+ " i jestem mniejsza od 20");
            number++;
        } while (number < 20);

    }
}
// Do while różni się tym, że kod wykona sie przynajmniej raz, nawet jesli warunek while będzie false