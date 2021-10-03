package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */


import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner input = new Scanner(System.in);

    //Print "Let's play Guess the Number!"
    public static void startGame(){
        System.out.println("Let's play Guess the Number!");
        do{
            int range = getDifficulty();
            int mysteryNumber = getRandomNumber(range);
            userGuess(mysteryNumber);
        }while(keepPlaying());
    }

    //            Prompt "Do you wish to play again (Y/N)?"
    //                if input is y or Y
    //                    flag true
    //                else
    //                    flag false
    public static boolean keepPlaying(){
        System.out.printf("%nDo you wish to play again (Y/N)? ");
        String answer = input.nextLine();
        return answer.equals("y") || answer.equals("Y");
    }

    //Prompt "IEnter the difficulty level (1, 2, or 3): "
    //    save input into <difficulty>
    //    if difficulty = 1
    //        range = 10
    //    if difficulty = 2
    //        range = 100
    //    if difficulty = 3
    //        range = 1000
    public static int getDifficulty(){
        while(true) {
            try {
                System.out.printf("%nEnter the difficulty level (1, 2, or 3): ");
                String answer = input.nextLine();
                int difficulty = Integer.parseInt(answer);
                return switch (difficulty) {
                    case 1 -> 10;
                    case 2 -> 100;
                    case 3 -> 1000;
                    default -> getDifficulty();
                };

            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
    }

    //    <number> = random number [1-range]
    public static int getRandomNumber(int range){
        Random rand = new Random();
        return rand.nextInt(range) + 1;
    }

    //Prompt " I have my number. What's your guess?"
    //        save input into <guess>
    //    until correct count <tries>
    //        if guess > number
    //            prompt "Too high. Guess again:"
    //                save input into <guess>
    //        if guess < number
    //            print "Too low. Guess again:"
    //                save input into <guess>
    //        else
    //            Print You got it in <tries> guesses!
    public static void userGuess(int mysteryNumber){
        int guesses = 0;
        boolean flag = true;
        System.out.print("I have my number. What's your guess? ");
        while(flag) {
            try {
                guesses++;
                int guess = Integer.parseInt(input.nextLine());
                if (guess == mysteryNumber) {
                    System.out.printf("You got it in %s guesses!%n", guesses);
                    flag = false;
                } else if (guess > mysteryNumber) {
                    System.out.print("Too high. Guess again: ");
                } else {
                    System.out.print("Too low. Guess again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Guess again: ");
            }
        }
    }
    
    public static void main(String[] args) {
        startGame();
    }
}
