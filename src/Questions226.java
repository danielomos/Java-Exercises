import java.util.Scanner;

public class Questions226 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number");

        long total =addSum(input.nextLong());

        System.out.println("result as follow " + total);


    }
    public static long addSum(long num1){
        long sum = 0;

        while(num1>0) {
            sum = sum + num1 % 10;
            num1 = num1 / 10;
        }
        return sum;
    }




}
