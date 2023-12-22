package dziedziczenie;

import dziedziczenie.Person;

public class MathTeacher extends Person {
    public String school;
    public void teachMath(){
        System.out.println("I am teaching math");
    }
    public void sayHello(){
        System.out.println("hello my name is " + name);
        System.out.println("I am " + age);
    }
}
