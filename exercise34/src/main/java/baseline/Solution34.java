package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    private static final Scanner input = new Scanner(System.in);

    //Create list
    //    John Smith, Jackie Jackson, Chris Jones, Amanda Cullen Jeremy Goodwin
    public static ArrayList<String> createList(){
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        return employees;
    }

    //Print "There are <listSize> employees:
    //        <employeeFromList>"
    public static void printEmployeeList(List<String> employeeList){
        System.out.printf("There are %d employees:%n", employeeList.size());
        for(String employee: employeeList){
            System.out.printf("%s%n", employee);
        }
    }

    //Prompt "Enter an employee name to remove:"
    //    save input into <employeeName>
    //Remove <employeeName> from list
    public static void removeEmployee(List<String> employeeList){
        System.out.printf("%nEnter an employee name to remove:");
        String name = input.nextLine();
        employeeList.remove(name);
        printEmployeeList(employeeList);
    }

    public static void main(String[] args) {
        ArrayList<String> employeeList = createList();
        printEmployeeList(employeeList);
        removeEmployee(employeeList);
    }
}
