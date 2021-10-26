package attributes.bill;

public class BillItem {
    String product;
    int price;
    int quantity;
    double vatPercent;

    public BillItem(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }
    public double totalAmount;
    public double calculateTotalPrice() {
        totalAmount = price*quantity*(1 + vatPercent);
        return totalAmount;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getVatPercent() {
        return vatPercent;
    }
}
