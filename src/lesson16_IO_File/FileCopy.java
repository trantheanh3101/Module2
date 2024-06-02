package lesson16_IO_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Đường dẫn đến tệp nguồn và tệp đích
        String sourceFilePath = "C:\\Users\\Theanh36\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\data.txt";
        String targetFilePath = "C:\\Users\\Theanh36\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\data2.txt";

        copyFile(sourceFilePath, targetFilePath);
    }

    public static void copyFile(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra sự tồn tại của tệp nguồn
        if (!sourceFile.exists()) {
            System.out.println("Lỗi: Tệp nguồn '" + sourcePath + "' không tồn tại.");
            return;
        }

        // Kiểm tra xem tệp đích có tồn tại hay không
        if (!targetFile.exists()) {
            System.out.println("Cảnh báo: Tệp đích '" + targetPath + "' đã tồn tại.");
            return;
        }

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(sourceFile);
            writer = new FileWriter(targetFile);

            int charCount = 0;
            int character;

            // Đọc từng ký tự từ tệp nguồn và ghi vào tệp đích
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }

            System.out.println("Đã sao chép " + charCount + " ký tự từ '" + sourcePath + "' đến '" + targetPath + "'.");
        } catch (IOException e) {
            System.out.println("Lỗi trong quá trình sao chép tệp: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Lỗi khi đóng tệp: " + e.getMessage());
            }
        }
    }
}
