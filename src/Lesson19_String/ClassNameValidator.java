package Lesson19_String;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ClassNameValidator {

    public static boolean isValidClassName(String className) {
        // Định nghĩa mẫu regex cho tên lớp học hợp lệ
        String regex = "^[CAP]\\d{4}[GHIK]$";
        // Tạo một pattern từ regex
        Pattern pattern = Pattern.compile(regex);
        // Tạo matcher từ chuỗi đầu vào
        Matcher matcher = pattern.matcher(className);
        // Kiểm tra và trả về kết quả
        return matcher.matches();
    }

    public static void main(String[] args) {

        String[] validClassNames = {"C0223G", "A0323K"};
        String[] invalidClassNames = {"M0318G", "P0323A", "A12345K", "C02G3H"};

        for (String className : validClassNames) {
            System.out.println("Tên lớp " + className + " hợp lệ: " + isValidClassName(className));
        }

        for (String className : invalidClassNames) {
            System.out.println("Tên lớp " + className + " hợp lệ: " + isValidClassName(className));
        }
    }
}

