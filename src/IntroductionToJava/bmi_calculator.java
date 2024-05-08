package IntroductionToJava;

import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {
        float bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("fill weight");
        float weight = sc.nextFloat();

        System.out.println("fill height");
        float height = sc.nextFloat();

        bmi = weight / (height * height);

        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi <= 25.0){
            System.out.println("Normal");
        } else if (bmi <= 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
