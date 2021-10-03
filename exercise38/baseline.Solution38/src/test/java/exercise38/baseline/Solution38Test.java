package exercise38.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    Solution38 app = new Solution38();

    int[] testFilter = {1, 3, 2, 6, 5, 4, 8, 56, 24, 55, 45, 0};
    String testConvert = ("1 3 2 6 5 4 8 56 24 55 45 0");

    @Test
    void filterEvenNumbers() {
        int[] expected = {2, 6, 4, 8, 56, 24, 0};

        assertArrayEquals(expected, app.filterEvenNumbers(testFilter));
    }

    @Test
    void convertStrToIntArray() {

        assertArrayEquals(testFilter, app.convertStrToIntArray(testConvert));
    }
}