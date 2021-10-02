package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

public class PaymentCalculator {
    private final Scanner input = new Scanner(System.in);

    //Prompt "What is your balance?"
    //    save input into <balance>
    private double getBalance(){
        System.out.print("What is your balance?");
        return input.nextDouble();
    }

    //Prompt "What is the APR on the card (as a percent)?"
    //    save input into <APR>
    private double getAPR(){
        System.out.print("What is the APR on the card (as a percent)?");
        return input.nextDouble();
    }

    //Prompt "What is the monthly payment you can make?"
    //    save input into <monthlyPayment>
    private double getMonthlyPayment(){
        System.out.print("What is the monthly payment you can make?");
        return input.nextDouble();
    }

    //Calculate months
    //    <months> = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public int calculateMonthsUntilPaidOff(){
        double balance = getBalance();
        double apr = getAPR();
        apr = apr / 100 / 365;
        double monthlyPayment = getMonthlyPayment();
        return (int)Math.ceil(-(1.0/30) * Math.log(1 + balance/monthlyPayment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
    }
}
