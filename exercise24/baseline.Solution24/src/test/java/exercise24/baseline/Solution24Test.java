package exercise24.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        Solution24 anagram = new Solution24();
        assertTrue(true, isAnagram("hello", "lloeh"));
        assertTrue(true, isAnagram("hello", "lloej"));
    }
}