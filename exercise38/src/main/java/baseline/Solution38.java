package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    private static final Scanner input = new Scanner(System.in);

    //Prompt "Enter a list of numbers, separated by spaces:"
    //    save input into list <numbers>
    public static int[] getNumbers(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String[] numbersString = input.nextLine().split(" ");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        return numbers;
    }
    //Filter list
    //    delete any odd number from <numbers>
    public static int[] filterEvenNumbers(int[] numbers){
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                indexes.add(i);
            }
        }
        int[] filtered = new int[indexes.size()];
        int count = 0;
        for(int index: indexes){
            filtered[count] = numbers[index];
            count++;
        }
        return filtered;
    }

    //Print "The even numbers are <numbers>
    public static void printList(int[] numbers){
        System.out.print("The even numbers are ");
        for(int number: numbers) {
            System.out.printf("%d ", number);
        }
    }

    public static void main(String[] args) {
        printList(filterEvenNumbers(getNumbers()));
    }

}
