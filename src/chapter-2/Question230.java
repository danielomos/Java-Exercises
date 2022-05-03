/* write an application that input one number consisting of five digits from the user,* separates the umber into its individual digits and prints the digits separated from one another by three spaces each*/

//Answer

import java.util.Scanner;

public class Question230 {
    public static void main(String [] args){
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter a number with five numbers");
    int num = input.nextInt();
    
        if ( (num >= 10000) && (num <= 99999) )	{
        
		System.out.printf("%d   ", (num / 10000));
		System.out.printf("%d   ", (num / 1000) % 10);
		System.out.printf("%d   ", (num / 100) % 10);
		System.out.printf("%d   ", (num % 100) / 10);
		System.out.printf("%d   ", (num % 10));
		
		}
		
			if (num > 99999)
			System.out.println("You had entered a number more than five digits.");
		
		
		if (num <= 9999)
			System.out.println("You had entered a number less than five digits.");

    
    
    }
    


}
