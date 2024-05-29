package lesson16_IO_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindValueMaxInFile {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFile readfileEx = new ReadFile();
        readfileEx.readFileText(path);
    }
}

class ReadFile {
    public ArrayList<Integer> readFileText(String filePath) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và input vao List
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                try {
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    System.err.println("Dòng không phải là số nguyên: " + line);
                }
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại!");
        } catch (IOException e) {
            System.err.println("Có lỗi xảy ra khi đọc file!");
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return numbers;
    }
}
