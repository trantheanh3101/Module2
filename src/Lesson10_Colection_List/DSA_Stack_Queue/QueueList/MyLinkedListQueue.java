package Lesson10_Colection_List.DSA_Stack_Queue.QueueList;

public class MyLinkedListQueue { // Lớp triển khai hàng đợi sử dụng danh sách liên kết
    private Node head; // Con trỏ đến phần tử đầu tiên của hàng đợi
    private Node tail; // Con trỏ đến phần tử cuối cùng của hàng đợi

    public MyLinkedListQueue() { // Constructor để khởi tạo hàng đợi rỗng
        this.head = null; // Ban đầu head là null
        this.tail = null; // Ban đầu tail là null
    }

    public void enqueue(int key) { // Phương thức thêm phần tử vào hàng đợi
        Node temp = new Node(key); // Tạo một Node mới với giá trị key
        if (this.tail == null) { // Nếu tail là null (hàng đợi rỗng)
            this.head = this.tail = temp; // Cả head và tail đều trỏ đến Node mới
            return; // Kết thúc phương thức
        }
        this.tail.next = temp; // Nếu hàng đợi không rỗng, thêm Node mới vào cuối
        this.tail = temp; // Cập nhật tail để trỏ đến Node mới
    }

    public Node dequeue() { // Phương thức loại bỏ phần tử đầu tiên khỏi hàng đợi
        if (this.head == null) // Nếu head là null (hàng đợi rỗng)
            return null; // Trả về null
        Node temp = this.head; // Lưu lại Node đầu tiên
        this.head = this.head.next; // Cập nhật head để trỏ đến phần tử kế tiếp
        if (this.head == null) // Nếu head trở thành null (hàng đợi rỗng sau khi loại bỏ phần tử)
            this.tail = null; // Cập nhật tail thành null
        return temp; // Trả về phần tử đầu tiên đã lưu
    }

    public static void main(String[] args) { // Phương thức main để chạy chương trình
        MyLinkedListQueue queue = new MyLinkedListQueue(); // Tạo một đối tượng MyLinkedListQueue
        queue.enqueue(10); // Thêm phần tử 10 vào hàng đợi
        queue.enqueue(20); // Thêm phần tử 20 vào hàng đợi
        queue.dequeue(); // Loại bỏ phần tử đầu tiên (10)
        queue.dequeue(); // Loại bỏ phần tử tiếp theo (20)
        queue.enqueue(30); // Thêm phần tử 30 vào hàng đợi
        queue.enqueue(40); // Thêm phần tử 40 vào hàng đợi
        queue.enqueue(50); // Thêm phần tử 50 vào hàng đợi
        System.out.println("Dequeued item is " + queue.dequeue().key); // In ra phần tử đầu tiên bị loại bỏ (30)
    }
}
