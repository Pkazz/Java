public class Car {
    // Zmienne (pola) opisujące elementy obiektu klasy
    private String kolor;
    private String marka;
    private int silnik;
    private int rokProdukcji;

    // Funkcje (metody), które służą "do obsługi" klasy.
    // Każda klasa posiada 3 zestawy metod
    // 1 - gettery: pobierania wartości danej zmiennej (pola)
    // 2 - settery: umożliwia ustawienie wartości dla danej zmiennej (pola)
    // 3 - inne: pozostałe metody w klasie


    public Car(String kolor, String marka, int silnik, int rokProdukcji) {
        this.kolor = kolor;
        this.marka = marka;
        if (silnik > 3000) {
            this.silnik = 3000;
        } else {
            this.silnik = silnik;
        }
        this.rokProdukcji = rokProdukcji;
    }

    public Car() {
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSilnik() {
        return silnik;
    }

    public void setSilnik(int silnik) {
        this.silnik = silnik;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public String toString() {
        return "Car{" +
                "kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", silnik=" + silnik +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
}
