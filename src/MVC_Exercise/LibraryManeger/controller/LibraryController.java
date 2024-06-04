package MVC_Exercise.LibraryManeger.controller;

import MVC_Exercise.LibraryManeger.serveces.LibraryServeces;
import MVC_Exercise.LibraryManeger.view.LibraryView;

public class LibraryController {
    private LibraryView view;
    private LibraryServeces libraryServeces;

    public LibraryController(LibraryView view) {
        this.view = view;
        this.libraryServeces = new LibraryServeces();
    }


    public void run() {
        boolean exit = false;
        while (!exit){
            int choise = view.getMenuLibrary();
            switch (choise){
                case 1:
                    int options = view.getMenuDocument();
                    switch (options){
                        case 1:
                            libraryServeces.addBook(view);
                            break;
                        case 2:
                            libraryServeces.addJournal(view);
                            break;
                        case 3:
                            libraryServeces.addNewspapoer(view);
                            break;
                        default:
                            view.getMessenger();
                            break;
                    }
                    break;
                case 2:
                    libraryServeces.deleteDocument(view);
                    break;
                case 3:
                    libraryServeces.displayDocument(view);
                    break;
                case 4:
                    int option = view.getMenuDocument();
                    switch (option) {
                        case 1:
                            libraryServeces.SearchBook(view);
                            break;
                        case 2:
                            libraryServeces.SearchJournal(view);
                            break;
                        case 3:
                            libraryServeces.SearchNewspapoer(view);
                            break;
                        default:
                            view.getMessenger();
                            break;
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    view.getMessenger();
                    break;
            }
        }
    }
}
