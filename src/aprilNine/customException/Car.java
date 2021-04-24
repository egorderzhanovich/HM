package HM.aprilNine.customException;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private double price;
    private Random rnd = new Random();

    public Car() {
    }

    public Car(String model, int speed, double price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    public void start() throws NumberIsEvenException {
        int rand = rnd.nextInt(20);
        if (rand % 2 == 0) {
            throw new NumberIsEvenException("Ваша " + model + " не завелась, попробуте снова");
        } else {
            System.out.println("Ваша  " + model + " завелась!!");
        }

    }
}
