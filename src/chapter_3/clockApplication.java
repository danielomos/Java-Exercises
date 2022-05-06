package chapter_3;

import java.util.Scanner;

public class clockApplication {
    public static void main(String[] args) {
        Clock_Question314 clock1 = new Clock_Question314(24, 60, 59);
        Scanner input = new Scanner(System.in);


        clock1.displaytime();
    }
}
