package Lesson10_Colection_List.DSA_Danhsach.Excerces1_ArrayList;

public class MyListTest {

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        // Thêm các phần tử vào danh sách
        list.add("Java");
        list.add("C++");
        list.add("Python");

        // In kích thước của danh sách
        System.out.println("Kích thước danh sách: " + list.size());

        // Lấy phần tử tại vị trí 1
        String element = list.get(1);
        System.out.println("Phần tử tại vị trí 1: " + element);

        // Kiểm tra danh sách có chứa phần tử "Python" hay không
        boolean containsPython = list.contains("Python");
        System.out.println("Danh sách có chứa phần tử \"Python\"? " + containsPython);

        // Xóa phần tử đầu tiên của danh sách
        list.remove(0);

        // In danh sách sau khi xóa
//        System.out.println("Danh sách sau khi xóa:");
//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}
