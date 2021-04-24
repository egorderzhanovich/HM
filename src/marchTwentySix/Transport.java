package HM.marchTwentySix;

import HM.marchTwentySix.enums.MobileMark;

public class Transport {
    protected int power; // в л.с
    protected int maxSpeed; //км/ч
    protected int mass; //кг
    protected MobileMark mark;


    public Transport(int power, int maxSpeed, int mass, MobileMark mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    public MobileMark getMark() {
        return mark;
    }

    protected double getPowerInKW(){
        return getPower()*0.74;
    }
}
