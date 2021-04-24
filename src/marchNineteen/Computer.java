package HM.marchNineteen;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private Random rnd = new Random();
    private Scanner sc = new Scanner(System.in);
    private String typeOfProcessor;
    private String capacityOfRAM;
    private String capacityOfSSD;
    private boolean isWorking = true;

    public Computer(String typeOfProcessor, String capacityOfRAM, String capacityOfSSD) {
        this.typeOfProcessor = typeOfProcessor;
        this.capacityOfRAM = capacityOfRAM;
        this.capacityOfSSD = capacityOfSSD;
    }

    public String getTypeOfProcessor() {
        return typeOfProcessor;
    }

    public void setTypeOfProcessor(String typeOfProcessor) {
        this.typeOfProcessor = typeOfProcessor;
    }

    public String getCapacityOfRAM() {
        return capacityOfRAM;
    }

    public void setCapacityOfRAM(String capacityOfRAM) {
        this.capacityOfRAM = capacityOfRAM;
    }

    public String getCapacityOfSSD() {
        return capacityOfSSD;
    }

    public void setCapacityOfSSD(String capacityOfSSD) {
        this.capacityOfSSD = capacityOfSSD;
    }

    public void turnOnComputer(){

        if(isWorking!=false){
            System.out.println("Введите код 1 или 0 для включения компьютера:");
            if(sc.nextInt()== rnd.nextInt(2)){
                System.out.println("Компьютер включен.Добро пожаловать");
            }
            else{
                System.out.println("Вы ввели не верный код, компьютер сгорел!!");
                isWorking = false;
            }
        }else{
            System.out.println("Компютер сгорел и не может быть ни включен ни выключен!");
        }
    }
    public void turnOffComputer(){

        if(isWorking!=false){
            System.out.println("Введите код 1 или 0 для выключения компьютера:");
            if(sc.nextInt()== rnd.nextInt(2)){
                System.out.println("Компьютер выключен");
            }
            else{
                System.out.println("Вы ввели не верный код, компьютер сгорел!!");
                isWorking = false;
            }
        }
        else{
            System.out.println("Компютер сгорел и не может быть ни включен ни выключен!");
        }
    }
}
