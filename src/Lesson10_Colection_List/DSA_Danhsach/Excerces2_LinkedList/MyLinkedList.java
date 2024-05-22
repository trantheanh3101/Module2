package Lesson10_Colection_List.DSA_Danhsach.Excerces2_LinkedList;

import java.util.ArrayList;

// Định nghĩa một lớp chung (generic) MyLinkedList với tham số kiểu E
public class MyLinkedList<E> {

    // Trường head là tham chiếu đến nút đầu tiên trong danh sách liên kết
    private Node<E> head;

    // Trường numNodes lưu trữ số lượng các nút trong danh sách
    private int numNodes;

    // Constructor của lớp MyLinkedList, khởi tạo danh sách rỗng
    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    // Phương thức addFirst thêm một phần tử vào đầu danh sách
    public void addFirst(E e) {
        // Tạo một nút mới với dữ liệu e
        Node<E> newNode = new Node<>(e);
        // Liên kết nút mới với nút đầu tiên hiện tại
        newNode.next = head;
        // Cập nhật head để nút mới trở thành nút đầu tiên
        head = newNode;
        // Tăng số lượng nút trong danh sách
        numNodes++;
    }

    // Phương thức addLast thêm một phần tử vào cuối danh sách
    public void addLast(E e) {
        // Tạo một nút mới với dữ liệu e
        Node<E> newNode = new Node<>(e);
        // Nếu danh sách rỗng, nút mới trở thành nút đầu tiên
        if (head == null) {
            head = newNode;
        } else {
            // Tìm nút cuối cùng và liên kết nút mới vào cuối danh sách
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        // Tăng số lượng nút trong danh sách
        numNodes++;
    }

    // Phương thức add thêm một phần tử tại vị trí chỉ định
    public void add(int index, E element) {
        // Kiểm tra chỉ số hợp lệ
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        // Nếu thêm vào đầu danh sách, gọi phương thức addFirst
        if (index == 0) {
            addFirst(element);
        } else {
            // Tìm vị trí để chèn phần tử mới
            Node<E> temp = head;
            Node<E> holder;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            // Chèn nút mới vào vị trí chỉ định
            holder = temp.next;
            temp.next = new Node<>(element);
            temp.next.next = holder;
            // Tăng số lượng nút trong danh sách
            numNodes++;
        }
    }

    // Phương thức add thêm một phần tử vào cuối danh sách và luôn trả về true
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    // Phương thức remove loại bỏ phần tử tại vị trí chỉ định và trả về dữ liệu của phần tử bị loại bỏ
    public E remove(int index) {
        // Kiểm tra chỉ số hợp lệ
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        // Nếu loại bỏ phần tử đầu tiên
        if (index == 0) {
            head = head.next;
            numNodes--;
            return temp.getData();
        }
        // Tìm nút trước nút cần loại bỏ
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        // Loại bỏ nút và cập nhật liên kết
        Node<E> removedNode = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return removedNode.getData();
    }

    // Phương thức remove loại bỏ phần tử đầu tiên có giá trị bằng e và trả về true nếu thành công
    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }
        // Nếu nút đầu tiên có giá trị bằng e
        if (head.getData().equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        // Tìm và loại bỏ nút có giá trị bằng e
        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.next.getData().equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Phương thức size trả về số lượng nút trong danh sách
    public int size() {
        return numNodes;
    }

    // Phương thức clone tạo một bản sao của danh sách hiện tại
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node<E> temp = head;
        // Sao chép từng nút sang danh sách mới
        while (temp != null) {
            clonedList.addLast(temp.getData());
            temp = temp.next;
        }
        return clonedList;
    }

    // Phương thức contains kiểm tra xem danh sách có chứa phần tử o hay không
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    // Phương thức indexOf trả về chỉ số của phần tử o trong danh sách, hoặc -1 nếu không tìm thấy
    public int indexOf(E o) {
        Node<E> temp = head;
        int index = 0;
        // Duyệt qua các nút để tìm phần tử o
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Phương thức get trả về dữ liệu của nút tại vị trí i
    public E get(int i) {
        // Kiểm tra chỉ số hợp lệ
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        // Duyệt tới nút tại vị trí i
        for (int index = 0; index < i; index++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    // Phương thức getFirst trả về dữ liệu của nút đầu tiên
    public E getFirst() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    // Phương thức getLast trả về dữ liệu của nút cuối cùng
    public E getLast() {
        if (head == null) {
            return null;
        }
        Node<E> temp = head;
        // Duyệt tới nút cuối cùng
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    // Phương thức clear xóa toàn bộ danh sách
    public void clear() {
        head = null;
        numNodes = 0;
    }

    // Phương thức ensureCapacity không cần thiết cho danh sách liên kết, nhưng được thêm vào để giữ cấu trúc
    public void ensureCapacity(int minCapacity) {
        // Không cần triển khai cho danh sách liên kết
    }
}


