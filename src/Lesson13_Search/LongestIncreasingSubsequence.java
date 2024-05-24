package Lesson13_Search;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    // Hàm tìm chuỗi con tăng dần dài nhất
    public static List<Character> findLongestIncreasingSubsequence(String str) {
        int n = str.length(); // Lấy độ dài của chuỗi đầu vào
        int[] lengths = new int[n]; // Mảng lưu độ dài của chuỗi con tăng dần kết thúc tại mỗi vị trí
        int[] previous = new int[n]; // Mảng lưu vị trí của phần tử trước đó trong chuỗi con tăng dần

        // Khởi tạo độ dài tối đa cho mỗi vị trí là 1 và previous là -1 (không có phần tử trước)
        for (int i = 0; i < n; i++) {
            lengths[i] = 1; // Mỗi phần tử đơn lẻ là một chuỗi con tăng dần có độ dài 1
            previous[i] = -1; // Không có phần tử trước đó
        }

        // Tính toán độ dài chuỗi con tăng dần cho tất cả các vị trí
        for (int i = 1; i < n; i++) { // Duyệt qua từng phần tử từ vị trí thứ 2 đến cuối
            for (int j = 0; j < i; j++) { // Duyệt qua các phần tử trước đó
                // Nếu phần tử hiện tại lớn hơn phần tử trước đó và độ dài mới lớn hơn độ dài hiện tại
                if (str.charAt(i) > str.charAt(j) && lengths[i] < lengths[j] + 1) {
                    lengths[i] = lengths[j] + 1; // Cập nhật độ dài chuỗi con tăng dần
                    previous[i] = j; // Lưu vị trí phần tử trước đó
                }
            }
        }

        // Tìm vị trí kết thúc của chuỗi con tăng dần có độ dài lớn nhất
        int maxLength = 1; // Biến lưu độ dài lớn nhất của chuỗi con tăng dần
        int maxIndex = 0; // Biến lưu vị trí kết thúc của chuỗi con tăng dần có độ dài lớn nhất
        for (int i = 0; i < n; i++) { // Duyệt qua tất cả các vị trí
            if (lengths[i] > maxLength) { // Nếu tìm thấy độ dài lớn hơn
                maxLength = lengths[i]; // Cập nhật độ dài lớn nhất
                maxIndex = i; // Cập nhật vị trí kết thúc của chuỗi con tăng dần
            }
        }

        // Truy xuất chuỗi con tăng dần có độ dài lớn nhất
        List<Character> lis = new ArrayList<>(); // Danh sách lưu chuỗi con tăng dần
        int index = maxIndex; // Bắt đầu từ vị trí kết thúc của chuỗi con tăng dần lớn nhất
        while (index != -1) { // Tiếp tục cho đến khi không còn phần tử trước đó
            lis.add(0, str.charAt(index)); // Thêm phần tử vào đầu danh sách
            index = previous[index]; // Chuyển đến phần tử trước đó trong chuỗi con
        }

        return lis; // Trả về chuỗi con tăng dần có độ dài lớn nhất
    }

    public static void main(String[] args) {
        String str = "ABCDEFGH"; // Chuỗi đầu vào để tìm chuỗi con tăng dần dài nhất
        List<Character> lis = findLongestIncreasingSubsequence(str); // Gọi hàm tìm chuỗi con tăng dần lớn nhất

        System.out.println("Chuỗi con tăng dần có độ dài lớn nhất:"); // In thông báo
        for (char c : lis) { // Duyệt qua từng phần tử trong chuỗi con tăng dần
            System.out.print(c); // In từng ký tự của chuỗi con tăng dần
        }
    }
}
