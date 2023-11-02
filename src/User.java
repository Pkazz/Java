package src;

public class User {
    public String username;
    public String password;
    public void sayHello() {
        System.out.println("Hello my name is " + username);
        // poniżej dwa konstruktory
    }

        public User() {


        }
        // tak wygląda domyślny konstruktor wbudowany w Jave, on po prostu jest i na jego podstawie
            // potem możemy przywołać klasę w User.Test


        public User(String username, String password) {
        this.username = username; // zapis this.username definiuje że ta zmienna ma dotyczyć tylko tego obiektu
        this.password = password; // w tej klasie mamy już wyżej password i username i w ten sposób definiujemy że ta ma dotyczyć tylko tego obiektu
            System.out.println("Hello z konstruktora");


        }
        //- tak wygląda konstruktor z nadanymi parametrami. Domyślny jest bez nich, można mieć i taki i taki, ale żeby mieć dwa do wyboru, musimy wtedy oficjalnie zdeklarować ten wbudowany (Jak powyżej)




}
