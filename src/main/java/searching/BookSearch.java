package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BookSearch {
    private List<Book> books = new ArrayList<>();

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if ( author.equals("") || title.isEmpty() || author == null ) {
            throw new IllegalArgumentException("The author or title cannot be empty!");
        }

        Book bookSearched = new Book(author, title);
        int found = Collections.binarySearch(books, bookSearched);
        if ( found < 0) {
            throw new IllegalArgumentException("the book by "+author+" with title "+title+" was not found!");
        }

        return books.get(found);
    }
}
