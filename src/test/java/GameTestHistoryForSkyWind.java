import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GameTestHistoryForSkyWind {

    public static void main (String[] args) throws InterruptedException, IOException {

        ReadToFile rearToFile = new ReadToFile();

        rearToFile.fileHelp();

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://gc.gaming.skywindgroup.com/mammothmillions/develop/396/index.html?lang=" + "en");
        Thread.sleep(20000);
        WebElement infoButton = chromeDriver.findElement(By.xpath(".//*[@ class = \'footer-active-element footer-icon footer-help-icon menu-help menu-disabling-sensitive\']"));
        infoButton.click();
        Thread.sleep(500);
        WebElement infoText = chromeDriver.findElement(By.xpath(".//*[@ class = \"window-content\"]"));
        String textOfGames = infoText.getText();
        chromeDriver.quit();
        System.out.println(textOfGames);

    }
}