package src;

public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.rok = 1999;
        mercedes.przebieg = 234438;
        mercedes.model = "Klasa S";

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;

        audi.info();
        audi.hamuj();
        audi.info();




    }
}
