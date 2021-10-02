package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

public class Solution26 {
    public static void main(String[] args) {
        PaymentCalculator pc = new PaymentCalculator();
        int months = pc.calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %d months to pay off this card.", months);
    }
}
