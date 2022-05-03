import java.util.Scanner;

public class Question215{
    public static void main(String [] args) {
    
        Scanner input  = new Scanner (System.in);
        
        System.out.printf("enter first number: ");
        int integer1 = input.nextInt();
        
        System.out.printf("enter Second number: ");
        int integer2 = input.nextInt();
        
        double squareInteger1 = integer1 * integer1;
        double squareInteger2 = integer2 * integer2;
        double sum = squareInteger1 + squareInteger2;
        double difference = squareInteger1 - squareInteger2;
    
        System.out.printf("Square value of first number: %.2f%n ", squareInteger1);
        System.out.printf("Square value of second number: %.2f%n ", squareInteger2);
        System.out.printf("Sum of the two square: %.2f%n ", sum);
        System.out.printf("difference of the two square: %.2f%n ", difference);
    
    
    }





}
