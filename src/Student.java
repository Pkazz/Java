package src;

public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;

    public int nrIndeksu;

    public static String nazwaUczelni = "AGH";

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to UP");
    }

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie za pomoca " + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("Moj numer indeksu to : " + nrIndeksu);
    }
    public void podajEmail() {
        System.out.println("Mój email to : " + email);
    }

}
