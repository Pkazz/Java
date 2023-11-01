package src;

public class InstrukcjaSwitch {
    public static void main(String[] args) {
        String danie = "Pizza";

        switch (danie){
            case "pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "Losos":
                System.out.println("Cena to 35 zl");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");

        }


    }
}
