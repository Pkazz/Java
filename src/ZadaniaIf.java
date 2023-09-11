public class ZadaniaIf {
    public static void main(String[] args) {
        // Zadanie 01
        int shot = 2;
        if (shot % 5 == 0 && shot % 3 == 0) {
            System.out.println("Pif Paf");
        } else if (shot % 3 == 0) {
            System.out.println("Pif");
        } else if (shot % 5 == 0) {
            System.out.println("Paf");
        } else {
            System.out.println(shot);
        }

        // Zadanie 02
        double temperature = 30.5;
        if (temperature > 36.8) {
            System.out.println("Gorączka");
        } else if (temperature >= 36.4 && temperature <= 36.8) {
            System.out.println("Stabilnie");
        } else {
            System.out.println("Ochłodzenie");
        }
    }
}
