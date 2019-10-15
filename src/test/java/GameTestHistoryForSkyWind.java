import java.io.IOException;
import java.util.ArrayList;

public class GameTestHistoryForSkyWind {

    public static void main (String[] args) throws InterruptedException, IOException {

        ReadToFile readToFile = new ReadToFile();
        OpenToChrome openToChrome = new OpenToChrome();

        ArrayList<String> fileText = readToFile.fileHelp();
        ArrayList<String> gameText = openToChrome.readToRealGame();

        WordDivision wordDivision = new WordDivision();
        //wordDivision.onlyWord(gameText);
        //wordDivision.onlyWord(fileText);

        CompareWords compareWords = new CompareWords();
        System.out.println(compareWords.compareWords(wordDivision.onlyWord(fileText),wordDivision.onlyWord(gameText)));
        //compareWords.compareWords(wordDivision.onlyWord(fileText),wordDivision.onlyWord(gameText));
    }
}