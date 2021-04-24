package HM.marchTwentySix.TerrestrialTransport;

import HM.marchTwentySix.enums.CarBodyType;
import HM.marchTwentySix.enums.MobileMark;

public class PassengerCar extends Terrestrial {
    protected CarBodyType carBodyType;
    protected int amountOfPassengers;

    public PassengerCar(int power, int maxSpeed, int mass, MobileMark mark, int amoutOfWheels, double fuelConsumption, CarBodyType carBodyType, int amountOfPassengers) {
        super(power, maxSpeed, mass, mark, amoutOfWheels, fuelConsumption);
        this.carBodyType = carBodyType;
        this.amountOfPassengers = amountOfPassengers;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " +
                "\nТип кузова: " + carBodyType +
                "\nКоличество посадочных мест: " + amountOfPassengers +
                "\nКоличество колес: " + amoutOfWheels +
                "\nРасход топлива: " + fuelConsumption +
                "литров/100км\nМощность двигателя: " + power +
                "л.с.\nМаксимальна скорость:" + maxSpeed +
                "км/ч\nМасса: " + mass +
                "кг\nМарка авто: " + mark+
                "\nМощность в килловатах: " + getPowerInKW() + "кВ.";
    }


    public void calculateDistanceM(int timeInMinutes){
        double distance = getMaxSpeed() * timeInMinutes / 60;
        System.out.println("За время " + timeInMinutes + " мин., автомобиль " + this.getMark() + ", двигаясь с " +
                "максимальной скоростью " + this.getMaxSpeed() + " км/ч. проедет " + distance + " км. и израсходует " +
                calcFuelConsumption(distance) + " литров топлива");

    }

    public void calculateDistanceH(int timeInHours){
        double distance = getMaxSpeed() * timeInHours ;
        System.out.println("За время " + timeInHours + " ч., автомобиль " + this.getMark() + ", двигаясь с " +
                "максимальной скоростью " + this.getMaxSpeed() + " км/ч. проедет " + distance + " км. и израсходует " +
                calcFuelConsumption(distance) + " литров топлива");

    }
    private double calcFuelConsumption(double distance){
        return getFuelConsumption() * distance/100.0;
    }
}
