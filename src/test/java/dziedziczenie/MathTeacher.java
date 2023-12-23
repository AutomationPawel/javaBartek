package dziedziczenie;

public class MathTeacher extends Person {
    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("jestem w konstruktorze math teacher");
        this.school = school;
    }

    public void teachMath() {
        System.out.println("I am teaching math");
    }

    public void walk(){
        System.out.println("I walk very fast");
    }

    public void sayHello() {
        System.out.println("hello my name is " + name);
        System.out.println("I am " + age);
    }
}
