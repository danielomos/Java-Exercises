/*Write an application that asks the user to enter one integer, obtains it from the user and dsplays whether the number and its */
import java.util.Scanner;
public class Question216{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.printf("enter number:");
        int integer = input.nextInt();
        
        double square = integer *integer;
        
        
        if (integer > 100 & square > 100) {
            System.out.print("number and it square is greater than 100");
        }
        
        
    
    
    
    }







}
