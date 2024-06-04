package MVC_Exercise.LibraryManeger.model;

public class Newspaper extends Document{
    private String releaseDate;

    public Newspaper() {
    }

    public Newspaper(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Newspaper(String documentCode, String imprint, int quantity, String releaseDate) {
        super(documentCode, imprint, quantity);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" + super.toString() +
                "releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
