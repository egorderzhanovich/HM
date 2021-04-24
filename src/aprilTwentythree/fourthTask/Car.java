package aprilTwentythree.fourthTask;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String carModel;
    private int maxSpeed;
    private int price;

    public Car(String carModel, int maxSpeed, int price) {
        this.carModel = carModel;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                price == car.price &&
                Objects.equals(carModel, car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel, maxSpeed, price);
    }
}
