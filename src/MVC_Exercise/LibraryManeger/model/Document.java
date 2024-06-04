package MVC_Exercise.LibraryManeger.model;

public class Document {
    private String documentCode;
    private String imprint;
    private int quantity;

    public Document() {
    }

    public Document(String documentCode, String imprint, int quantity) {
        this.documentCode = documentCode;
        this.imprint = imprint;
        this.quantity = quantity;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "documentCode='" + documentCode + '\'' +
                ", imprint='" + imprint + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
