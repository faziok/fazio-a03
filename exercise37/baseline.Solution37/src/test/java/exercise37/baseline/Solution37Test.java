package exercise37.baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    Solution37 app = new Solution37();

    int numMin = 8;
    int numLetters = 4;
    int numSpCharshars = 2;
    int numNumbers = 2;

    String shuffle = "a1R@p1t4";

    List<Character> list = Arrays.asList( 'a', '4', '@', 't', '1', 'p', '%', 'R');
    List<Character> test1 = new ArrayList<>();

    public Solution37Test () {
        this.test1.addAll(list);
    }


    @Test
    void getAndShufflePassword() {
       assertNotEquals(shuffle, app.getAndShufflePassword(test1));
    }

    @Test
    void checkMinLength() {
        assertEquals(numLetters, app.checkMinLength(numMin, numSpCharshars, numNumbers));
    }
}