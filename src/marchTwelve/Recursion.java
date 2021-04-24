package HM.marchTwelve;

public class Recursion {

    //Дано натуральное число n>1. Используя рекурсию, необходимо проверить, является ли оно простым.
    // Программа должна вывести фразу «Is number <your number> simple - YES», если число простое и «Is number <your number> simple - NO», если число составное.
    //Для вывода информации используйте метод printf
    public static void recursion(int n,int a) {

        if (n < 2) {
            System.out.printf("\"Is number %d simple - NO\"", n);
        } else if (n == 2) {
            System.out.printf("\"Is number %d simple - YES\"", n);
        } else if (n % a == 0) {
            System.out.printf("\"Is number %d simple - NO\"", n);
        } else if (a < n / 2) {
            recursion(n,a+1);
        } else {
            System.out.printf("\"Is number %d simple - YES\"", n);
        }

    }

}
