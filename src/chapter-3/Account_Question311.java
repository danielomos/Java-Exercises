import  java.util.Scanner;
public class Account_Question311{
    private double balance;
    public Account_Question311(double balance ){
        if(balance > 0.0) {
            this.balance = balance;
        }

    }
    public void makeDeposit(double depositAmount){
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public void withdraw(double withdrawAmount){
        if (withdrawAmount < balance){
            System.out.printf("your Account balance is %.2f%n",balance -= withdrawAmount);

        }
        if (withdrawAmount > balance){
            System.out.println("no Suffient amount to withdraw");
        }
    }

    public double getbalance(){
        return balance;
    }



    public static void main (String[]args){

        Account_Question311 account1 = new Account_Question311(0.0);
        System.out.printf(" current account banlace is %.2f%n",account1.getbalance());

        Scanner input = new Scanner(System.in);
        System.out.println ("Kindly enter amount to deposit");
        double amountToDeposit = input.nextDouble();
        System.out.printf("adding %.2f to account1 %n", amountToDeposit);
        account1.makeDeposit(amountToDeposit);

        System.out.printf("your Account1 Balance now is %n%.2f%n",account1.getbalance());
        if(account1.getbalance() > 0.0) System.out.printf("Account1 Balance is %.2f you can make withdraw now from this account%n", account1.getbalance());
        if(account1.getbalance() == 0.0) System.out.printf("Account1 Balance is %.2f you don't have suffceient Balance %n", account1.getbalance());

        System.out.printf("Kindly enter amount to withdraw%n");
        double amountToWithdraw = input.nextDouble();
        account1.withdraw(amountToWithdraw);



    }

}