package HM.aprilNine.generics;

import java.util.Arrays;

public class GenericClass<T> {

    T[] array;

    public GenericClass(T[] array){
        this.array = array;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public  void getElementByIndex(int index){

        try {
            System.out.println(array[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Элемента с таким инденсом не сущестует");
        }
    }
}
