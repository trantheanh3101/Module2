package Lesson10_Colection_List.DSA_Danhsach;

import java.util.Objects;

public class MyClass {
    private int id;
    private String name;
    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return id == myClass.id && name.equals(myClass.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Alice");
        MyClass obj2 = new MyClass(1, "Alice");
        MyClass obj3 = new MyClass(2, "Bob");
        System.out.println(obj1.hashCode()); // Sẽ in ra một giá trị băm  =63351360
        System.out.println(obj2.hashCode()); // Sẽ in ra giá trị băm giống như obj1 = 63351360
        System.out.println(obj3.hashCode()); // Sẽ in ra một giá trị băm khác  = 67988
    }
}

