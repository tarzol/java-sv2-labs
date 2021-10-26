package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem bor = new BillItem("bor", 1000, 2, 0.27);
        BillItem cukor = new BillItem("cukor", 200, 5, 0.05);

        System.out.println("1. termék megnevezése: "+bor.getProduct());
        System.out.println("1. termék ára "+bor.getPrice()+" Ft");
        System.out.println("1. termék mennyisége: "+bor.getQuantity()+" db");
        System.out.println("2. termék megnevezése: "+cukor.getProduct());
        System.out.println("2. termék ára: "+cukor.getPrice()+" Ft");
        System.out.println("1. termék mennyisége: "+cukor.getQuantity()+" db");

        double totalPrice = bor.calculateTotalPrice()+cukor.calculateTotalPrice();
        System.out.println("A teljes költés: "+totalPrice+" Ft");
    }
}


