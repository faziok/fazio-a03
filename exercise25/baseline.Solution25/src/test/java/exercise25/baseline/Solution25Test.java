package exercise25.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        Solution25 pw = new Solution25();
        assertEquals(1, pw.passwordValidator("1234567"));
        assertEquals(2, pw.passwordValidator("abcdefg"));
        assertEquals(3, pw.passwordValidator("abcdefg1"));
        assertEquals(4, pw.passwordValidator("abcd1234!"));
        assertEquals(0, pw.passwordValidator("123456789"));
        assertEquals(0, pw.passwordValidator("123abc!"));
    }

    @Test
    void determineStrength() {
        Solution25 pw = new Solution25();
        assertEquals("a very weak", pw.determineStrength(1));
        assertEquals("a weak", pw.determineStrength(2));
        assertEquals("a strong", pw.determineStrength(3));
        assertEquals("a very strong", pw.determineStrength(4));
        assertEquals("an unknown strength", pw.determineStrength(0));
        assertEquals("an unknown strength", pw.determineStrength(8));
    }
}