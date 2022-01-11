package genericsusage.withgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testLibraryNotEmpty() {
        Library library1 = new Library();
        Book book1 = new Book("Tüskevár");
        Book book2 = new Book("Winnetou");
        assertEquals("Tüskevár", library1.getFirstBook(Arrays.asList(book1, book2)).getTitle());
    }

    @Test
    void testLibraryNull() {
        Library library2 = new Library();
        Exception ex = assertThrows(NullPointerException.class , ()->library2.getFirstBook(null));
        assertEquals("List cannot be null!", ex.getMessage());
    }

     @Test
    void testLibraryEmpty() {
        Library library3 = new Library();
        List<Book> books = new ArrayList<>();
        Exception ex = assertThrows(IllegalArgumentException.class, ()->library3.getFirstBook(books));
        assertEquals("The library cannot be empty!", ex.getMessage());

    }
}