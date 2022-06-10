package chapter4;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int counter =0;
        int largest =0;
        while (counter <10){
            System.out.println("Kindly Enter an Integer number ");
            number= input.nextInt();
            if(number >= largest){
                largest = number;
            }
            counter++;
        }
        System.out.println(counter+ " Integer number were Enter and largest number is: "+ largest);
    }
}
