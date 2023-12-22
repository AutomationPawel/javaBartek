public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();

        int result = metody.pobierzWynik();
        int result2 = result*2;
        System.out.println("Rezultat po mnożeniu to " + result2);
        System.out.println("////////////////////////////////////////////////////");

        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);

        System.out.println(metody.add(4,6));

    }
}
