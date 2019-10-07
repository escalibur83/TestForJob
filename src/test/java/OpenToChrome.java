import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;

public class OpenToChrome {

    public ArrayList<String> readToRealGame() throws InterruptedException, IOException {

        ReadToFile readToFile = new ReadToFile();
        ArrayList<String> cod = readToFile.cuntryCod();
        ArrayList<String> helpWithAllLang = new ArrayList();
        for (int i=0; i< cod.size(); i++)
        {
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("http://gc.gaming.skywindgroup.com/mammothmillions/develop/396/index.html?lang=" + cod.get(i));
            Thread.sleep(15000);
            WebElement infoButton = chromeDriver.findElement(By.xpath(".//*[@ class = \'footer-active-element footer-icon footer-help-icon menu-help menu-disabling-sensitive\']"));
            infoButton.click();
            Thread.sleep(500);
            WebElement infoText = chromeDriver.findElement(By.xpath(".//*[@ class = \"window-content\"]"));
            String textOfGames = infoText.getText();
            helpWithAllLang.add(i,textOfGames);
            chromeDriver.quit();
        }
        return helpWithAllLang;
    }
}
