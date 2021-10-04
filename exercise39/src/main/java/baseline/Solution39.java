package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */


import java.util.HashMap;
import java.util.Map;

public class Solution39
{
    //Solution
    //     Print "Name         | Position      | Separation Date
    //               -------------|---------------|------------------"
    public static void printSortedTable(){
        System.out.printf("Name                | Position           | Separation Date%n" + "" +
                          "--------------------|--------------------|--------------------");

        createEmployees();
    }

    //    Create hashmap <employees> of -Employee-
    public static void createEmployees(){
        HashMap<Integer, Employee> employees = new HashMap<>();
        Employee e1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        employees.put(1, e1);
        Employee e2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        employees.put(2, e2);
        Employee e3 = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        employees.put(3, e3);
        Employee e4 = new Employee("Jake", "Jacobson", "Programmer", "");
        employees.put(4, e4);
        Employee e5 = new Employee("Jacquelyn", "Jackson", "DBA", "");
        employees.put(5, e5);
        Employee e6 = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");
        employees.put(6, e6);
        printSortedEmployees(employees);
    }

    //    do
    //        Find firstLastName
    //            for all <employees.lastName>
    //                if <first> < <employees.lastName>
    //                    <first> = <employees.lastName>
    //        print <employee> with <first>
    //            print <firstName> <LastName> | <position> | <separationDate>"
    //        remove <employee>
    //    while is not empty
    public static void printSortedEmployees(HashMap<Integer, Employee> employees){
        if(employees.isEmpty()){
            return;
        }
        int index = (int)(employees.keySet().toArray()[0]);
        HashMap<Integer, Employee> temp = new HashMap<>();
        temp.putAll(employees);
        temp.remove(index);
        while(!temp.isEmpty()) {
            int index2 = (int) (temp.keySet().toArray()[0]);
            if (employees.get(index).getLastName().compareTo(employees.get(index2).getLastName()) >= 0) {
                index = index2;
            }
            temp.remove(index2);
        }
        String fullName = employees.get(index).getFirstName() + " " + employees.get(index).getLastName();
        System.out.printf("%n%-19s | %-18s | %s", fullName, employees.get(index).getPosition(), employees.get(index).getSeparationDate());
        employees.remove(index);
        printSortedEmployees(employees);
    }

    public static void main(String[] args) {
        printSortedTable();
    }
}
