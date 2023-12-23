package interfejsy;

public class Truck implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("jade ciezarówką z predkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarówką!");
    }

    @Override
    public String info() {
        return "ciężarówka";
    }
}
