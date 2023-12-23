package identifiers.second;

import identifiers.first.Parent;

public class Random {

    //klasa w innej paczce nie ma dostępu do pol i metod private, default oraz protected

    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        parent.firstMethod();
    }
}
