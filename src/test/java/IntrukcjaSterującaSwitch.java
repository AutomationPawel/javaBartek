public class IntrukcjaSterującaSwitch {
    public static void main(String[] args) {
        String danie = "Pizza" +
                "";

        switch (danie){
            case "Pizza":
                System.out.println("Cena to 22zl");
                break;
            case "Losos":
                System.out.println("Cena to 30zł");
              break;
            case "Frytki":
                System.out.println("Cena to 9zł");
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
