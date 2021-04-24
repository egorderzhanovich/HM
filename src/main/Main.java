package HM.main;

import HM.aprilNine.callback.CallbackExecutor;
import HM.aprilNine.callback.Timer;
import HM.aprilNine.customException.Car;
import HM.aprilNine.customException.NumberIsEvenException;
import HM.aprilNine.enums.Alphabet;
import HM.aprilNine.generics.GenericClass;
import HM.aprilSixteen.Product;
import HM.aprilSixteen.SortByPrice;
import HM.aprilSixteen.Store;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        store.addProduct(new Product(1,"Sugar",115));
        store.addProduct(new Product(3,"Apple",25));
        store.addProduct(new Product(2,"Tea",45));
        store.addProduct(new Product(4,"Chocolate",455));
        store.addProduct(new Product(1,"Cookies",235));

        System.out.println(store.getProductList());
      //  Collections.sort(store.getProductList(),new SortByPrice());
        //System.out.println(store.getProductList());
       // store.deleteProduct(4);
       Collections.reverse(store.getProductList());
        System.out.println(store.getProductList());
    }
}
