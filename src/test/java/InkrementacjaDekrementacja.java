public class InkrementacjaDekrementacja {

    public static void main(String[] args) {

        int a = 0;
        System.out.println("Wartość zmiennej " + a); //0

        int b = a++;
        System.out.println("Wartość zmiennej " + b); //0
        System.out.println("Wartość zmiennej " + a); //1

        int c = ++a;
        System.out.println("Wartość zmiennej " + c); //2
        System.out.println("Wartość zmiennej " + a); //2

        System.out.println("////////////////////////");

        int d = 0;
        System.out.println("Wartość zmiennej " + d); //0

        int e = d--;
        System.out.println("Wartość zmiennej " + e); //0
        System.out.println("Wartość zmiennej " + d); //1

        int f = --d;
        System.out.println("Wartość zmiennej " + f); //2
        System.out.println("Wartość zmiennej " + d); //2
    }
}
