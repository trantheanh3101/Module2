package lesson16_IO_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Theanh36\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\csvFile.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {  /// try-with-resources
            while ((line = br.readLine()) != null) {
                // Sử dụng dấu phẩy làm dấu phân cách
                String[] country = line.split(csvSplitBy);

                // In ra các thuộc tính của quốc gia
                System.out.println("ID: " + country[0] +
                        ", Code: " + country[1] +
                        ", Name: " + country[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
