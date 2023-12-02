package obiektu;

public class StudentTest {
    public static void main(String[] args) {
        Student pawel = new Student();
        pawel.imie = "Pawel";
        pawel.nazwisko  = "Laski";
        pawel.nick = "Pawcio";
        pawel.email = "pawel@o2.pl";
        pawel.numerIndeksu = 23;

        Student marcin = new Student();
        marcin.imie = "Marcin";
        marcin.nazwisko  = "Marcinkowski";
        marcin.nick = "marcinek";
        marcin.email = "marcin@o2.pl";
        marcin.numerIndeksu = 24;

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko  = "Adamowski";
        adam.nick = "adamek";
        adam.email = "adamek@o2.pl";
        adam.numerIndeksu = 25;

        Student[] students = new Student[] {pawel,marcin,adam};
                for (Student s : students){
                    System.out.println("\n");
                    s.przedstawSie();
                    s.zalogujSie();
                    s.podajNrIndeksu();
                    s.podajEmail();
                }
    }
}
