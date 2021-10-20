package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Orwell","1984" );

        System.out.println(book.getAuthor());

        //register("1234");

        System.out.println("Szerző:  "+book.getAuthor());
        System.out.println("Cím:  "+book.getTitle());
        System.out.println("Reg. szám:  "+book.getRegNumber());

    }

}
