package grybiena;

import java.util.Scanner;

public class Input {

    public void readInput() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter two numbers to calculate sum");
        System.out.print("Enter first number: ");
        int c = scanner.nextInt();
        System.out.print("Enter second number: ");
        int d = scanner.nextInt();
        System.out.print("sum is: " + (c+d));
    }
}
