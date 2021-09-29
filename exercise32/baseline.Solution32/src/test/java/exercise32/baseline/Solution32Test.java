package exercise32.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    Solution32 game = new Solution32();


    @Test
    void checkPlayAgain() {
        String actual1 = "y";
        String actual2 = "n";
        String actual3 = "yes";
        String actual4 = "no";

        assertTrue(game.checkPlayAgain(actual1));
        assertFalse(game.checkPlayAgain(actual2));
        assertTrue(game.checkPlayAgain(actual3));
        assertFalse(game.checkPlayAgain(actual4));
    }


    @Test
    void getRandomNumber() {
        int difficulty1 = 1;
        int difficulty2 = 2;
        int difficulty3 = 3;

        assertTrue(game.getRandomNumber(difficulty1) <= 10);
        assertFalse(game.getRandomNumber(difficulty1) > 10);
        assertTrue(game.getRandomNumber(difficulty2) <= 100);
        assertFalse(game.getRandomNumber(difficulty2) > 100);
        assertTrue(game.getRandomNumber(difficulty3) <= 1000);
        assertFalse(game.getRandomNumber(difficulty3) > 1000);
    }
}