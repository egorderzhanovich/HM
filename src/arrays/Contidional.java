package HM.arrays;

import java.util.Scanner;

public class Contidional {
    Scanner sc = new Scanner(System.in);
  /*  Имеется прямоугольное отверстие размерами a и b.
    Определите можно ли его полностью закрыть круглой картонкой радиусом r.
    Вывести результат на экран.

    Данные a, b и r ввести с консоли.
*/
    public void checkSize(){

        System.out.println("insert length of rectangular hole:");
        int length = sc.nextInt();
        System.out.println("insert width of rectangular hole:");
        int width = sc.nextInt();
        System.out.println("insert radius of circle:");
        int radius = sc.nextInt();

        if (radius * radius >= (length * length + width * width) / 4)
            System.out.println("Можно");
        else
            System.out.println("Нельзя");
    }


  /*  Имеется целое число n < 10.
    Вывести какому дню недели оно соответствует, если при n = 1 день недели = Понедельник.
*/
    public void switchConstruction(){

        System.out.println("Введите число n которое не превышает 10:");
        int n = sc.nextInt();
        while(n<0||n>10) {
            System.out.println("Вы ввели неккоректное число, попробуйте снова");
            n = sc.nextInt();
        }

        switch(n){
            case 1:
                System.out.println("Понедельник");break;
            case 2:
                System.out.println("Вторник");break;
            case 3:
                System.out.println("Среда");break;
            case 4:
                System.out.println("Четверг");break;
            case 5:
                System.out.println("Пятница");break;
            case 6:
                System.out.println("Суббота");break;
            case 7:
                System.out.println("Воскресенье");break;
            default:
                System.out.println("Введеное вами число не сопоставляется ни с одним днем недели");



        }
    }
}
