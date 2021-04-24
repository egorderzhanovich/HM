package HM.arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysHM {
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);

    //Создать и заполнить массив случайными числами, отсортировать массив по возрастанию, используя метод сортировки пузырьком.
    public void fillarraywithrandom() {
        int[] array = new int[20];

        //fills array with random numbers
        for(int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        //sort array with bubble sort
        for(int i = 0; i < array.length; i++) {
            int temp = 0;
            for(int j = i; j <array.length;j++) {
                if(array[i] > array[j]) {
                    temp= array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    //Создать двумерный массив, размером n x n (размер массива вводить с консоли). Если элемент массива является четным числом, вывести 0, если не четным 1. Использовать циклы.
    public void twoDimensionalArr() {
        System.out.println("Insert amout of rows for array:");
        int rows = sc.nextInt();
        System.out.println("Insert amount of columns for array");
        int columns = sc.nextInt();


        //fills array with random numbers
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(100);
            }
        }
        //replaces even numbers on 0 and odd numbers on 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2 !=0) {
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = 0;
                }
            }
        }

        //outputs the result on console
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

   // В векторе, состоящем из n вещественных элементов, вычислить: сумму отрицательных элементов вектора и произведение элементов вектора, расположенных между максимальным и минимальным элементами.
    public void findSomething() {
        System.out.println("Insert size of array:");
        int sizeOfArr = sc.nextInt();

        double[] array = new double[sizeOfArr];

        //fills array with random numbers
        for(int i = 0; i < array.length; i++) {
            array[i] = rnd.nextDouble()*200.0-100.0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }

        double minValue = Integer.MAX_VALUE;
        double maxValue = Integer.MIN_VALUE;
        int minElem = 0;
        int maxElem = 0;
        for (int i = 0; i < array.length; i++) {
            if(minValue>array[i]){
                minValue = array[i];
                minElem = i;
            }
            else if(maxValue < array[i]){
                maxValue = array[i];
                maxElem = i;
            }
        }

        double composition = 1;
        double sumBetweenMaxMin = 0;
        if(minElem>maxElem) {
            for (int i = maxElem; i <= minElem; i++) {
                composition = array[i] * composition;
                if(array[i] <0)
                sumBetweenMaxMin +=array[i];

            }
        }
        else if(maxElem>minElem){
            for (int i = minElem; i <= maxElem; i++) {
                composition *=array[i];
                if(array[i] <0)
                sumBetweenMaxMin +=array[i];

            }
        }
        System.out.printf("\nSum between Max and Min value = %.2f",sumBetweenMaxMin);
        System.out.printf("\nComposition between Max and Min value = %.2f",composition);



    }

//Создать зубчатый (рваный) двумерный массив, заполненный случайными числами, вывести его элементы на экран. Каждая строка зубчатого двумерного массива должны быть произвольной длины. Длина строки должна выбираться случайно. Использовать класс Random или Math.random().
    public void twoDimArray(){

        int array[][] = new int[rnd.nextInt(11)+1][];
        for (int i = 0; i < array.length ; i++) {
            array[i] = new int[rnd.nextInt(20)];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(30);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
