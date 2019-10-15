import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;

public class WordDivision {
    public ArrayList<ArrayList> onlyWord(ArrayList<String> text)
    {

        ArrayList<ArrayList> allWordsDivision = new ArrayList<>();
        for (int q = 0; q<text.size(); q++) {
            String[] word = text.get(q).split("\\s");
            ArrayList<String> wordsDivision = new ArrayList<>();
            for (int i = 0; i < word.length; i++) {
                wordsDivision.add(i, word[i]);
            }
            allWordsDivision.add(q,wordsDivision);
        }
        return allWordsDivision;
    }
}
