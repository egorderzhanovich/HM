package aprilTwentythree.secondTask;

import java.io.*;

public class TextFormatter {

    private static int amoutnOfWordsInLine(String s){
         String[] array = s.split(" ");
         return array.length;
    }


    private static boolean isPalindrome(String s){
        boolean isPalindrome = false;
        StringBuilder sb;
        String[] array = s.split(" ");
        for(String str : array){
            sb = new StringBuilder(str);
            if(str.equalsIgnoreCase(sb.reverse().toString()) && str.length() >=3){
                isPalindrome = true;
                break;
            }
        }
        return isPalindrome;
    }


    public static String[] getSentences(File text){
        StringBuilder sb = new StringBuilder();
        String readLine;

        try (BufferedReader bf = new BufferedReader(new FileReader(text))) {

            while ((readLine = bf.readLine()) != null) {
                sb.append(readLine);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        String as = sb.toString();
        String[] array = sb.toString().split("[.!?]");
        return array;
    }


    public static void findSentences(String[] array,File finished){
        int sizeOfSentence = 0;
        for (String s : array) {
            sizeOfSentence = TextFormatter.amoutnOfWordsInLine(s);
            if (sizeOfSentence >=3 && sizeOfSentence <=5 || TextFormatter.isPalindrome(s)) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(finished,true))) {
                    bufferedWriter.append(s + "\n");
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }
}
