package HM.marchTwelve;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysH {

    public void createArrays(){
        Random rnd = new Random();
        int number = getInt();
        int array[] = new int[number];
        int counterOfEvenNumbers = 0;

        //Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(50)+1;
            if(array[i]%2 ==0){
                counterOfEvenNumbers++;
            }
        }
        System.out.println("Массив заполненный случайными числами:");
        System.out.println(Arrays.toString(array));

        //Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        int j = 0;
        int evenArray[] = new int[counterOfEvenNumbers];

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 ==0){
                evenArray[j] = array[i];
                j++;
            }
        }
        System.out.println("Массив заполненный четныйми числами взятых из массива выше:");
        System.out.println(Arrays.toString(evenArray));


    }


    //Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
    //
    //Если пользователь ввёл не подходящее число, то программа
    //должна выдать соответствующее сообщение.
    public int getInt(){
        String input = "";
        int result;
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите число большее 3:");
                input = scan.next();
                result = Integer.parseInt(input);
            } catch(Exception e) {
                System.out.println("Вы ввели не число");
                continue;
            }

            if (result <3) {
                System.out.println("Введите число большее 3!");
            }
            else {
                break;
            }
        }
        return result;
    }

}
