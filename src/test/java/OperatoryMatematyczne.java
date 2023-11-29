//Operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0f;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber / secondNumber; //0,66
        int mod = secondNumber%firstNumber; //2

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(mod);

        System.out.println("////////////////////////////////////////////////////");

        firstNumber+=secondNumber;
        System.out.println(firstNumber); //10
        firstNumber-=secondNumber;
        System.out.println(firstNumber); //4
        firstNumber*=secondNumber;
        System.out.println(firstNumber); //24
        firstNumber/=secondNumber;
        System.out.println(firstNumber); //4
        firstNumber%=secondNumber;
        System.out.println(firstNumber); //4
    }
}
