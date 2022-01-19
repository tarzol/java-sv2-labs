package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {
    private List<Book> books = new ArrayList<>();

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        //List<String> result = new ArrayList<>();
        List<String> result = books.stream().
                filter(book -> book.getPages() < maxNumberOfPages).
                map(book -> book.getTitle()).
                collect(Collectors.toList());
        return result;
    }

    public void addBook (Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        List<String> result = books.stream().
                filter(book -> book.getAuthor().equals(author)).
                map(book -> book.getTitle()).
                sorted().
                collect(Collectors.toList());

        return result;
    }

    public  List<String> listAuthors() {
        List<String> result = books.stream().
        map(book -> book.getAuthor()).
        distinct().
        collect(Collectors.toList());
        return result;
    }
}
