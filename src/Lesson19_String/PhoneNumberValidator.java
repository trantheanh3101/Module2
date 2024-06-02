package Lesson19_String;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {


    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Định nghĩa mẫu regex cho số điện thoại hợp lệ
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        // Tạo một pattern từ regex
        Pattern pattern = Pattern.compile(regex);
        // Tạo matcher từ chuỗi đầu vào
        Matcher matcher = pattern.matcher(phoneNumber);
        // Kiểm tra và trả về kết quả
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Một số ví dụ kiểm tra
        String[] validPhoneNumbers = {"(84)-(0978489648)", "(12)-(0123456789)"};
        String[] invalidPhoneNumbers = {"(a8)-(2222222222)", "(84)-(22b2222222)", "(84)-(9978489648)", "(123)-(0123456789)"};

        // Kiểm tra các số điện thoại hợp lệ
        for (String phoneNumber : validPhoneNumbers) {
            System.out.println("Số điện thoại " + phoneNumber + " hợp lệ: " + isValidPhoneNumber(phoneNumber));
        }

        // Kiểm tra các số điện thoại không hợp lệ
        for (String phoneNumber : invalidPhoneNumbers) {
            System.out.println("Số điện thoại " + phoneNumber + " hợp lệ: " + isValidPhoneNumber(phoneNumber));
        }
    }
}

