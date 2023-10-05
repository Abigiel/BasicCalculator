package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {


    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    float num1 = myScanner.nextFloat();


    System.out.print("Enter second number: ");
    float num2 = myScanner.nextFloat();

    System.out.println("What operation would you like to choose?");
    System.out.println("(Possible calculations:\n" +
            "(A)dd\n" +
            "(S)ubtract\n" +
            "(M)ultiply\n" +
            "(D)ivide)\n");

    System.out.print("Please select an option: ");
    String operation = myScanner.nextLine();


    //System.out.println()
    }
}
