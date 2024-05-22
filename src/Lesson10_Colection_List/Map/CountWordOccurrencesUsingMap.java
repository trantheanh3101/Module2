package Lesson10_Colection_List.Map;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrencesUsingMap {
    public static Map<String, Integer> countWordOccurrencesUsingMap(String text) {
        // Khởi tạo Map rỗng
        Map<String, Integer> wordCounts = new HashMap<>();

        // Xử lý chuỗi thành chữ thường và tách thành các từ
        String[] words = text.toLowerCase().split("\\s+");

        // Duyệt qua từng từ và cập nhật số lần xuất hiện trong Map
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        // Trả về Map lưu trữ số lần xuất hiện của mỗi từ
        return wordCounts;
    }

    public static void main(String[] args) {
        String text = "Xin chào thế giới! Xin chào Việt Nam!";
        Map<String, Integer> wordCounts = countWordOccurrencesUsingMap(text);
        System.out.println(wordCounts);
    }
}
