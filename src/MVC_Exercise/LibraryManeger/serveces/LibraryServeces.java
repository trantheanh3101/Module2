package MVC_Exercise.LibraryManeger.serveces;

import MVC_Exercise.LibraryManeger.model.Document;
import MVC_Exercise.LibraryManeger.repositories.LibraryManager;
import MVC_Exercise.LibraryManeger.view.LibraryView;

import java.util.ArrayList;

public class LibraryServeces {
    LibraryManager libraryManager;

    public LibraryServeces() {
        this.libraryManager = new LibraryManager();
    }

    public void addBook(LibraryView view) {
        Document book = view.getDetailBook();
        libraryManager.addDocument(book);
        view.getMessengerOK();
    }

    public void addJournal(LibraryView view) {
        Document journal = view.getDetailJournal();
        libraryManager.addDocument(journal);
        view.getMessengerOK();
    }

    public void addNewspapoer(LibraryView view) {
        Document newspaper = view.getDetailNewspaper();
        libraryManager.addDocument(newspaper);
        view.getMessengerOK();
    }

    public void displayDocument(LibraryView view) {
        ArrayList<Document> documentArrayList = libraryManager.getDocumentArrayList();
        if (documentArrayList.isEmpty()){
            view.getmessengerDisplay();
        } else {
            for (Document document : documentArrayList){
                System.out.println(document);
            }
        }
    }

    public void deleteDocument(LibraryView view) {
        String code = view.getCodeDocument();
        libraryManager.deleteDocument(code);
    }

    public void SearchBook(LibraryView view) {

    }

    public void SearchJournal(LibraryView view) {

    }

    public void SearchNewspapoer(LibraryView view) {

    }
}
