package Lesson3_Array_method_Java;

import java.util.Arrays;
import java.util.Scanner;

public class deleteItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        // Bước 3: Tìm X xem có xuất hiện trong mảng không và chỉ ra vị trí của X
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            System.out.println("Phần tử " + X + " xuất hiện tại vị trí " + index_del);

            // Bước 4: Xoá phần tử X khỏi mảng >>>>>>>> tại sao array[4] lai ko con
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            System.out.println(Arrays.toString(array));

            // Bước 5: In ra mảng sau khi xoá phần tử
            System.out.println("Mảng sau khi xoá phần tử:");
            for (int i = 0; i < N - 1; i++) {
                System.out.print(array[i] + " ");
            }
            } else {
            System.out.println("Phần tử " + X + " không xuất hiện trong mảng.");
        }

        scanner.close();
    }
}
