package inheritanceattributes.book;

public class ShippedBook extends Book {
    int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        int priceOfBooks = price*pieces;
        return pieces*price+shippingCost;
    }
    public String toString() {
        return getTitle()+" "+price+" Ft + Postaköltség: "+shippingCost+" Ft";
    }

    public static void main(String[] args) {
        Book book1 = new Book("Lord of the rings", 3000);
        Book book2 = new Book("Titanic", 2500);
        Book book3 = new Book("Zabhegyező", 1500);
        ShippedBook shippedBook = new ShippedBook(book1.getTitle(), book1.price, 1200);
        System.out.println(shippedBook.order(3));
        System.out.println(shippedBook.toString());

    }
}
