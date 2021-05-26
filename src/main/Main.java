package main;


import aprilTwentythree.firstTask.Palindrrome;
import aprilTwentythree.fourthTask.Car;
import aprilTwentythree.secondTask.TextFormatter;
import aprilTwentythree.thirdTask.Censorship;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        //1
        File textFile = new File("src/aprilTwentythree/firstTask/textfile");
        File outputFile = new File("src/aprilTwentythree/firstTask/outputFile");
        Palindrrome p = new Palindrrome();
        p.findPalindrome(textFile,outputFile);

        //2
        File textFile1 = new File("src/aprilTwentythree/secondTask/text");
        File finished = new File("src/aprilTwentythree/secondTask/finished");
        String[] array = TextFormatter.getSentences(textFile1);
        TextFormatter.findSentences(array,finished);

        //3
        File blackList = new File("src/aprilTwentythree/thirdTask/blackList");
        File textFile3 = new File("src/aprilTwentythree/thirdTask/textFile");
        Censorship censorship = new Censorship();
        censorship.createBlackList(blackList);
        censorship.censorshipCheck(textFile3);

        //4
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/aprilTwentythree/fourthTask/car.dat"))){
            Car car = new Car("BMW",300,35000);
            objectOutputStream.writeObject(car);
        }catch (IOException e){
            e.getMessage();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/aprilTwentythree/fourthTask/car.dat"))){
            Car bmw = (Car)objectInputStream.readObject();
            System.out.println(bmw.toString());
        }catch (IOException | ClassNotFoundException e){
            e.getMessage();
        }

    }


}
