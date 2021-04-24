package HM.aprilSixteen;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product prod1, Product prod2) {
        return prod2.getPrice() - prod1.getPrice();
    }
}
