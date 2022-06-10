package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("prompt");
        double item = 0;
        double totalSales = 0;
        int itemCount =0;
        double totalCommission =0;

        System.out.println("Enter item prices or -1 to quit");
        item = input.nextDouble();
        while (item != -1){
            totalSales += item;
            itemCount = itemCount + 1;
            System.out.println("Enter item prices or -1 to quit");
            item = input.nextDouble();

        }
        totalCommission = 200 + totalSales * 9/100;
       // System.out.println("Sales person total sales is;" + totalSales+ "therefore commission due is: "+ totalCommission);
        System.out.printf("you sold %d items, total sales is %.2f, therefore commission due is: %.2f",itemCount,totalSales,totalCommission);
    }
}
