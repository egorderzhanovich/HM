package HM.marchTwentySix.AirTransport;

import HM.marchTwentySix.enums.MobileMark;

public class CivilPlane extends AirTransport{
    protected int amountOfPassengers;
    protected boolean hasABusinessClass;

    public CivilPlane(int power, int maxSpeed, int mass, MobileMark mark, int wingspan, int minRunwayLength, int amountOfPassengers, boolean hasABusinessClass) {
        super(power, maxSpeed, mass, mark, wingspan, minRunwayLength);
        this.amountOfPassengers = amountOfPassengers;
        this.hasABusinessClass = hasABusinessClass;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public boolean isHasABusinessClass() {
        return hasABusinessClass;
    }

    @Override
    public String toString() {
        return "Пассажирский самолет:" +
                "\nКоличество посадочных мест:" + amountOfPassengers +
                "\nНаличие бизнесс-класса: " + hasABusinessClass +
                "\nРазмах крыльев самолета:" + wingspan +
                 "м.\nМинимальная длина взлетно-посадочной полосы для взлета: " + minRunwayLength +
                "м.\nМощность двигателя: " + power +
                "л/с.\nМаксимальная скорость:" + maxSpeed +
                "км/ч.\nМасса: " + mass +
                "кг.\n Марка:" + mark +
                "\nМощность в килловатах: " + getPowerInKW()+ "кВ.";
    }

    public void checkPassengerCapacity(int passengersAmount){
        if(getAmountOfPassengers() >= passengersAmount){
            System.out.println("Самолет загружен");
        }else{
            System.out.println("Вам нужен самолет с большим количеством посадочных мест");
        }
    }
}
