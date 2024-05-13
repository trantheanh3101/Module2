package OOP.StopWatch;

import java.util.Arrays;
import java.util.Random;

public class StopWatchMain {
    public static void main(String[] args) {
        // Khởi tạo mảng với n số ngẫu nhiên
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        // Tạo một đối tượng StopWatch để đo thời gian thực thi
        StopWatch stopWatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopWatch.start();

        // Thực thi thuật toán sắp xếp chọn
        selectionSort(arr);

        // Dừng đo thời gian
        stopWatch.stop();


        // In ra thời gian thực thi
        System.out.println("Elapsed time for selection sort: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    // Phương thức sắp xếp chọn
    public static void selectionSort(int[] arr) {
        Arrays.sort(arr);

        // cụ thể của phuowng pháp Sort() trong Arrays

//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
    }
}
