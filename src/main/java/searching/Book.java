package searching;

public class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return id+"  "+title+" "+author;
    }

    @Override
    public int compareTo(Book anotherBook) {
        if ( author.compareTo(anotherBook.author) != 0) {
            return author.compareTo(anotherBook.author);
        } else {
            return title.compareTo(anotherBook.title);
        }
    }
}
