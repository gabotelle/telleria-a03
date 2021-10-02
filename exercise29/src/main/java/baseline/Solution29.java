package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

public class Solution29 {
    private static final Scanner input = new Scanner(System.in);
    //try
    //    Prompt "What is the rate of return"
    //    Save input into <rate>
    //    <years> = 72 / <rate>
    //    Print "It will take <years> years to double your initial investment."
    // if input is zero or is not number
    //        Print "Sorry. That's not a valid input."
    public static void calculateYears(){
        boolean flag = true;
        while(flag) {
            try {
                System.out.print("What is the rate of return: ");
                int userInput = Integer.parseInt(input.nextLine());
                System.out.printf("It will take %d years to double your initial investment.", (72 / userInput));
                flag = false;
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }

    public static void main(String[] args) {
        calculateYears();
    }

}
