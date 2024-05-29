package lesson16_IO_File;

import java.io.File;
import java.io.IOException;


// 1. Tạo mới:
//	• createNewFile(): Tạo một tập tin mới tại đường dẫn được chỉ định.
//	• mkdir(): Tạo một thư mục mới tại đường dẫn được chỉ định.
//2. Kiểm tra sự tồn tại:
//	• exists(): Kiểm tra xem một tập tin hoặc thư mục có tồn tại hay không.
//	• isDirectory(): Kiểm tra xem một đối tượng File có đại diện cho thư mục hay không.
//	• isFile(): Kiểm tra xem một đối tượng File có đại diện cho tập tin hay không.
//3. Thuộc tính tập tin:
//	• length(): Lấy kích thước (độ dài) của tập tin.
//	• getName(): Lấy tên của tập tin hoặc thư mục.
//	• getPath(): Lấy đường dẫn tuyệt đối của tập tin hoặc thư mục.
//	• getParent(): Lấy đường dẫn của thư mục cha chứa tập tin hoặc thư mục.
//4. Thao tác:
//	• renameTo(): Đổi tên tập tin hoặc thư mục.
//	• delete(): Xóa tập tin hoặc thư mục.
//	• setReadOnly(): Đặt thuộc tính chỉ đọc cho tập tin hoặc thư mục.
//	• setWritable(): Đặt thuộc tính cho phép ghi cho tập tin hoặc thư mục.
//5. Duyệt thư mục:
//	• list(): Lấy danh sách các tập tin và thư mục con trong thư mục hiện tại.
//	• listFiles(): Lấy mảng các đối tượng File đại diện cho các tập tin và thư mục con trong thư mục hiện tại.
//6. Xác định loại đối tượng:
//	• isAbsolute(): Kiểm tra xem đường dẫn của tập tin hoặc thư mục có tuyệt đối hay không.
//	• isHidden(): Kiểm tra xem tập tin hoặc thư mục có bị ẩn hay không.

public class Operate_File {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\admin\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\data.txt");
        File file1 = new File("C:\\Users\\admin\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\data1.txt");
        File folder = new File("C:\\Users\\admin\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File");

        if (file1.exists()) {
            System.out.println("Exists");
            System.out.println("File length: " + file1.length() + " bytes");
        } else {
            file1.createNewFile();
            System.out.println("Created!");
        }

        String[] listOfFiles = folder.list();
        if (listOfFiles != null) {
            for (String fileName : listOfFiles) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Folder is empty or does not exist.");
        }

        System.out.println("Path is Folder: " + folder.isDirectory());
        System.out.println("Path is File: " +   file.isFile());
    }
}
