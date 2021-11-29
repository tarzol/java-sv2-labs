package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Arabica");
        coffee.setPrice(300);

        System.out.println(("coffee neve: "+coffee.getName()));
        System.out.println("ára: "+coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Cappuccino");
        cappuccino.setPrice(500);
        System.out.println(("Cappuccino neve: "+cappuccino.getName()));
        System.out.println("Cappuccino ára: "+cappuccino.getPrice());


    }
}
