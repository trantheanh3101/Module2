package MiniTest.PayBook;

public class MainBook {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[3];
        programmingBooks[0] = new ProgrammingBook(1,"python basic",100,"Thế Anh","PYTHON","API");
        programmingBooks[1] = new ProgrammingBook(2,"java basic beginer",70,"Kiều Anh","JAVA","Struts");
        programmingBooks[2] = new ProgrammingBook(3,"OOP in java",150,"John","JAVA","Hibernate");

        FictionBook[] fictionBooks = new FictionBook[3];
        fictionBooks[0] = new FictionBook(4, "The Hunger Games", 20, "Suzanne Collins", "Viễn tưởng 1");
        fictionBooks[1] = new FictionBook(5, "Harry Potter and the Sorcerer's Stone", 50, "J.K. Rowling", "Fantasy");
        fictionBooks[2] = new FictionBook(6, "1984", 300, "George Orwell", "Viễn tưởng 1");

        double totalPriceBook = 0;
        for (Book book : programmingBooks) {
            totalPriceBook += book.getAmount();
        }
        for (Book book : fictionBooks) {
            totalPriceBook += book.getAmount();
        }
        System.out.println("Total money = " + totalPriceBook);


        int countPB = 0;
        for (ProgrammingBook PBook : programmingBooks){
            if (PBook.getLanguage().equals("JAVA"))
                countPB++;
        }
        System.out.println("số sách ProgrammingBook có language là JAVA : " + countPB + " cuốn");

        int countFB = 0;
        int countFBPrice = 0;
        for (FictionBook FBook : fictionBooks){
            if (FBook.getCategory().equals("Viễn tưởng 1"))
                countFB++;
            if (FBook.getPrice()<100)
                countFBPrice ++;
        }
        System.out.println("Số sách Fiction có category là “Viễn tưởng 1” : " + countFB + " cuốn");
        System.out.println("Số sách Fiction có giá < 100 : " + countFBPrice + " cuốn");

    }
}
