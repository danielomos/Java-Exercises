package chapter_3;

import java.util.Scanner;

public class RemoveDuplicatedCodeTest {
    public static void main (String []args){
        RemoveDuplicatedCode account1 = new RemoveDuplicatedCode("jane green", 50.00);
        RemoveDuplicatedCode account2 = new RemoveDuplicatedCode("John Blue", -7.53);

        account1.displayAccount();
        account2.displayAccount();

        Scanner input = new Scanner (System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        account1.displayAccount();
        account2.displayAccount();

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        account1.displayAccount();
        account2.displayAccount();




    }
}
