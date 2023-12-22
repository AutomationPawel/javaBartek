package zadania;

import java.util.HashMap;
import java.util.Map;

public class LiczenieWystąpień {

    public static void main(String[] args) {

        int[] exTab = new int[]{1, 2, 3, 2, 5, 3, 3, 3,6};

        liczWystapienia(exTab);
    }

    public static void liczWystapienia(int[] tab) {

        Map<Integer,Integer> occurences = new HashMap<>();
        for (int i = 0; i<tab.length; i++){
            if(occurences.containsKey(tab[i])){
                Integer value = occurences.get(tab[i]);
                occurences.put(tab[i], value+1);
            }
            else {
                occurences.put(tab[i], 1);
            }
        }
        for (Integer key: occurences.keySet()) {
            System.out.println("Liczba " + key + " wystepuje " + occurences.get(key));
        }
    }
}
