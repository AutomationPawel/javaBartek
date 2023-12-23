package dziedziczenie;


public class PersonTest {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher("Tom", 29, "univeristy");
        mathTeacher.walk();
        mathTeacher.eat();
        mathTeacher.teachMath();
        mathTeacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21, "jagiellonia Bstok");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
