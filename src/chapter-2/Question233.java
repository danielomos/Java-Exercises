/*create a BMI calculator that reads the user's weight in pound and height in inches (or, if you prefers, the user's weight in kilograms and height in meters), than calculates and displays the user's body mass index, also , display the BMI categories and their values from the National heart lung and Blood Institute  */

//Answer

import java.util.Scanner;
public class Question233 {

 
    public static void main (String [] args ){
        Scanner input = new Scanner (System.in);
        
        System.out.printf("Enter your weight (pounds): %n");
        int weight = input.nextInt();
        
        System.out.printf("Enter your Height (Inches): %n");
        int height = input.nextInt();
        
        int Bmi = (weight * 703) / (height * height);
        
        System.out.printf("Your Body mass Index: %d%n%n", Bmi);
        
        System.out.printf ("BMI categories and it values%n");
        
        System.out.printf("Underweight: less than 18.5%n");
        System.out.printf("Normal:        between 18.5 and 24.9%n");
        System.out.printf("Overweight:  between 25 and 29.9%n");
        System.out.printf("Obese:       30 or greater%n");
 
    }
}
    
    
    
    
