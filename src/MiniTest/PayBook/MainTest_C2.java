package MiniTest.PayBook;

public class MainTest_C2 {
    public static void main(String[] args) {
        Book[] Books = new Book[6];
        Books[0] = new ProgrammingBook(1,"python basic",100,"Thế Anh","PYTHON","API");
        Books[1] = new ProgrammingBook(2,"java basic beginer",70,"Kiều Anh","JAVA","Struts");
        Books[2] = new ProgrammingBook(3,"OOP in java",150,"John","JAVA","Hibernate");
        Books[3] = new FictionBook(4, "The Hunger Games", 20, "Suzanne Collins", "Viễn tưởng 1");
        Books[4] = new FictionBook(5, "Harry Potter and the Sorcerer's Stone", 50, "J.K. Rowling", "Fantasy");
        Books[5] = new FictionBook(6, "1984", 300, "George Orwell", "Viễn tưởng 1");

        double totalPriceBook = 0;
        int countPB = 0;
        int countFB = 0;
        int countFBPrice = 0;
        for (Book book : Books) {
            if (book instanceof ProgrammingBook){
                totalPriceBook += book.getAmount();
                if(((ProgrammingBook) book).getLanguage().equals("JAVA"))
                    countPB++;
                }
            if (book instanceof FictionBook) {
                totalPriceBook += book.getAmount();
                if (((FictionBook) book).getCategory().equals("Viễn tưởng 1"))
                    countFB++;
                if (book.getPrice()<100)
                    countFBPrice ++;
            }
        }
        System.out.println("Total money = " + totalPriceBook);
        System.out.println("số sách ProgrammingBook có language là JAVA : " + countPB + " cuốn");
        System.out.println("Số sách Fiction có category là “Viễn tưởng 1” : " + countFB + " cuốn");
        System.out.println("Số sách Fiction có giá < 100 : " + countFBPrice + " cuốn");
        System.out.println("Số sách Fiction có category là “Viễn tưởng 1” : " + countFB + " cuốn");
    }
}
