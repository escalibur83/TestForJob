import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

class ReadToFile {


    public Sheet sheet () throws IOException {
        FileInputStream file = new FileInputStream(new File("D:/GitRep/TestForJob/HelpGenericTextsDesktop.xlsx"));
        Workbook excelHelpBook = new XSSFWorkbook(file);
        Sheet sheet = excelHelpBook.getSheetAt(0);
        return sheet;
    }

    public ArrayList<String> cuntryCod() throws IOException {

        ArrayList<String> localisationCode = new ArrayList<String>();

        Sheet sheet = sheet();
        int x = 0;
        for (int c = 1; c <= 19; c++) {
            Row row = sheet.getRow(6);
            Cell cell = row.getCell(c);
            String line = cell.getStringCellValue();
            localisationCode.add(x,line);
            x++;
        }
        return localisationCode;
    }

    public ArrayList<String> fileHelp () throws IOException {

        ArrayList<String> allTextFromHelp = new ArrayList<String>();

        Sheet sheet = sheet();
        int c = 1;
        for (int p = 0; p<=18; p++)
        {
            String textFromFiles = "";
            for (int r = 60; r >= 8; r--) {
                Row row = sheet.getRow(r);
                Cell cell = row.getCell(c);
                String line = cell.getStringCellValue();
                textFromFiles = line.concat("\n" + textFromFiles);
            }
            System.out.println(textFromFiles);
            allTextFromHelp.add(p, textFromFiles);
            c++;
        }
    return allTextFromHelp;
    }
}
