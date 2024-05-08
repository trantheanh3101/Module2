import java.util.Scanner;

public class next_nextLine {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Nhập tên của bạn: ");
        // String name = scanner.nextLine(); // Đọc toàn bộ dòng chứa tên
         
        // System.out.print("Nhập tuổi của bạn: ");
        // int age = scanner.nextInt(); // Đọc một số nguyên từ đầu tiếp theo
        
        // // Hiển thị thông tin
        // System.out.println("Xin chào, " + name + "! Bạn " + age + " tuổi.");
        
        // scanner.close();




        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.next(); // Sử dụng next() thay vì nextLine() ,
        // nếu string nhâ vào có khoẳng trắng thi chuoi se dung la luon , ko quan tam chuoi con tu nao na ko
        //  ếu chuooivaaxco tu con lai phia sau thi chac chan cau lenh scanner tiep theo phai la next hoac nextLine
        // nhu bai dang scanner int => ko the dc
        // dac biet doan string thua se tu dong in ra theo ma ko quan tam chung ta can nhap j
         
        System.out.print("Nhập tuổi của bạn: ");
//        int age = scanner.nextInt(); // Đọc một số nguyên từ đầu tiên trong dòng
//        String age = scanner.next(); // Đọc một số nguyên từ đầu tiên trong dòng
        String age = scanner.nextLine(); // Đọc một số nguyên từ đầu tiên trong dòng

        
        // Hiển thị thông tin
        System.out.println("Xin chào, " + name + "! Bạn " + age + " tuổi.");
        
        scanner.close();
    }
}
