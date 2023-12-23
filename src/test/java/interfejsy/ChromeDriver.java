package interfejsy;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwierm przegladarke chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przegladarce chrome");
    }
}
