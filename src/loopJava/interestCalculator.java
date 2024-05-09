package loopJava;

import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("fill money: ");
        double money = scanner.nextDouble();

        System.out.println("fill month: ");
        int month = scanner.nextInt();

        System.out.println("fill rate: ");
        double rate = scanner.nextDouble();

        System.out.println("Total money received : " + calculator(money,month,rate) );
        System.out.printf("Total money received : %.2f " , calculator(money,month,rate) );
    }

    public static double calculator(double money,int month, double rate){
        double totalMoney = money;
        for (int i = 0; i < month ; i++) {
            totalMoney += totalMoney * (rate/12);
        }
        return totalMoney;
    }
}
