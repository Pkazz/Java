// Dziedziczenie

package src;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("tom",29,"University");
        teacher.walking();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();


        Footballer footballer = new Footballer("Jhon", 32, "Lech Poznan");
        footballer.walking();
        footballer.eat();
        footballer.playFootbal();
    }
}
