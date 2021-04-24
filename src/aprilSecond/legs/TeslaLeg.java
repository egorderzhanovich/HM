package HM.aprilSecond.legs;

public class TeslaLeg implements ILeg {
    private int price;

    public TeslaLeg(){

    }

    public TeslaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Leg is made by Tesla");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
