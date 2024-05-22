package Lesson10_Colection_List.DSA_Stack_Queue.CircularQueue;

public class Main {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue hiện tại:");
        queue.printQueue();

        System.out.println("Lấy phần tử đầu tiên ra khỏi queue: " + queue.dequeue());
        System.out.println("Queue sau khi lấy phần tử đầu tiên:");
        queue.printQueue();

        System.out.println("Xem phần tử đầu tiên trong queue: " + queue.peek());
        System.out.println("Queue sau khi xem phần tử đầu tiên:");
        queue.printQueue();
    }
}

