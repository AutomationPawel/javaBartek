package listy;

import java.util.ArrayList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ola");
        names.add("Paweł");

        System.out.println(names.get(0));

        System.out.println(names.indexOf("Paweł"));
        System.out.println(names.lastIndexOf("Paweł"));
        System.out.println(names.contains("Krysia"));

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);

        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba());

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String name:names) {
            System.out.println(name);
        }
    }
}

class Osoba {

}
