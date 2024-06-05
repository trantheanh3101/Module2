package MVC_Exercise.LibraryManeger.repositories;

import MVC_Exercise.LibraryManeger.model.Book;
import MVC_Exercise.LibraryManeger.model.Document;
import MVC_Exercise.LibraryManeger.model.Journal;
import MVC_Exercise.LibraryManeger.model.Newspaper;

import java.util.ArrayList;

public class LibraryManager {
    ArrayList<Document> documentArrayList;

    public LibraryManager() {
        documentArrayList = new ArrayList<>();
        documentOrigin();
    }

    public void documentOrigin(){

        addDocument(new Book("S001", "NXB Kim Đồng", 1000, "Nguyễn Nhật Ánh", 300));
        addDocument(new Journal("T001", "NXB Trẻ", 500, "001", "06/2023"));
        addDocument(new Newspaper("B001", "NXB Thanh Niên", 200, "01/06/2023"));

    }

    public ArrayList<Document> getDocumentArrayList(){
        return documentArrayList;
    }

    public void addDocument(Document document) {
        documentArrayList.add(document);
    }

//    public void addBook(Document book) {
//        documentArrayList.add(book);
//    }
//
//    public void addJournal(Document journal) {
//        documentArrayList.add(journal);
//    }
//
//    public void addNewspaper(Document newspaper) {
//        documentArrayList.add(newspaper);
//    }

    public void deleteDocument(String code) {
        documentArrayList.removeIf(document -> document.getDocumentCode().equals(code));
    }
}
