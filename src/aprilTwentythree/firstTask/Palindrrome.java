package aprilTwentythree.firstTask;

import java.io.*;
import java.util.ArrayList;

public class Palindrrome {
    private ArrayList<String> results = new ArrayList<>();

    private void readFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                results.add(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void findPalindrome(File outputFile,File inputFile) {
        StringBuilder sb = new StringBuilder();
        readFile(outputFile);
        for (String s : results) {
            if (reverse(s)) {
                sb.append(s + "\n");
            }
        }
        inputData(inputFile,sb.toString());
    }



    private boolean reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equalsIgnoreCase(sb.toString()))
        return true;
        else {
            return false;
        }
    }



    private void inputData(File inputFile, String s) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile))) {
            bw.append(s);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
