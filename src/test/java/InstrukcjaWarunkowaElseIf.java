public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {

        int number = 15;

        if (number == 0) {
            System.out.println("Liczba równa zero");
        } else if (number>0) {
            System.out.println("Liczba dodatnia");
        } else if (number>10) {
            System.out.println("Liczba większa od 10");
        } else if (number<-5) {
            System.out.println("liczba mniejsza od -5");
        }else
            System.out.println("żaden warunek nie został spełniony");
    }
}