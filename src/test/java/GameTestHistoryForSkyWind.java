import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameTestHistoryForSkyWind {

    public static void main (String[] args) throws InterruptedException {

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://gc.gaming.skywindgroup.com/mammothmillions/develop/396/index.html");
        Thread.sleep(10000);
        chromeDriver.wait();
        WebElement infoButton = chromeDriver.findElement(By.xpath(".//*[@ class = \'footer-active-element footer-icon footer-help-icon menu-help menu-disabling-sensitive\']"));
        infoButton.click();
        Thread.sleep(500);
        WebElement infoText = chromeDriver.findElement(By.xpath(".//*[@ class = \"window-content\"]"));
        String text = infoText.getText();
        Thread.sleep(500);
        chromeDriver.quit();
        System.out.println(text);
    }
}