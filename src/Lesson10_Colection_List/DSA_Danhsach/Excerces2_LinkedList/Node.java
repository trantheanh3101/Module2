package Lesson10_Colection_List.DSA_Danhsach.Excerces2_LinkedList;

// Định nghĩa một lớp chung (generic) Node với tham số kiểu E
public class Node<E> {

    // Trường data lưu trữ dữ liệu của nút, kiểu E là kiểu dữ liệu chung
    E data;

    // Trường next là tham chiếu đến nút kế tiếp trong danh sách liên kết
    Node<E> next;

    // Constructor của lớp Node, nhận vào dữ liệu kiểu E
    public Node(E data) {
        // Gán giá trị dữ liệu cho trường data
        this.data = data;
        // Khởi tạo trường next với giá trị null, ban đầu chưa liên kết đến nút nào
        this.next = null;
    }

    // Phương thức getData trả về dữ liệu được lưu trữ trong nút
    public E getData() {
        return data;
    }
}


