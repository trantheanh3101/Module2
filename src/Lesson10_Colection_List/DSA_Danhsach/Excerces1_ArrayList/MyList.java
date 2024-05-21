package Lesson10_Colection_List.DSA_Danhsach.Excerces1_ArrayList;

public class MyList<E> {

    // Kích thước của danh sách
    private int size;

    // Sức chứa mặc định của danh sách
    private static final int DEFAULT_CAPACITY = 10;

    // Mảng lưu trữ các phần tử của danh sách
    private Object[] elements;

    // Khởi tạo danh sách rỗng với sức chứa mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Khởi tạo danh sách với sức chứa ban đầu được chỉ định
    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Sức chứa không thể âm");
        }
        elements = new Object[capacity];
    }

    // Thêm phần tử vào cuối danh sách
    public void add(E element) {
        ensureCapacity(size + 1);
        elements[size] = element;
        size++;
    }

    // Thêm phần tử vào vị trí được chỉ định trong danh sách
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Vị trí không hợp lệ");
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    // Xóa phần tử tại vị trí được chỉ định trong danh sách
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Vị trí không hợp lệ");
        }
        E removedElement = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removedElement;
    }

    // Lấy kích thước của danh sách
    public int size() {
        return size;
    }

    // Tạo bản sao của danh sách
    @SuppressWarnings("unchecked")
    public MyList<E> clone() {
        MyList<E> newList = new MyList<>(size);
        System.arraycopy(elements, 0, newList.elements, 0, size);
        newList.size = size;
        return newList;
    }

    // Kiểm tra xem danh sách có chứa phần tử được chỉ định hay không
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    // Tìm kiếm vị trí đầu tiên của phần tử được chỉ định trong danh sách
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    // Đảm bảo sức chứa của danh sách đủ lớn để chứa thêm phần tử mới
    private void ensureCapacity(int minCapacity) {
        if (elements.length < minCapacity) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    // Lấy phần tử tại vị trí được chỉ định trong danh sách
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Vị trí không hợp lệ");
        }
        return (E) elements[index];
    }

    // Xóa tất cả các phần tử trong danh sách
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
