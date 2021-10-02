package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidatorVeryWeak() {
        Solution25 sol = new Solution25();

        int expected = 1;
        int actual = sol.passwordValidator("12345");

        assertEquals(expected, actual) ;
    }
    @Test
    void passwordValidatorWeak() {
        Solution25 sol = new Solution25();

        int expected = 2;
        int actual = sol.passwordValidator("abcdef");

        assertEquals(expected, actual) ;
    }
    @Test
    void passwordValidatorStrong() {
        Solution25 sol = new Solution25();

        int expected = 3;
        int actual = sol.passwordValidator("abc123xyz");

        assertEquals(expected, actual) ;
    }
    @Test
    void passwordValidatorVeryStrong() {
        Solution25 sol = new Solution25();

        int expected = 4;
        int actual = sol.passwordValidator("1337h@xor!");

        assertEquals(expected, actual) ;
    }
    @Test
    void passwordValidatorUnknownStrength() {
        Solution25 sol = new Solution25();

        int expected = 0;
        int actual = sol.passwordValidator("wbkebebkjcd");

        assertEquals(expected, actual) ;
    }
}