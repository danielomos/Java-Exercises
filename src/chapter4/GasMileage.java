package chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

     int gallonUsed = 0;
     int mileDriving = 0;
     double milePergallon = 0;
     double totalMilesPergallon =0;
     double avg = 0;
     int trips = 0;
     Scanner input = new Scanner(System.in);
        System.out.println("Enter Mile You have driven");
        mileDriving =input.nextInt();
        System.out.println("Enter Gallon consume");
        gallonUsed = input.nextInt();
        while (mileDriving != -1) {

            milePergallon = gasMileage(mileDriving, gallonUsed);
            totalMilesPergallon += milePergallon;
            trips = trips + 1;

            System.out.println("Enter Mile You have driven");
            mileDriving = input.nextInt();
            System.out.println("Enter Gallon consume");
            gallonUsed = input.nextInt();
        }

       if (totalMilesPergallon != 0) {
           avg = totalMilesPergallon/trips;
           System.out.println(totalMilesPergallon);
           System.out.println("avarge is: " + avg);




        }
            // System.out.println("miles Per gallons " + Math.round(mpg));


    }

    public static double gasMileage(int mile, int gallons ){

         int mileage = (mile/gallons);
         return mileage;

    }

}
