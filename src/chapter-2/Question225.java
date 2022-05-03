/*write an application that reads an integer and determines and prints whether it 's divisible by 3 or not */

//Answer
import java.util.Scanner;

public class Question224{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("enter and integer\n");
        int integer = input.nextInt();
        
     
        if (integer % 3 == 0)
        
            System.out.printf("%d is divisiable by 3\n", integer);
            
        if (integer % 3 != 0)
    
            System.out.printf("%dis not divisiable by 3\n", integer);
    
    
    
    }


}
