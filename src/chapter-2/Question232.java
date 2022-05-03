/*write a program that inputs five numbers and determins and prints the number of negative numbers input, the number of positive numbers input and the number of zeros input.*/

//Answer:


import java.util.Scanner;
public class Question232{
     public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
		
		int number1;	
		int number2;	
		int number3;	
		int number4;	
		int number5;	
		int totalNegative=0;	
		int totalPositive=0;	
		int totalZero=0;	
		
		System.out.print("Enter first integer: ");	
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");	
		number2 = input.nextInt();	
		
		System.out.print("Enter third integer: ");	
		number3 = input.nextInt();	
		
		System.out.print("Enter fourth integer: ");	
		number4 = input.nextInt();
		
		System.out.print("Enter fifth integer: ");	
		number5 = input.nextInt();	
		
   		
		// to check if any input is positive
		if (number1 > 0)
			totalPositive = totalPositive + 1;
		
		if (number2 > 0)
			totalPositive = totalPositive + 1;
		
		if (number3 > 0)
			totalPositive = totalPositive + 1;
		
		if (number4 > 0)
			totalPositive = totalPositive + 1;
		
		if (number5 > 0)
			totalPositive = totalPositive + 1;
			
         // this check if any input is negative
	if (number1 < 0)
			totalNegative = totalNegative + 1;	
		
		if (number2 < 0)
			totalNegative = totalNegative + 1;
		
		if (number3 < 0)
			totalNegative = totalNegative + 1;
	
		if (number4 < 0)
			totalNegative = totalNegative + 1;
		
		if (number5 < 0)
			totalNegative = totalNegative + 1;
		
		// to check if any input is zero
		if (number1 == 0)
			totalZero = totalZero + 1;
		
		if (number2 == 0)
			totalZero = totalZero + 1;
		
		if (number3 == 0)
			totalZero = totalZero + 1;
		
		if (number4 == 0)
			totalZero = totalZero + 1;
		
		if (number5 == 0)
			totalZero = totalZero + 1;
		
		System.out.println();
		System.out.printf("Total negative numbers: %d\n", totalNegative);	
		
		System.out.printf("Total postive numbers: %d\n", totalPositive);	
		
		System.out.printf("Total zero numbers: %d\n", totalZero);	
		

	} 

} 
    
    
