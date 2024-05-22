package Lesson10_Colection_List.DSA_Stack_Queue.CircularQueue;

public class CircularQueue {
    private Node head;
    private Node tail;

    public CircularQueue() {
        this.head = null;
        this.tail = null;
    }

    // Kiểm tra xem queue có rỗng hay không
    public boolean isEmpty() {
        return head == null;
    }

    // Thêm phần tử vào cuối queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    // Lấy phần tử đầu tiên ra khỏi queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    // Xem phần tử đầu tiên trong queue
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return head.data;
    }

    // In ra danh sách các phần tử trong queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}
