package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

public class Solution31 {
    private static final Scanner input = new Scanner(System.in);

    //Prompt "Resting Pulse:"
    //    save into <restingPulse>
    public static int getRestingPulse(){
        while(true){
            try{
                System.out.print("Resting Pulse: ");
                String restingPulse = input.nextLine();
                return Integer.parseInt(restingPulse);
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input.");
            }
        }
    }
    //Prompt "Age:"
    //    save input <age>
    public static int getAge() {
        while (true) {
            try {
                System.out.print("age: ");
                String age = input.nextLine();
                return Integer.parseInt(age);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
    }
    //Print table header
    //for i [55-95] by 5
    //    <targetRate> = (((220 − <age>) − <restingPulse>) × <'i' / 100>) + <restingPulse>
    //    print "<i>%         | <targetRate> bpm
    public static void createTable(int restingPulse, int age){
        System.out.printf("%nIntensity    | Rate%n-------------|--------%n");
        for (int i = 55; i <= 95; i += 5) {
            int targetRate = (int)((220 - age - restingPulse) * (i / 100.0) + restingPulse);
            System.out.printf("%d%%          | %d bpm%n", i, targetRate);
        }

    }

    public static void main(String[] args) {
        createTable(getRestingPulse(), getAge());
    }
}
