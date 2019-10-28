
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class GameTestHistoryForSkyWind {

    public static void main (String[] args) throws InterruptedException, IOException {


        ReadToFile readToFile = new ReadToFile();
        OpenToChrome openToChrome = new OpenToChrome();

        readToFile.sheet(".src/main/resources/HelpTheLastKindom.xlsx");
        openToChrome.readToRealGame("http://gc.gaming.skywindgroup.com/lastkingdom/develop/413/index.html");

        //ArrayList<String> fileText = readToFile.fileHelp();
        //ArrayList<String> gameText = openToChrome.readToRealGame();

        WordDivision wordDivision = new WordDivision();
        //wordDivision.onlyWord(gameText);
        //wordDivision.onlyWord(fileText);

        CompareWords compareWords = new CompareWords();
        //System.out.println(compareWords.compareWords(wordDivision.onlyWord(fileText),wordDivision.onlyWord(gameText)));
        //compareWords.compareWords(wordDivision.onlyWord(fileText),wordDivision.onlyWord(gameText));

        diffMatchPatch obj = new diffMatchPatch();
        LinkedList<diffMatchPatch.Diff> diffs = obj.diff_main("qwerty 1234 hjhjhj","qwertyu 123 hjhjhj");
        for (diffMatchPatch.Diff item : diffs)
        {
            System.out.println (item.toString());
        }
    }
}