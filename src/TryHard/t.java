package TryHard;

public class t {
    public static void main(String[] args) {
        int[] arr = {6, 8, 3, 5, 1};
        sortAscending(arr);
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortAscending(int [] arr) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
