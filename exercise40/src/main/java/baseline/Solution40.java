package baseline;

import java.util.HashMap;
import java.util.Scanner;

public class Solution40 {
    private static final Scanner input = new Scanner(System.in);
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
        searchEmployee(employees, getName());
    }
    public static String getName(){
        System.out.print("Enter a search string: ");
        return input.nextLine();
    }
    public static void searchEmployee(String name){

    }
}
