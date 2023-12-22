package zadania;

public class OdwrocTablice {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 3, 5, 7, 0};

        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }

        for (int i : tab) {
            System.out.println(i);
        }
    }
}
