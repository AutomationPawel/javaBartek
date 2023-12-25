import interfejsy.FirefoxDriver;
import interfejsy.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b; // a zostaje przekonwertowana na niejawne double

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
    }
}
