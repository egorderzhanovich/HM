package HM.aprilSecond.heads;

public class TeslaHead implements IHead {
    private int price;

    public TeslaHead() {
    }

    public TeslaHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Head is made by Tesla");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
