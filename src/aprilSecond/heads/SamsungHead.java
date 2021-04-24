package HM.aprilSecond.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead() {
    }

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Head is made by Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
