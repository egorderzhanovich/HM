package HM.marchTwentySix.TerrestrialTransport;

import HM.marchTwentySix.enums.MobileMark;
import HM.marchTwentySix.Transport;

public class Terrestrial extends Transport {
    protected int amoutOfWheels;
    protected double fuelConsumption; // литров на 100 км

    public Terrestrial(int power, int maxSpeed, int mass, MobileMark mark, int amoutOfWheels, double fuelConsumption) {
        super(power, maxSpeed, mass, mark);
        this.amoutOfWheels = amoutOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getAmoutOfWheels() {
        return amoutOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

}
