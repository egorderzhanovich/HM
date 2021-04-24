package HM.aprilSecond.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead() {
    }

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Head is made by Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
