package Lesson13_Search;

import java.util.*;

public class Algorithm_Search_dequy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(new Random().nextInt(100));
        }



        System.out.print("Array : " + arrayList);
//        arrayList.forEach(element -> System.out.print(element + " "));  // duyet mang bang lambda

        arrayList.sort((a, b) -> a - b);
        System.out.print("\nArray : " + arrayList);

        System.out.print("Enter the element to be searched: ");
        int value = sc.nextInt();

        int result = binarySearch(arrayList,0,arrayList.size()-1,value);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
    
    public static int binarySearch(ArrayList<Integer> array, int left, int right, int value){
//        while (left <= right) {
//            int middle = left + (right - left)/2;
//            if (array.get(middle) == value)
//                return middle;
//            else if (array.get(middle) < value){
//                left = middle + 1;
//            } else {
//                right = middle - 1;
//            }
//        }
//        return -1;


        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra nếu target ở vị trí giữa
            if (array.get(mid) == value) {
                return mid;
            }

            // Nếu target lớn hơn, tìm kiếm trong nửa phải
            if (array.get(mid) < value) {
                return binarySearch(array, mid + 1, right, value);
            }
            // Nếu target nhỏ hơn, tìm kiếm trong nửa trái
            else {
                return binarySearch(array, left, mid - 1, value);
            }
        }

        // Nếu không tìm thấy phần tử
        return -1;
    }
}
