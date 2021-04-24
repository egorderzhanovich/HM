package HM.aprilSecond.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(){

    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Leg is made by Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
