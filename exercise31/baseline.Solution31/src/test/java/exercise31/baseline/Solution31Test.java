package exercise31.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    Solution31 test = new Solution31();

    @Test
    void isInputNumeric() {
        assertTrue(test.checkNumeric("1"));
        assertFalse(test.checkNumeric("A"));
        assertFalse(test.checkNumeric("@"));
    }
}