package Lesson10_Colection_List.DSA_Danhsach.Excerces2_LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);
        System.out.println("Elements in list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nSize of list: " + list.size());

        list.remove(2);
        System.out.println("After removing element at index 2: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nSize of list: " + list.size());

        System.out.println("List contains 2: " + list.contains(2));
        System.out.println("Index of element 2: " + list.indexOf(2));

        list.clear();
        System.out.println("After clearing, size of list: " + list.size());
    }
}
