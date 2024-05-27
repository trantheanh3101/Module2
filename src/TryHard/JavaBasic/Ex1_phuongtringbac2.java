package TryHard.JavaBasic;

import java.util.Scanner;

public class Ex1_phuongtringbac2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fill a: ");
        double a = sc.nextDouble();
        System.out.println("Fill b: ");
        double b = sc.nextDouble();
        System.out.println("Fill c: ");
        double c = sc.nextDouble();

        giaiphuongtringbac2(a,b,c);
    }

    public static void giaiphuongtringbac2(double a, double b, double c){
        double x1,x2;
        double delta = b * b - 4 * a * c ;
        if (a == 0 ) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem ");
            } else {
                System.out.println("Phuong trinh co nghiem x = " + -c / b);
            }
            return;
        }
        if (delta == 0 ){
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + -b/(2 * a));
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);
            System.out.println("nghiem cua phuong trinh:\n x1 = " + x1 + "\nx2 = " + x2);
        } else {
            System.out.println("Phuong trinh vo nghiem ");
        }
    }
}
