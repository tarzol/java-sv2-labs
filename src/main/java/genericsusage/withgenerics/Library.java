package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.Arrays;
import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books) {
        if (books == null ) {
            throw new NullPointerException("List cannot be null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("The library cannot be empty!");
        }
        return books.get(0);
    }
}
