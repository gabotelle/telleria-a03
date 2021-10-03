package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumbers() {
        int[] expected = {2, 4, 6, 8};
        int[] actual = {1,2,3,4,5,6,7,8};
        actual = Solution38.filterEvenNumbers(actual);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}