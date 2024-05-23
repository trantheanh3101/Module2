package Lesson10_Colection_List.DSA_Stack_Queue.QueueList;

class Node { // Lớp Node để tạo phần tử cho danh sách liên kết
    int key; // Giá trị của phần tử
    Node next; // Con trỏ đến phần tử tiếp theo trong danh sách

    public Node(int key) { // Constructor để khởi tạo Node với giá trị key
        this.key = key; // Gán giá trị key cho trường key
        this.next = null; // Ban đầu con trỏ next là null
    }
}
