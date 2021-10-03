package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    private static final Scanner input = new Scanner(System.in);
    private static final Random rand = new Random();

/*
Create list
    "Yes", "No", "Maybe", "Ask again later"
Print "What's your question?"
Print item from list
 */
    public static void magic8Ball(){
        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};
        System.out.printf("What's your question?%n> ");
        input.nextLine();
        System.out.printf("%n%s", answers[rand.nextInt(answers.length)]);
    }

    public static void main(String[] args) {
        magic8Ball();
    }
}
