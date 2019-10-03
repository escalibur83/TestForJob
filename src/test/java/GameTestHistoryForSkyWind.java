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

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://gc.gaming.skywindgroup.com/mammothmillions/develop/396/index.html?lang=" + "en");
        Thread.sleep(15000);
        WebElement infoButton = chromeDriver.findElement(By.xpath(".//*[@ class = \'footer-active-element footer-icon footer-help-icon menu-help menu-disabling-sensitive\']"));
        infoButton.click();
        Thread.sleep(500);
        WebElement infoText = chromeDriver.findElement(By.xpath(".//*[@ class = \"window-content\"]"));
        String text = infoText.getText();
        chromeDriver.quit();
        System.out.println(text);

        FileInputStream file = new FileInputStream(new File("D:/GitRep/TestForJob/HelpGenericTextsDesktop.xlsx"));
        Workbook excelHelpBook = new XSSFWorkbook(file);
        Sheet sheet = excelHelpBook.getSheetAt(0);
        Row row = sheet.getRow(9);
        Cell cell = row.getCell(1);
        System.out.println(cell.getStringCellValue());
        Row row1 = sheet.getRow(11);
        Cell cell1 = row1.getCell(1);
        System.out.println(cell1.getStringCellValue());
    }
}