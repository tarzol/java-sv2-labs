package attributes.book;


public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("A Pál utcai fiúk");
        System.out.println(book1.getTitle());

        book1.setTitle("Winnetou");
        System.out.println(book1.getTitle());
    }


}
