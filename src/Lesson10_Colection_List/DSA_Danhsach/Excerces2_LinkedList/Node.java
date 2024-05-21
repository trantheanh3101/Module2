package Lesson10_Colection_List.DSA_Danhsach.Excerces2_LinkedList;

public class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return data;
    }
}

