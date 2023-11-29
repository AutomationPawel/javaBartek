public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = 3<1;
        boolean fourthValue = 3>1;

        // && true gdy oba wyrażenia są równe true
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); //true
        System.out.println(secondValue && thirdValue); //false

        System.out.println("///////////////////////////////////");

        // || true gdy conajmniej jedno wyrażenie jest równe true
        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourthValue); //true
        System.out.println(secondValue || thirdValue); //false

        System.out.println("///////////////////////////////////");

        // ! negacja zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); //true
        System.out.println(!(firstValue&&secondValue)); //true
    }
}
