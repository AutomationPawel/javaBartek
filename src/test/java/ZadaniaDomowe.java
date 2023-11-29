public class ZadaniaDomowe {

    public static void main(String[] args) {
        liczbyPodzielnePrzez3();
        odwrocenieTablicy();
    }

    public static void liczbyPodzielnePrzez3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void odwrocenieTablicy() {
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
