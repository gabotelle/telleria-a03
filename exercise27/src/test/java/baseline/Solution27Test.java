package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInputValid() {
        Solution27 sol = new Solution27();

        String expected = "There were no errors found.";
        String actual = sol.validateInput("John", "Johnson", "55555", "TK-4321");

        assertEquals(expected, actual) ;
    }

    @Test
    void validateInputInvalid() {
        Solution27 sol = new Solution27();

        String expected = "The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zipcode must be a 5 digit number.\n";
        String actual = sol.validateInput("J", "", "ABCDE", "A12-1234");

        assertEquals(expected, actual) ;
    }

}