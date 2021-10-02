package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;



public class Solution27 {
    private static final Scanner input = new Scanner(System.in);

    //Prompt "Enter the first name:"
    //    save input into <firstName>
    private static String getFirstName(){
        System.out.print("Enter the first name: ");
        return input.nextLine();
    }

    //Prompt "Enter the last name:"
    //    save input into <lastName>
    private static String getLastName(){
        System.out.print("Enter the last name: ");
        return input.nextLine();
    }

    //Prompt "Enter the ZIP code:"
    //    save input into <zipCode>
    private static String getZIPCode(){
        System.out.print("Enter the ZIP code: ");
        return input.nextLine();
    }

    //Prompt "Enter the employee ID:"
    //    save input into <employeeID>
    private static String getEmployeeID(){
        System.out.print("Enter the employee ID: ");
        return input.nextLine();
    }

    //Validate first name
    //    if first name < 2 characters long
    //        not valid
    private static String validateFirstName(String firstName){
        String invalidInput = "";
        if(firstName.length() < 2){
            invalidInput += "The first name must be at least 2 characters long.\n";
        }
        if(firstName.length() == 0){
            invalidInput += "The last name must be filled in.\n";
        }
        return invalidInput;
    }

    //Validate last name
    //    if last name < 2 characters long
    //        not valid
    private static String validateLastName(String lastName){
        String invalidInput = "";
        if(lastName.length() < 2){
            invalidInput += "The last name must be at least 2 characters long.\n";
        }
        if(lastName.length() == 0){
            invalidInput += "The last name must be filled in.\n";
        }
        return invalidInput;
    }

    //Validate zip code
    //    if zip code is not a number
    //        not valid
    private static String validateZIPCode(String zipCode){
        if(!zipCode.matches("[0-9]+")){
            return "The zipcode must be a 5 digit number.\n";
        }
        return "";
    }

    //Validate employee ID
    //    if ID not in format (AA-1234)
    //        not valid
    private static String validateEmployeeID(String employeeID){
        if(!employeeID.matches("[a-zA-Z]{2}[-]{1}[0-9]{4}")){
            return "The employee ID must be in the format of AA-1234.\n";
        }
        return "";
    }

    public static String validateInput(String firstName, String lastName, String zipCode, String employeeID){
        String output = validateFirstName(firstName) + validateLastName(lastName) + validateEmployeeID(employeeID) + validateZIPCode(zipCode);
        if(output.length() > 0){
            return output;
        }
        else {
            return "There were no errors found.";
        }
    }

    public static void main(String[] args) {
        System.out.println(validateInput(getFirstName(),getLastName(), getZIPCode(),getEmployeeID()));
    }
}
