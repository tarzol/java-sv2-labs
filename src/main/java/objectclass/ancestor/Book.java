package objectclass.ancestor;

public class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public boolean equals(Object o) {
        return true;
    }
}
