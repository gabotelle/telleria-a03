package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    @Test
    void average() {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        double expected = 400.0;
        double actual = Solution36.average(numbers);

        assertEquals(expected, actual, 0.1) ;
    }

    @Test
    void min() {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        int expected = 100;
        int actual = Solution36.min(numbers);

        assertEquals(expected, actual) ;
    }

    @Test
    void max() {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        int expected = 1000;
        int actual = Solution36.max(numbers);

        assertEquals(expected, actual) ;
    }

    @Test
    void std() {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        double expected = 353.55;
        double actual = Solution36.std(numbers);

        assertEquals(expected, actual, 0.01) ;
    }
}