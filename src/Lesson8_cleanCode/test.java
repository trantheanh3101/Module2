package Lesson8_cleanCode;

public class test {
    public static void main(String[] args) {

    }
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:  // Tháng 1
            case 3:  // Tháng 3
            case 5:  // Tháng 5
            case 7:  // Tháng 7
            case 8:  // Tháng 8
            case 10: // Tháng 10
            case 12: // Tháng 12
                return 31;
            case 4:  // Tháng 4
            case 6:  // Tháng 6
            case 9:  // Tháng 9
            case 11: // Tháng 11
                return 30;
            case 2:  // Tháng 2
                // Kiểm tra năm nhuận trực tiếp trong switch case
                if (isaBoolean(year)) {
                return 29;
            } else {
                return 28;
            }
            default:
                return 0; // Tháng không hợp lệ
        }
    }

    private static boolean isaBoolean(int year) {
        boolean b = year % 4 == 0;
        boolean b1 = year % 100 != 0;
        boolean b2 = year % 400 == 0;
        return (b && b1) || b2;
    }

}
