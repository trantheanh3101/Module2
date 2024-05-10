package array_method_Java;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {

        int[] sourceArray = {2, 3, 1, 5, 10};
        System.out.println("sourceArray: " + Arrays.toString(sourceArray));

        // cachs 1:

        int[] targetArray1 = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray1[i] = sourceArray[i];
        }

        System.out.println("targetArray1: " + Arrays.toString(targetArray1));

        // cach 2: Cú pháp cho arraycopy là: arraycopy(sourceArray, srcPos, targetArray, tarPos, length);
        // Các tham số srcPos và tarPos chỉ ra các vị trí bắt đầu trong sourceArray và targetArray

        int[] targetArray2 = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, targetArray2, 0, sourceArray.length);

        System.out.println("targetArray2: " + Arrays.toString(targetArray2));


        int[] copy = new int[sourceArray.length];
        copy = sourceArray; // now : bây giờ 2 mảng đã cùng chỏ tới 1 vùng nhớ
                            //       => khi 1 mảng thay đổi mảng còn lại thay đổi theo
        copy[0] = 5; copy[1] = 15;
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(sourceArray));

        sourceArray[0]= 150; sourceArray[1] = 200;
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(sourceArray));
    }
}
