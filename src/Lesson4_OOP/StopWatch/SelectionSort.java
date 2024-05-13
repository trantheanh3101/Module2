package Lesson4_OOP.StopWatch;
    // selection sort là một thuật toán sắp xếp đơn giản
    // hoạt động bằng cách lặp lại việc tìm phần tử nhỏ nhất
    // từ phần chưa được sắp xếp của mảng và đặt nó ở đầu.

    public class SelectionSort {
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap arr[i] and arr[minIndex]
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            selectionSort(arr);
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
