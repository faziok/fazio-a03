package exercise24.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        Solution24 anagram = new Solution24();
        assertTrue(anagram.isAnagram("hello", "hello"));
        assertTrue(anagram.isAnagram("hello", "elloh"));
        assertTrue(anagram.isAnagram("heLlo", "Elloh"));
        assertTrue(anagram.isAnagram("hel   lo", "h ello"));
        assertTrue(anagram.isAnagram("hello one", "hello one"));
        assertFalse(anagram.isAnagram("hello", "helo"));
        assertFalse(anagram.isAnagram("hello", "eljoh"));
    }
}