package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {
    private static final Scanner input = new Scanner(System.in);

    //Prompt user until 'done' "Enter a number:"
    //    add input into <numbers>
    //Print "Numbers: <numbers>"
    public static List<Integer> getNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            try{
                System.out.print("Enter a number: ");
                String number = input.nextLine();
                if(number.equals("done")){
                    return numbers;
                }
                numbers.add(Integer.parseInt(number));
            }
            catch (NumberFormatException e){
                System.out.println("Not a number.");
            }
        }
    }
    //Find average
    //    <average> = add all <numbers>
    //    <average> = <average> / <averageSize>
    public static double average(List<Integer> numbers){
        double sum = 0.0;
        for(int number: numbers){
            sum += number;
        }
        return sum / numbers.size();
    }

    //Find minimum
    //    <minimum> = <numbers[0]>
    //    for all <numbers>
    //        if <numbers[i]> < <minimum>
    //            <minimum> = <numbers[i]>
    //    return <minimum>
    public static int min(List<Integer> numbers){
        int minimum = numbers.get(0);
        for(int number: numbers){
            if(number < minimum){
                minimum = number;
            }
        }
        return minimum;
    }

    //Find maximum
    //    <maximum> = <numbers[0]>
    //    for all <numbers>
    //        if <numbers[i]> > <maximum>
    //            <maximum> = <numbers[i]>
    //    return <maximum>
    public static int max(List<Integer> numbers){
        int maximum = numbers.get(0);
        for(int number: numbers){
            if(number > maximum){
                maximum = number;
            }
        }
        return maximum;
    }
    //Find standard deviation
    //    for all <numbers>
    //        add (<numbers[i]> - <average>)^2 to <standardDeviation>
    //    return square root of (<standardDeviation> / <numbersSize>)
    public static double std(List<Integer> numbers){
        double average = average(numbers);
        double standardDeviation = 0.0;
        for(int number: numbers){
            standardDeviation += Math.pow((number - average), 2);
        }
        return Math.sqrt(standardDeviation / numbers.size());
    }

    //Print results
    //    Print "The average is <average>"
    //    Print "The minimum is <minimum>"
    //    Print "The maximum is <maximum>"
    //    Print "The standard deviation is <standardDeviation>"
    public static void printResults(List<Integer> numbers){
        System.out.print("Numbers:");
        for(int number: numbers){
            System.out.printf(" %d,", number);
        }
        System.out.printf("%nThe average is %.1f%n", average(numbers));
        System.out.printf("The minimum is %d%n", min(numbers));
        System.out.printf("The maximum is %d%n", max(numbers));
        System.out.printf("The standard deviation is %.2f%n", std(numbers));
    }

    public static void main(String[] args) {
        printResults(getNumbers());
    }
}
