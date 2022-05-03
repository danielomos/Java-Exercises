/*Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacet numbers separated by one space

//Answer
public class Question214 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;

// (A) using one System.out.println statement.
        System.out.println(number1 + " " + number2 +" " + number3 +" " + number4);
        
        // (B) using four System.out.print statement.
        System.out.print(number1+" ");
        System.out.print(number2+" ");
        System.out.print(number3+" ");
        System.out.print(number4+" ");

// (C) using one System.out.printf statement.
        System.out.printf(“%d %d %d %d”,number1,number2,number3,number4)


    }


}
*/