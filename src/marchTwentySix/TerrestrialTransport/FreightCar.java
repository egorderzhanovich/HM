package HM.marchTwentySix.TerrestrialTransport;

import HM.marchTwentySix.enums.MobileMark;

public class FreightCar  extends Terrestrial{
    protected double carryingCapacity; // тонны

    public FreightCar(int power, int maxSpeed, int mass, MobileMark mark, int amoutOfWheels, double fuelConsumption, double carryingCapacity) {
        super(power, maxSpeed, mass, mark, amoutOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль:" +
                "\nГрузоподъемность: " + carryingCapacity +
                "т.\nКоличество колес: " + amoutOfWheels +
                "\nРасход топлива: " + fuelConsumption +
                "литров/100км\nМощность двигателя: " + power +
                "л.с.\nМаксимальна скорость:" + maxSpeed +
                "км/ч\nМасса: " + mass +
                "кг\nМарка авто: " + mark +
                "\nМощность в килловатах: " + getPowerInKW() + "кВ.";
    }

    public void calcAmountOfCargo(double cargo){

        if(getCarryingCapacity() >= cargo){
            System.out.println("Грузовик загружен");
        }
        else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
