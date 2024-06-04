package MVC_Exercise.LibraryManeger.view;

import MVC_Exercise.LibraryManeger.model.Book;
import MVC_Exercise.LibraryManeger.model.Document;
import MVC_Exercise.LibraryManeger.model.Journal;
import MVC_Exercise.LibraryManeger.model.Newspaper;

import java.util.Scanner;

public class LibraryView {
    Scanner sc = new Scanner(System.in);

    public void getMessenger() {
        System.out.println("fill again choise");
    }

    public void getMessengerOK() {
        System.out.println("Thành công ");
    }

    public void getMessengerNG(){
        System.out.println("Thất bai ");
    }

    public int getMenuLibrary() {
        System.out.println("-------------Library Menu---------------");
        System.out.println("1.Add Documment");
        System.out.println("2.Delete Document by code");
        System.out.println("3.Display Document");
        System.out.println("4.Search Document");
        System.out.println("5.Exit programming");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int getMenuDocument() {
        System.out.println("-------------Document Menu---------------");
        System.out.println("1.Book");
        System.out.println("2.Journal");
        System.out.println("3.Newspaper");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public Book getDetailBook() {
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Imprint: ");
        String imprint = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter page: ");
        int page = Integer.parseInt(sc.nextLine());
        return new Book(code,imprint,quantity,author,page);
    }

    public Journal getDetailJournal() {
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Imprint: ");
        String imprint = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter issueNumber: ");
        String issueNumber = sc.nextLine();
        System.out.println("Enter monthOfRelease: ");
        String monthOfRelease = sc.nextLine();
        return new Journal(code,imprint,quantity,issueNumber,monthOfRelease);
    }


    public Newspaper getDetailNewspaper() {
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Imprint: ");
        String imprint = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter releaseDate: ");
        String releaseDate = sc.nextLine();
        return new Newspaper(code,imprint,quantity,releaseDate);
    }

    public void getmessengerDisplay() {
        System.out.println("Libary empty ");
    }

    public String getCodeDocument() {
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        return code;
    }
}
