package exercise28.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void getTotal() {
        Solution28 add = new Solution28();

        String[] numbersArray1 = {"1", "2", "3", "4", "5"};
        String[] numbersArray2 = {"1", "1", "1", "1", "1"};
        String[] numbersArray3 = {"5", "5", "5", "5", "5"};
        String[] numbersArray4 = {"0", "0", "0", "0", "0"};
        String[] numbersArray5 = {"1", "2.5", "3.75", "4.75", "5.25"};

        assertAll(() -> assertEquals(15, add.getTotal(numbersArray1)),
        () -> assertEquals(5, add.getTotal(numbersArray2)),
        () -> assertEquals(25, add.getTotal(numbersArray3)),
        () -> assertEquals(0, add.getTotal(numbersArray4)),
        () -> assertEquals(17.25, add.getTotal(numbersArray5)));
    }

}