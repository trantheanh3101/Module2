package IntroductionToJava;

public class VariableDataType {
    public static void main(String[] args) {
        int i = 10; // khai báo biến i là kiểu int có giá trị là 10
        float f = 20.5f; // Khai báo biến f có kiểu là float có giá trị là 20.5
        double d = 2.0 ; // Khai báo biến d có kiểu là double có giá trị là 20.5
        double e = 7/3 ; // Khai báo biến d có kiểu là double có giá trị là 20.5
        boolean b = true; // Khai báo biến b là kiểu boolean có giá trị là true
        char c = 'a'; // Khai báo biến c có kiểu là char có giá trị là kí tự a
        String s = "Hà Nội"; //Khai báo biến s có kiểu là String có giá trị là chuỗi Hà Nội

        final float PI = 3.14f;

        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(d == e);
    }
}
