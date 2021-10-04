package baseline;

public class Employee {
    //    first name
    //    last name
    //    position
    //   separation date
    private final String firstName;
    private final String lastName;
    private final String position;
    private final String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getPosition(){
        return position;
    }
    public String getSeparationDate(){
        return separationDate;
    }

    //print <firstName> <LastName> | <position> | <separationDate>"
    public void ToString() {
        String fullName = firstName + " " + lastName;
        System.out.printf("%20s | %20s | %s%n", fullName, position, separationDate);
    }
}
