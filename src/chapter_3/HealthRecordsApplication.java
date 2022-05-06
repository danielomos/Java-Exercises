package chapter_3;

import java.util.Scanner;

public class HealthRecordsApplication {
    public static void main(String[]args){
        HealthReacords record1 = new HealthReacords("daniel","omosele","male",1900,10,10,50,40);
        Scanner input = new Scanner(System.in);

        System.out.printf("Kindly Enter Yours Details As Following Line by Line%n First Name(%s)  Last Name(%s)  Gender(%s)  Year of Birth(%d) Month Of Birth(%d) Day of Birth(%d) Height In Inches(%d) Weight in Pounds(%d)%n",record1.getFirstName(),record1.getLastName(),record1.getGender(), record1.getDobYear(),record1.getDobMonth(),record1.getDobDay(),record1.getHeightInches(),record1.getWeightPounds());
        System.out.print("enter your first name:");
        record1.setFirstName(input.nextLine());
       System.out.print("enter your last name:");
       record1.setLastName(input.nextLine());
        System.out.print("enter your Gender (Male or Female) name:");
        record1.setGender(input.nextLine());
        System.out.print("enter your year of birth :");
        record1.setDobYear(input.nextInt());
        System.out.print("enter your month of birth:");
        record1.setDobMonth(input.nextInt());
        System.out.print("enter your day of birth:");
        record1.setDobDay(input.nextInt());
        System.out.print("enter your Height in inches:");
        record1.setHeightInches(input.nextInt());
        System.out.print("enter your Weight in pounds:");
        record1.setWeightPounds(input.nextInt());

        System.out.println("Kindly Confirm your details below%n ");
        System.out.printf("First Name(%s)  Last Name(%s)  Gender(%s)  Year of Birth(%d) Month Of Birth(%d) Day of Birth(%d) Height In Inches(%d) Weight in Pounds(%d)%n",record1.getFirstName(),record1.getLastName(),record1.getGender(), record1.getDobYear(),record1.getDobMonth(),record1.getDobDay(),record1.getHeightInches(),record1.getWeightPounds());

        System.out.println("Press enter to confirm your current age and compute your maximum heart rate, target heart-rate range, and BMI ");
        System.out.println("your current age in year is "+ " "+record1.getAgeInYears());
        System.out.println("your maximum heart rate is "+ " "+record1.getMaxHeartRate());
        System.out.println("your Target heartRate is "+ " "+record1.targetHeartRate());
        System.out.println("your BMI is "+ " "+record1.getbMi());
    }
}