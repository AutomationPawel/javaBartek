package zadania;

import java.util.Scanner;

// Zapytaj użytkownika o wiek, w przypadku gdy ma mniej niż 18 lat
// wypisz na ekranie unformacje ze nie może kupić alkoholu
// jeśli ma powyżej 18 lat podziękuj za zakpu
public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        if(18>age && age >=0){
            System.out.println("Nie możesz kupić alkoholu");
        }else if(0>age){
            System.out.println("Wprowadź poprawne dane");
        }else {
            System.out.println("Dziekuje za zakupy");
        }
    }
}
