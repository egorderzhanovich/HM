package HM.aprilSecond.hands;

public class TeslaHand implements IHand {
    private int price;

    public TeslaHand(){

    }

    public TeslaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Hand is made by Tesla");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
