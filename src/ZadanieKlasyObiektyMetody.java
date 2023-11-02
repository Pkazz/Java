package src;
// Stworz 3 obiekty klasy sutdent, przypisz wartości do pol, stworz tabile i dodaj studentów do tablicy
public class ZadanieKlasyObiektyMetody {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;


        Student Bartek = new Student();
        Bartek.imie = "Bartek";
        Bartek.email = "Barte@gmail.com";
        Bartek.nrIndeksu = 123432;
        Bartek.nazwisko = "Bobain";
        Bartek.nick = "Hur";
        String uczelniaBarta = Bartek.nazwaUczelni;

        Student Mariola = new Student();
        Mariola.imie = "Mariola";
        Mariola.email = "Mariola@gmail.com";
        Mariola.nrIndeksu = 123456;
        Mariola.nazwisko = "Rzetelna";
        Mariola.nick = "Dur";

        Student Edward = new Student();
        Edward.imie = "Edward";
        Edward.email = "Edward@gmail.com";
        Edward.nrIndeksu = 123678;
        Edward.nazwisko = "Śmieszny";
        Edward.nick = "Łełełe";

               Student[] studenci = new Student[3];
        studenci[0] = Bartek;
        studenci[1] = Mariola;
        studenci[2] = Edward;

        for (int  i=0; i < studenci.length; i++){
            Student.infoUczelnia();
        studenci[i].przedstawSie();
        studenci[i].zalogujSie();
        studenci[i].podajNrIndeksu();
        studenci[i].podajEmail();
        }

    }
}
