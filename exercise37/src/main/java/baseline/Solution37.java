package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Random;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner input = new Scanner(System.in);
    private static final Random rand = new Random();
    private static final char[] letters =
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] special = {'!', '@', '#', '$', '%', '&', '*', '?',
            '+', '-', '=', '~'};

    //Prompt "What's the minimum length?"
    //    save input into <length>
    public static int getLength(){
        System.out.print("What's the minimum length? ");
        return input.nextInt();
    }

    //Prompt "How many special characters?"
    //    save input into <specialNumber>
    public static int getSpecialNumber(){
        System.out.print("How many special characters? ");
        return input.nextInt();
    }

    //Prompt "How many numbers?"
    //    save input into <numbersNumber>
    public static int getNumbersNumber(){
        System.out.print("How many numbers? ");
        return input.nextInt();
    }

    //Create password
    //    for random number[<length>-<length+20>]
    //        random between character, special, and numbers.
    //                    numbers until <numbersNumber>
    //                    special until <specialNumber>
    //                    characters >= <numbersNumber> + <specialNumbers>
    //            add character/number/special into <password>
    //    Print "Your password is <password>
    public static void createPassword(int length, int specialNumber, int numbersNumber){
        StringBuilder password = new StringBuilder();
        int letterNumber = specialNumber + numbersNumber;
        int letterCount = 0;
        boolean flag = true;
        while(flag){
            int character = rand.nextInt(3);
            if(character == 1 && numbersNumber != 0) {
                password.append(rand.nextInt(10));
                numbersNumber--;
            }
            else if(character == 2 && specialNumber != 0) {
                password.append(special[rand.nextInt(special.length)]);
                specialNumber--;
            }
            else{
                password.append(letters[rand.nextInt(letters.length)]);
                letterCount++;
            }
            if(password.length() >= length && letterCount >= letterNumber && specialNumber == 0 && numbersNumber == 0) {
                flag = false;
            }
        }
        System.out.printf("Your password is %s", password);
    }

    public static void main(String[] args) {
        createPassword(getLength(), getSpecialNumber(), getNumbersNumber());
    }
}
