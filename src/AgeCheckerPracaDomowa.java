// Zapytaj użytkownika o wiek, w przypadku gdy ma mniej niż 18 lat wypisz na ekranie informację że nie mozesz kupic
// alkocholu, gdy ma wiecej niz 18 lat to podziekuj za zakupy/


package src;
import java.util.Scanner;
public class AgeCheckerPracaDomowa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();
        if (wiek < 18){
            System.out.println("Nie możesz kupić alkocholu");
        } else {
            System.out.println("Dziękujemy za zakupy");
        }


    }
}
