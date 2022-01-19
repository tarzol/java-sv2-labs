package collectionsequalshash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Webshop {

    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public Webshop(List<Product> products) {
        this.products = products;
    }

    public int findHowMany(Product product) {
        int count = 0;
        for ( Product actual: products) {
            if (actual.equals(product)) {
                count++;
                System.out.println(actual.getName()+" "+actual.getRegistryNumber());
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Webshop webshop1 = new Webshop(Arrays.asList(
                new Product("cukor", "123456"),
                new Product("Liszt", "45678"),
                new Product("vaj", "123456")));
        Product liszt = new Product("vaj", "123456");
        System.out.println(webshop1.findHowMany(liszt));
        for (Product actual: webshop1.getProducts()) {
            if ( actual.getRegistryNumber().equals(liszt.getRegistryNumber())) {
                System.out.println(actual.getName()+" "+actual.getRegistryNumber());
            }

        }
    }




}
