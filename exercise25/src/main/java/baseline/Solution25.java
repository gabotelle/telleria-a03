package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

public class Solution25 {
    private static final Scanner input = new Scanner(System.in);
    //Prompt the user for password
    //    save input into <password>
    public static String getPassword(){
        System.out.print("Enter Password: ");
        return input.nextLine();
    }
    //check strength
    //    if length < 8
    //        if only contains numbers
    //            return 1
    //        if only contains letters
    //            return 2
    //    else contains letters and numbers
    //        if contains special character
    //            return 4
    //        else
    //            return 3
    //    return 0
    public static int passwordValidator(String password){
        if(password.length() < 8){
            if(password.matches("[0-9]+")){
                return 1;
            }
            if(password.matches("[a-zA-Z]+")){
                return 2;
            }
        }
        else if(password.matches("(?=.*[a-zA-Z]).*") && password.matches(".*[0-9].*")){
            if(password.matches("(?=.*[~!@#$%^?&*()_-]).*")){
                return 4;
            }
            else{
                return 3;
            }
        }
        return 0;
    }
    //if strength 1
    //    Print "The password <password> is a very weak password."
    //if strength 2
    //    Print "The password <password> is a weak password."
    //if strength 1
    //    Print "The password <password> is a strong password."
    //if strength 1
    //    Print "The password <password> is a very strong password."
    //else
    //    Print "The password <password> is an unknown strength password."
    public static void printStrength(int strength, String password){
        String strengthLevel = "unknown strength";
        if(strength == 1){
             strengthLevel = "very weak";
        }
        else if(strength == 2){
            strengthLevel = "weak";
        }
        else if(strength == 3){
            strengthLevel = "strong";
        }
        else if(strength == 4){
            strengthLevel = "very strong";
        }
        System.out.printf("The password '%s' is a %s password.", password, strengthLevel);
    }
    public static void main(String[] args) {
        String password = getPassword();
        printStrength(passwordValidator(password), password);

    }
}
