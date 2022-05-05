import java.util.Scanner;

public class CarApplication{
    public static void  main(String []args){
        Car_Question313 car1 = new Car_Question313("benz","2022",1000000.00);
        Car_Question313 car2 = new Car_Question313("toyota","2020",200000.00);
            System.out.printf("Price for the first car model %s is %.2f%n", car1.getModel(), car1.getPrice());
             System.out.printf("Price for the Second car model %s is %.2f%n", car2.getModel(), car2.getPrice());



       double discountedPricecar1 = car1.applyDiscount(5.00);
       double discountedPricecar2 = car2.applyDiscount(7.00);


       System.out.printf("price for first car after 5 percent discount is apply %.2f%n", discountedPricecar1 );
       System.out.printf("price for Second car after 7 percent discount is apply %.2f%n", discountedPricecar2 );



    }
}