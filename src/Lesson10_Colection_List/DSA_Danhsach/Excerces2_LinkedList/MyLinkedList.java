package Lesson10_Colection_List.DSA_Danhsach.Excerces2_LinkedList;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node<E> temp = head;
            Node<E> holder;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node<>(element);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        if (index == 0) {
            head = head.next;
            numNodes--;
            return temp.getData();
        }
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node<E> removedNode = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return removedNode.getData();
    }

    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }
        if (head.getData().equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
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

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node<E> temp = head;
        while (temp != null) {
            clonedList.addLast(temp.getData());
            temp = temp.next;
        }
        return clonedList;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        for (int index = 0; index < i; index++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public E getFirst() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    public E getLast() {
        if (head == null) {
            return null;
        }
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    // Implementing this method to keep the structure, though it's unnecessary for LinkedList.
    public void ensureCapacity(int minCapacity) {
        // No implementation needed for LinkedList
    }
}

