package dziedziczenie;

import dziedziczenie.Footballer;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Tom";
        mathTeacher.age = 20;
        mathTeacher.school = "University";
        mathTeacher.walk();
        mathTeacher.eat();
        mathTeacher.teachMath();
        mathTeacher.sayHello();

        Footballer footballer = new Footballer();
        footballer.name = "Mike";
        footballer.age = 21;
        footballer.footballClub = "Jagiellonia Bstok";
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
