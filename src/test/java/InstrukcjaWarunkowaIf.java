public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;

        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna / dzielnik);
        } else{
            System.out.println("Dzielnik jest równy 0 czyli niepoprawny");
        }
    }
}
