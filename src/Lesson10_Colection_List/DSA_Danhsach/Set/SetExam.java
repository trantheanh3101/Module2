package Lesson10_Colection_List.DSA_Danhsach.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
    public static void main(String[] args) {
//        Set<String> setA = new HashSet<String>();
//        Set<String> setB = new HashSet<String>();
//        setB.add("Java");
//        setB.add("Python");
//        setB.add("Java");
//        setB.add("PHP");
//        // Thêm các phần tử setB khác vào setA trong Java
//        setA.addAll(setB);
//
//        System.out.println("Số phần tử của setA: " + setA.size());
//        System.out.println("Các phần tử của setA: " + setA);
//        System.out.println("Các phần tử của setA: " + setB);  // 1 SET KO CHUA ITEM TRUNG LAP
//        System.out.println("setA có chứa Java không? " + setA.contains("Java"));
//        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));

        // Tạo tập HashSet để lưu trữ ID sinh viên
//        HashSet<Integer> studentIds = new HashSet<>();
        TreeSet<Integer> studentIds = new TreeSet<>();


        // Thêm ID sinh viên vào tập
        studentIds.add(1001);
        studentIds.add(1002);
        studentIds.add(1003); // ID trùng lặp sẽ tự động được bỏ qua
        studentIds.add(1003);
        studentIds.add(1003); // ID trùng lặp sẽ tự động được bỏ qua

        // Kiểm tra xem một sinh viên có trong tập hay không
        boolean isStudentExists = studentIds.contains(1004);
        System.out.println("Sinh viên 1004 có trong tập: " + isStudentExists);

        // Duyệt qua các ID sinh viên trong tập
        for (Integer id : studentIds) {
            System.out.println("ID sinh viên: " + id);
        }

        // Tạo tập LinkedHashSet để lưu trữ lịch sử duyệt web
        LinkedHashSet<String> browsingHistory = new LinkedHashSet<>();

        // Thêm các trang đã truy cập vào lịch sử
        browsingHistory.add("https://www.google.com");
        browsingHistory.add("https://www.facebook.com");
        browsingHistory.add("https://www.youtube.com");
        browsingHistory.add("https://www.youtube.com");
        browsingHistory.add("https://www.stackoverflow.com");

        // Duyệt qua lịch sử duyệt web theo thứ tự truy cập
        for (String url : browsingHistory) {
            System.out.println("Trang đã truy cập: " + url);
        }
    }
}