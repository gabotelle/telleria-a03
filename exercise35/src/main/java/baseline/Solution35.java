package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner input = new Scanner(System.in);
    private static final Random rand = new Random();

    //Prompt until blank "Enter a name"
    //    add input into <contestants>
    public static List<String> getContestants(){
        ArrayList<String> contestants = new ArrayList<>();
        while(true){
            System.out.print("Enter a name: ");
            String contestant = input.nextLine();
            if(contestant.length() == 0){
                return contestants;
            }
            contestants.add(contestant);
        }
    }
    //Print "The winner is... <randomContestant>
    public static void pickWinner(List<String> contestants){
        int random = rand.nextInt(contestants.size());
        System.out.printf("The winner is... %s", contestants.get(random));
    }

    public static void main(String[] args) {
        pickWinner(getContestants());
    }
}
