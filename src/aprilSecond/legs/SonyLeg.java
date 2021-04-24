package HM.aprilSecond.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(){

    }

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Leg is made by Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
