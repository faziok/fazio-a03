package exercise36.baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    Solution36 app = new Solution36();
    List<Integer> nums = new ArrayList<>();

    public Solution36Test (){
        this.nums.add(100);
        this.nums.add(200);
        this.nums.add(1000);
        this.nums.add(300);
    }

    @Test
    void average() {
        assertEquals(400.0, app.average(nums));
    }

    @Test
    void min() {
        assertEquals(100, app.min(nums));
    }

    @Test
    void max() {
        assertEquals(1000, app.max(nums));
    }

    @Test
    void std() {
        assertEquals(408.2, app.std(nums));
    }
}