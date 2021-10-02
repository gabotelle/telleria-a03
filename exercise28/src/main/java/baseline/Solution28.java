package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt "Enter a number:" 5 times
    add input into <result>
Print "The total is <result>"
 */
public class Solution28 {
    private static final Scanner input = new Scanner(System.in);

    public static void addNumbers(){
        int result = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            result += input.nextInt();
        }
        System.out.printf("The total is %d.", result);
    }

    public static void main(String[] args) {
        addNumbers();
    }
}
