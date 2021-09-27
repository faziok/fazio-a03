package exercise30.baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    Solution30 table = new Solution30();

    @Test
    void multiplicationTable() {
        //Test some array locations for correct multiplication.
        int[][] arrActual;
        arrActual = table.getMultiplicationTable();

        assertEquals(1, arrActual[0][0]);
        assertEquals(144, arrActual[11][11]);
        assertEquals(12, arrActual[0][11]);
        assertEquals(12, arrActual[11][0]);
        assertEquals(36, arrActual[5][5]);
        assertEquals(56, arrActual[7][6]);
    }
}