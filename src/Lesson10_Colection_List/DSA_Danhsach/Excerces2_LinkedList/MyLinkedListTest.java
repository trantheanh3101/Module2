package Lesson10_Colection_List.DSA_Danhsach.Excerces2_LinkedList;

import static org.junit.jupiter.api.Assertions.*;

// Định nghĩa lớp MyLinkedListTest để kiểm tra hoạt động của MyLinkedList
public class MyLinkedListTest {

    // Phương thức main là điểm bắt đầu của chương trình
    public static void main(String[] args) {

        // Tạo một đối tượng MyLinkedList lưu trữ các phần tử kiểu Integer
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add(1); // Thêm 1 vào cuối danh sách
        list.add(2); // Thêm 2 vào cuối danh sách
        list.add(3); // Thêm 3 vào cuối danh sách
        list.add(1, 4); // Thêm 4 vào vị trí chỉ số 1

        // In ra các phần tử trong danh sách
        System.out.println("Elements in list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // In ra từng phần tử theo chỉ số
        }

        // In ra kích thước của danh sách
        System.out.println("\nSize of list: " + list.size());

        // Loại bỏ phần tử tại vị trí chỉ số 2
        list.remove(2);
        System.out.println("After removing element at index 2: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // In ra các phần tử sau khi loại bỏ
        }

        // In ra kích thước của danh sách sau khi loại bỏ
        System.out.println("\nSize of list: " + list.size());

        // Kiểm tra danh sách có chứa phần tử 2 hay không
        System.out.println("List contains 2: " + list.contains(2));
        // In ra chỉ số của phần tử 2 trong danh sách
        System.out.println("Index of element 2: " + list.indexOf(2));

        // Xóa toàn bộ các phần tử trong danh sách
        list.clear();
        // In ra kích thước của danh sách sau khi xóa
        System.out.println("After clearing, size of list: " + list.size());
    }
}

