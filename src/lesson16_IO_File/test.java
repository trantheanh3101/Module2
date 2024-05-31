package lesson16_IO_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\admin\\Desktop\\" +
                "TheanhCode\\Module2\\src\\lesson16_IO_File\\data.txt");

        // Tạo BufferedReader để đọc dữ liệu theo từng dòng
        BufferedReader br = new BufferedReader(reader);

        // Đọc từng dòng trong tập tin
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        reader.close();
    }
}
