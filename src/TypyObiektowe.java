package src;

public class TypyObiektowe {
    public static void main(String[] args) {
        // liczby staloprzecinkowe
        Byte first = 127; // 1 bajt od -128 do 127
        Short second = 9689; // 2 bajty od -32768 do 32767
        Integer third = 23290932; // 4 bajty od - 2 147 483 648 do 2 147 483 647
        Long fourth = 2353235423L; // 8 bajtów, bardzo duże liczby, należy deklarować longa literką L na koniec cyfry

        //Liczby zmiennoprzecinkowe
        Float oned = 4.99f; // max ok 6-7 liczb po przecinku, też deklarujemy literką f na końcu
        Double twod = 3.9999999999999999d; // max ok 15 cyfr po przecinku, też deklarujemy na koniec literką d

        // wartości logiczne
        Boolean prawda = true;
        Boolean fałsz = false;

        // pojedyńczy znak
        Character letter = 'a';

        //ciąg znaków

        String hello = "czesc";
        System.out.println(hello.charAt(0));
    }

}



