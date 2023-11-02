package src;

public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(387);
//        metody.policzWynik();
//        int result = metody.pobierzWynik();
//        int result2 = result * 2;
//        System.out.println("Rezultat przed mnożeniem to " + result);
//        System.out.println("Rezultat po mnożeniu to " + result2);

        metody.add(2,1);
        int result = metody.add(2,54);
        System.out.println(result);
    }
}
