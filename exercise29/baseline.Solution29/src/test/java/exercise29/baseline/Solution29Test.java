package exercise29.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    Solution29 test = new Solution29();

    @Test
    void checkNumeric() {
        assertTrue(test.checkNumeric("1"));
        assertFalse(test.checkNumeric("A"));
        assertFalse(test.checkNumeric("@"));
    }

    @Test
    void checkIfZero() {
        assertTrue(test.checkIfZero("0"));
        assertFalse(test.checkIfZero("1"));
        assertFalse(test.checkIfZero("-1"));
        assertFalse(test.checkIfZero("@"));
        assertFalse(test.checkIfZero("A"));
    }

    @Test
    void getYearsInvested() {
        assertEquals("18", test.getYearsInvested("4"));
        assertEquals("17.1", test.getYearsInvested("4.2"));
        assertEquals("16.9", test.getYearsInvested("4.25"));
    }
}