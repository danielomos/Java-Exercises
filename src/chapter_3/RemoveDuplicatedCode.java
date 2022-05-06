package chapter_3;

public class RemoveDuplicatedCode {
    private String name;
    private double balance;

public RemoveDuplicatedCode(String name, double balance){
    this. name = name;

    if (balance > 0.0){
        this.balance =balance;
    }
}
public void deposit(double depositAmount) {
    if (depositAmount > 0.0) {
        balance = balance + depositAmount;
    }

}

public double getBalance(){
     return balance;
    }

    public void setName (String name){
        this.name = name;
    }


    public String getName () {
        return name;
    }

    public void displayAccount () {
        System.out.printf("your Account name is %s, Account Balance %.2f%n", name, balance);

    }
}