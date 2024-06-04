package MVC_Exercise.LibraryManeger.model;

public class Book extends Document{
    private String author;
    private int page;

    public Book() {
    }

    public Book(String author, int page) {
        this.author = author;
        this.page = page;
    }

    public Book(String documentCode, String imprint, int quantity, String author, int page) {
        super(documentCode, imprint, quantity);
        this.author = author;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
