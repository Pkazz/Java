package src;
// Dziedziczenie
public class Footballer extends Person {
    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    public void playFootbal() {
        System.out.println("I am playing football in " + footballClub);
    }
}
