package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {

       /* Book emptyBook;
        System.out.println(emptyBook);

        emptyBook = null;
        System.out.println("Empty book null: "+emptyBook);

        Book anotherBook = new Book();
        System.out.println("empty book és another book összehasonlítás: "+(emptyBook == anotherBook));

        anotherBook = emptyBook;
        System.out.println("another book empty book értékadás: "+anotherBook);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;*/

        // Gyakorlati feladat - Tömbök és listák

        // Definiálj egy `Book` tömböt, és adj értékül neki egy tömb literált, három
        // példányosított `Book` objektummal!
        Book[] books = {new Book(), new Book(), new Book()};
        System.out.println(Arrays.toString(books));

        // Definiálj egy `List<Book>` listát, és az `Arrays.asList()` metódust
        // használva tegyél bele három példányosított elemet!
        List<Book> books1 = Arrays.asList(new Book(), new Book(), new Book());
        System.out.println(books1);

        // Definiálj egy `List<Book>` üres listát, majd külön utasításokban adj hozzá
        // három példányosított objektumot!
        List<Book> books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());
        System.out.println(books2);


    }
}
