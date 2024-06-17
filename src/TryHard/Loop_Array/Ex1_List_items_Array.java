package TryHard.Loop_Array;

// Đề bài: Viết chương trình Java nhập một mảng số nguyên a0, a1, a2, …, an-1.
// Liệt kê các phần tử xuất hiện trong mảng đúng 1 lần.


import java.util.*;

public class Ex1_List_items_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Array[%d] = ",i);
            array[i] = sc.nextInt();
        }

        System.out.println("array Increace: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//        }
//        for (int i : array) {
//            System.out.println(array[i] + " ");
//        }
        Arrays.stream(array).forEach(System.out::print);



        HashMap<Integer,Integer> hashMap = demItem(array);
        System.out.print("\nkey vs value : ");
        System.out.println(hashMap);

        System.out.println("Các phần tử xuất hiện đúng 1 lần: ");
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if (entry.getValue() == 1 )
                System.out.print(entry.getKey() + " ");
        }

        hashMap.entrySet().forEach(integerIntegerEntry -> {
            if (integerIntegerEntry.getValue() == 1) {
                System.out.print(integerIntegerEntry.getKey() + " ");
            }
        });
    }

    public static HashMap<Integer,Integer> demItem(int[] array){
        HashMap<Integer,Integer> countElement = new HashMap<>();
        int count;
        for (int element : array){
            if (countElement.containsKey(element)){
                count = countElement.get(element);
                countElement.put(element,count + 1);
            } else {
                countElement.put(element,1);
            }
        }
        return countElement;
    }
}
