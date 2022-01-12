package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

    List<Book> books = new ArrayList<>();

    @BeforeEach
    void setUp() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/books.csv"));
        for (String s : lines) {
            String[] lineParts = s.split(";");
            books.add(new Book(lineParts[1], lineParts[2]));
        }
    }

    @Test
    void testEmptyParametersShouldThrowException() {
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle("", ""));
        assertEquals("The author or title cannot be empty!", ex.getMessage());
    }

    @Test
    void testNullParametersShouldThrowException() {
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle(null, null));
        assertEquals("The author or title cannot be empty!", ex.getMessage());
    }
}