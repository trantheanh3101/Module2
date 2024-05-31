package lesson16_IO_File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadExample {

    public static void main(String[] args) {
        InputStream inputstream = null;
        try {
            // Tạo InputStream để đọc từ tệp tin
            inputstream = new FileInputStream("C:\\Users\\admin\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\data1.txt");

            // Mảng byte để lưu trữ dữ liệu đọc được
            byte[] data = new byte[1024];
            int bytesRead = inputstream.read(data);

            // Đọc dữ liệu từ tệp tin cho đến khi kết thúc tệp (bytesRead == -1)
            while (bytesRead != -1) {
                // Gọi phương thức xử lý dữ liệu đọc được
                doSomethingWithData(data, bytesRead);
                bytesRead = inputstream.read(data);
            }
        } catch (IOException e) {
            // Xử lý ngoại lệ nếu có lỗi xảy ra khi đọc tệp
            e.printStackTrace();
        } finally {
            if (inputstream != null) {
                try {
                    // Đóng luồng sau khi đã đọc xong dữ liệu
                    inputstream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Phương thức xử lý dữ liệu đọc được từ tệp
    private static void doSomethingWithData(byte[] data, int bytesRead) {
        // Giả sử chỉ in dữ liệu đọc được dưới dạng chuỗi
        String str = new String(data, 0, bytesRead);
        System.out.println(str);
    }
}
