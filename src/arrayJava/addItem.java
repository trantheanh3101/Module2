package arrayJava;

import java.util.Scanner;
import java.util.Arrays;

public class addItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập số cần chèn (X): ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhập vào vị trí index cần chèn X vào trong mảng: ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra vị trí index có hợp lệ hay không
        if (index < 0 || index >= array.length) {
            System.out.println("Không thể chèn phần tử vào mảng với vị trí index này.");
        } else {

            // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
            // Dịch phần tử sang phải để tạo chỗ trống cho X


            for (int i = N-1; i > index; i--) {
                array[i] = array[i - 1];
            }
            // Chèn X vào vị trí index
            array[index] = X;

            // Bước 6: In ra mảng
            System.out.println("Mảng sau khi chèn:");
            System.out.println(Arrays.toString(array));
        }
        scanner.close();

    }
}

