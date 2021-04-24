package aprilTwentythree.thirdTask;
import aprilTwentythree.secondTask.TextFormatter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Censorship {
    private ArrayList<String> wordsBL = new ArrayList<>();

    public void createBlackList(File blackList) {

        String word = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(blackList))) {
            while ((word = bufferedReader.readLine()) != null) {
                wordsBL.add(word);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void censorshipCheck(File text) {
        String[] array = TextFormatter.getSentences(text);
        int counter = 0;
        int amountOfWrongSentences = 0;
        ArrayList<String> wrongSentences = new ArrayList<>();
        while (counter < array.length) {
            String[] splitedSentence = array[counter].split(" ");
            for (String word : splitedSentence) {
                for (String wordBL : wordsBL) {
                    if (word.matches(wordBL)) {
                        amountOfWrongSentences++;
                        wrongSentences.add(array[counter]);
                    }
                }
            }
            counter++;
        }
        if (amountOfWrongSentences == 0) {
            System.out.println("Текст прошел проверку на цензуру!");
        } else {
            System.out.print("Количество предложений не прошедших проверку: " + amountOfWrongSentences + "\n");
            for (String s : wrongSentences) {
                System.out.println(s);
            }
        }
    }
}


