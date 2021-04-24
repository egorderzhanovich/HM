package HM.aprilSecond.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand() {
    }

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Hand is made by Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
