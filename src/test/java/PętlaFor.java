// Umożliwia cykliczne wykonywanie ciągu instrukcji określoną liczbę razy
public class PętlaFor {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 0; i < number; i = i+2){
            System.out.println(i);
        }
    }
}
