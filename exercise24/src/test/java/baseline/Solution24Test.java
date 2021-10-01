package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagramTrue() {
        Solution24 sol = new Solution24();

        boolean expected = true;
        boolean actual = sol.isAnagram("tone", "note");

        assertEquals(expected, actual) ;
    }

    @Test
    void isAnagramFalseNotSameLength() {
        Solution24 sol = new Solution24();

        boolean expected = false;
        boolean actual = sol.isAnagram("ton", "note");

        assertEquals(expected, actual) ;
    }

    @Test
    void isAnagramFalseSameLength() {
        Solution24 sol = new Solution24();

        boolean expected = false;
        boolean actual = sol.isAnagram("tony", "note");

        assertEquals(expected, actual) ;
    }


}