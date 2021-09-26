package exercise27.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    Solution27 test = new Solution27();

    @Test
    void validateInput() {
        assertAll(() -> assertEquals("There were no errors found.\n",
                test.validateInput("keven", "fazio", "12345", "KF-1234")),
        () -> assertEquals("The first name must be at least 2 characters long.\n",
                test.validateInput("k", "fazio", "12345", "KF-1234")),
        () -> assertEquals("The last name must be filled in.\nThe last name must be at least 2 characters long.\n",
                test.validateInput("keven", "", "12345", "KF-1234")),
        () -> assertEquals("The zipcode must be a 5 digit number.\n",
                test.validateInput("keven", "fazio", "1234A", "KF-1234")),
        () -> assertEquals("The employee ID must be in the format of AA-1234.\n",
                test.validateInput("keven", "fazio", "12345", "KF@1234")));
    }

    @Test
    void checkBlank() {
        assertAll(() -> assertFalse(test.checkBlank("keven")),
        () -> assertTrue(test.checkBlank("")));
    }

    @Test
    void checkLength() {
        assertAll(() -> assertFalse(test.checkLength("keven")),
        () -> assertFalse(test.checkLength("ke")),
        () -> assertTrue(test.checkLength("k")));
    }

    @Test
    void checkNumeric() {
        assertAll(() -> assertFalse(test.checkNumeric("12345")),
        () -> assertTrue(test.checkNumeric("A1234")),
        () -> assertTrue(test.checkNumeric("1234A")),
        () -> assertTrue(test.checkNumeric("12@34")),
        () -> assertTrue(test.checkNumeric("1234")),
        () -> assertTrue(test.checkNumeric("123456")));
    }

    @Test
    void checkEmployeeID() {
        assertAll(() -> assertFalse(test.checkEmployeeID("KF-1234")),
        () -> assertTrue(test.checkEmployeeID("1F-1234")),
        () -> assertTrue(test.checkEmployeeID("KF-12A4")),
        () -> assertTrue(test.checkEmployeeID("KF@1234")),
        () -> assertTrue(test.checkEmployeeID("KF-12345")),
        () -> assertTrue(test.checkEmployeeID("KF-123")));
    }
}