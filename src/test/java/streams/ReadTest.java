package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {

       Read read;

        @BeforeEach
        void init() {
            read = new Read();
            read.addBook(new Book("Gárdonyi Géza", "Egri csillagok", 609));
            read.addBook(new Book("Molnár Ferenc", "Pál utcai fiúk", 158));
            read.addBook(new Book("Fekete István", "Tüskevár", 302));
            read.addBook(new Book("Fekete István", "Téli berek", 339));
            read.addBook(new Book("Gárdonyi Géza", "Ida regénye", 406));
            read.addBook(new Book("Jókai Mór", "Egy magyar nábob", 431));
            read.addBook(new Book("Jókai Mór", "A kőszívű ember fiai", 632));
            read.addBook(new Book("Mikszáth Kálmán", "Szent Péter esernyője", 223));
            read.addBook(new Book("Jókai Mór", "Az arany ember", 460));
            read.addBook(new Book("Mikszáth Kálmán", "Beszterce ostroma", 209));
        }

    @Test
    void listBookTitlesShorterThanGiven() {

            assertEquals(3, read.listBookTitlesShorterThanGiven(300).size());
            assertEquals("Pál utcai fiúk",read.listBookTitlesShorterThanGiven(300).get(0));
            assertEquals("Beszterce ostroma",read.listBookTitlesShorterThanGiven(300).get(2));
    }

    @Test
    void listBookTitlesWithGivenAuthor() {
            assertEquals(3, read.listBookTitlesWithGivenAuthor("Jókai Mór").size());
            assertEquals("Az arany ember", read.listBookTitlesWithGivenAuthor("Jókai Mór").get(1));
    }

    @Test
    void listAuthors() {
        List<String> expected = Arrays.asList("Gárdonyi Géza", "Molnár Ferenc", "Fekete István", "Jókai Mór", "Mikszáth Kálmán");

        assertEquals(expected, read.listAuthors());


    }
}