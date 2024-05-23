package Lesson13_Search;

import java.util.Scanner;

public class LongIncreaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = sc.nextLine();

        String lisSubsequence = findLis(inputString);
        System.out.println("Chuỗi con tăng dần lớn nhất: " + lisSubsequence);
    }

    private static String findLis(String string) {
        int n = string.length();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (string.charAt(i) > string.charAt(j) && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int maxLength = 0;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (maxLength < lis[i]) {
                maxLength = lis[i];
                maxIndex = i;
            }
        }

        String lisSub = "";
        int k = maxLength - 1;
        for (int i = maxIndex; i >= 0; i--) {
            if (lis[i] == maxLength) {
                lisSub += string.charAt(i);
                k--;
                maxLength--;
            }
        }

        return lisSub;
    }
}
