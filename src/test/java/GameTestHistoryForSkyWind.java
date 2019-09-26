import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameTestHistoryForSkyWind {

    public static void main (String[] args) throws InterruptedException {

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.onliner.by/");
        Thread.sleep(1000);
        chromeDriver.quit();
    }
}