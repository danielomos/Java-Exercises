package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthBeginBalance = 0;
        int totalItemsForMonth = 0;
        int creditAppliedForMonth = 0;
        int allowCreditLimit = 0;


        System.out.println("Welcome ");
        System.out.println("Enter your Account number");
        int accountNum = input.nextInt();
        System.out.println("Enter initial balance for the month ");
        monthBeginBalance = input.nextInt();
        System.out.println("Enter Total item bought This Month");
        totalItemsForMonth = input.nextInt();
        System.out.println("Enter Credit limit for customer");
        allowCreditLimit = input.nextInt();
        int bal = monthBeginBalance + totalItemsForMonth - allowCreditLimit;
       // int remainningCreditLimit = monthBeginBalance + totalItemsForMonth - allowCreditLimit;

        if (bal < allowCreditLimit) {
            System.out.println("for account: " + accountNum + "You have exceeded your Credit limit");

        }else {
            System.out.println("you still have balance");
        }

    }
}
