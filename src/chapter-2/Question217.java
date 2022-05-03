import java.util.Scanner;

// exercise 2.17
public class Question217 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        int product = num1 * num2 * num3;


       int largest = num1;
       if (num2 >= largest)
                largest = num2;
                
        if (num3 >= largest)
                largest = num3;
                
        int smallest = num1;
        if (num2 <= smallest)
                smallest = num2;
            
        System.out.println("total"+" "+sum);

        System.out.println("average"+" "+ "Number"+ average);

        System.out.println("product"+" "+"is"+" "+ product);

        System.out.println("the largest number is"+" "+largest);
        System.out.println("the smallest number is"+" "+smallest);
    }
}
