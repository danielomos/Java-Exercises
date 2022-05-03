/*write an application that inputs from the user the radius of a circle as an integer and prints the circle's diameter,circumference and area using the floating-point value 3.14159 for pi*/

//Answer

import java.util.Scanner;

public class Question228{
 public static void main (String [] args) {
 
Scanner input = new Scanner(System.in);

System.out.printf("Enter the radius of the cycle: %n");
int radius = input.nextInt();



System.out.printf("cycle diameter is : %d%n", (2 * radius));

System.out.printf("cycle circumference is : %.2f%n", (2 * (Math.PI) * radius));

System.out.printf("Area of cycle: %.2f%n", ((Math.PI) *(radius * radius)));
 
 
 
 
 
 
 }



}
