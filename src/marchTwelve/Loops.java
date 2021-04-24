package HM.marchTwelve;

public class Loops {



    //Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
    //Напишите программу, определяющую какой
    //суммарный путь пробежит спортсмен за 7 дней?
    public void totalPath(){
        double totalPath = 10.0;
        double nextDayPath = totalPath;
        for (int i = 1; i <7; i++) {
            nextDayPath =  nextDayPath+ nextDayPath/10.0;
            totalPath+=nextDayPath;
        }
        System.out.printf("Суммарный путь, который спортсмен пробежал за 7 дней равен: %.2f",totalPath );
    }



    //Одноклеточная амеба каждые 3 часа делится на 2 клетки. Необходимо определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
    public void findAmountOfAmeba(){
        int UnicellularAmeba = 1;
        int amountOfAmeba=UnicellularAmeba*2;
        for(int i = 3; i < 24; i=i+3){
            amountOfAmeba =  amountOfAmeba*2;
        }
        System.out.println("\nОдноклеточная амеба разделилась за 24 часа на " + amountOfAmeba + " клеток");
    }



    //Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99.
    public void sumOfEvenNumbers(){
        int sumOfEvenNumbers = 0;
        for (int i = 0; i <= 99; i=i+2) {
            sumOfEvenNumbers +=i;
        }
        System.out.println("Сумма четный чисел в диапазоне от 1 до 99 равна: " + sumOfEvenNumbers);
    }
}
