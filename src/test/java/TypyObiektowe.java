public class TypyObiektowe {

    public static void main(String[] args) {
        Byte firstNumber = 127; // 1 bajt -128 - 127
        Short secondNumber = 32689; // 2 bajty -32768 - 32767
        Integer thirdNumber = 32768999; // 4 bajty -2,147,483,648 do 2,147,483,647
        Long fourthNumber = 2148000L; // 8 bajtów (2^63) do 2^63 - 1

        Float fifthNumber = 4.99934F; // 4 bajty - max około 6-7 liczb po przecinku
        Double sixthNumber = 3.99999999999; // 8 bajtów - max około 15 cyfr po przecinsku

        //wartość logiczna
        Boolean prawda = true;
        Boolean fałsz = false;

        //pojedyńczy znak
        Character letter = 'A';

        //ciąg znaków
        String hello = "Hello Bartek";

        System.out.println(hello.charAt(0));
    }
}
