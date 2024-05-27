package TryHard.JavaBasic;

// Đề bài: Viết chương trình tìm các số thuận nghịch có sáu chữ số từ 100000 đến 999999.
// Một số được gọi là số thuận nghịch nếu nó bằng số đảo ngược,
// tức là ta đọc từ trái sang phải hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau.
// Ví dụ 123321 là một số thuận nghịch.

import java.util.ArrayList;
import java.util.List;

public class Ex3_Sothuannghich {
    public static final int DEC10 = 10;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i < 100000; i++) {
            if (isThuanNghich(i)){
                System.out.println(i);
                count ++ ;
            }
        }
        System.out.println("so luong so thuan nghich : " + count);
    }

    private static boolean isThuanNghich(int n) {

        // cach 1
//        List<Integer> listItem = new ArrayList<>();
//
//        for (int i = 0; n > 0 ; i++) {
//            listItem.add(n % DEC10);
//            n = n / DEC10;
//        }
//
//        for (int i = 0; i < listItem.size()/2; i++) {
//            if (listItem.get(i) != listItem.get(listItem.size() - i - 1 ))
//                return false;
//        }
//        return true;

        // cach 2:
        String stringNumber = String.valueOf(n);
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length()-1- i))
                return false;
        }
        return true;
    }
}
