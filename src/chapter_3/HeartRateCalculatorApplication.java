package chapter_3;

import java.util.Scanner;

public class HeartRateCalculatorApplication {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        HeartRateCalculator mairo = new HeartRateCalculator("","",0,0,0);

        System.out.println("Can you Kindly enter your First name: \n");
        mairo.setFirstName(input.nextLine());

        System.out.println("Can you Kindly enter your Second name: \n");
          mairo.setLastName(input.nextLine());
        System.out.println("Also Your Date of Birth in this order Year(1999),Month(01),day(01): \n");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        System.out.println("kindly hold on while we confirm your current age and compute your maximun heart rate and target heart-rate range ");
        mairo.setYearOfBirth(year);
        mairo.setMonthOfBirth(month);
        mairo.setDayOfBirth(day);
        System.out.printf("your current age %d%n", mairo.getAgeInYears() );
        System.out.printf("your maximun heart rate %d%n",mairo.getMaxHeartRate() );
        System.out.printf("Your target heart-rate range %d%n", mairo.targetHeartRate());
    }
}
