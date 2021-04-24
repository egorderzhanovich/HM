package HM.aprilSixteen;

import java.util.*;

public class Store {
    private Scanner sc = new Scanner(System.in);
    private List<Product> productList = new LinkedList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == product.getId()){
                System.out.println("Product with ID:" + product.getId() + " already exist, could not add product with existing ID");
                return;
            }

        }
        productList.add(product);

    }

    public void deleteProduct(int id) {
       productList.remove(findByID(id));
    }

    public void editProduct(int id) {
        Product prod = findByID(id);

        System.out.println("Выберите что вы хотите изменить\n1.Наименование товара\n2.Цену товара\n0.Выход");
        while(true) {
            int decision = sc.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Введите новое наименование для товара");
                    sc.nextLine();
                    String name = sc.nextLine();
                    prod.setName(name);
                    break;
                case 2:
                    System.out.println("Введите новую цену для товара");
                    prod.setPrice(sc.nextInt());
                    break;
                default:
                    break;
            }
            System.out.println("Выберите что вы хотите изменить\n1.Наименование товара\n2.Цену товара\n0.Выход");
            if(decision== 0) break;
        }



    }

    private  Product findByID(int id) {
       Product prod = null;
        for (Product p : productList) {
            if(p.getId() == id){
                prod = p;
            }
        }
        return prod;
    }
}

