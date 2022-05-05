import java.util.Scanner;
public class Petrol_Question312{

public static void main(String[]args) {
    PetrolPurchase_Question312 order = new PetrolPurchase_Question312("ikeja", "feul", 50, 560.00, 10.00);



    System.out.printf("Your net petrol purchase is %.2f%n", order.getPurchaseAmount());

}
}