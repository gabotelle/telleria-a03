package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
for i [1-12]
    for j [1-12]
        print <i*j>
 */
public class Solution30 {
    private static final Scanner input = new Scanner(System.in);

    public static void twelveTable(){
        for (int i = 1; i <=12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        twelveTable();
    }
}
