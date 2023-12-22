package zadania;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        int a = sc.nextInt();
        System.out.println("Podaj drugą liczbe");
        int b = sc.nextInt();

        Calculator calc = new Calculator();
        System.out.println("Wynik z dodawania " + calc.add(a, b));
        System.out.println("Wynik z odejmowania " + calc.sub(a, b));
        System.out.println("Wynik z mnozenia " + calc.mul(a, b));
        System.out.println("Wynik z modulo " + calc.mod(a, b));
        System.out.println("Wynik z dzielenia " + calc.div(a, b));
    }
}
