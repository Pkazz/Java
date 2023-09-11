public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setKolor("Czerwony");
        c1.setMarka("Toyota");
        System.out.println(c1.getKolor());

        Car c2 = new Car();
        c2.setKolor("Zielony");
        c2.setMarka("BMW");
        c2.setSilnik(1600);
        System.out.println(c2.getKolor());

        Car c3 = new Car(
                "Czarny",
                "Mercedes",
                2000,
                2023
        );
        System.out.println(c3);
    }
}
