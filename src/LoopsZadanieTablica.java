package src;

public class LoopsZadanieTablica {
    public static void main(String[] args) {
        int [] numbers = new int[]{1,3,5,7,0};

            for (int i = numbers.length; i > 0; i--) {
                System.out.println(numbers[i-1]);
                // ilosc elementow w tabeli to 5, ale numeracja pozycji to 0,1,2,3,4. Stąd idejmując od i =5, 1 otrzymujemy wynik 4, dla i=4 otrzymuemy 3 itd. i to pozwala nam odwrócić tablicę
            }

        }
    }

