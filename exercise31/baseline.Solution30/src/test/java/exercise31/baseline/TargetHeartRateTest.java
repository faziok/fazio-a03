package exercise31.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateTest {
    TargetHeartRate test1 = new TargetHeartRate(65, 22);
    TargetHeartRate test2 = new TargetHeartRate(61, 34);

    @Test
    void targetHeartRate() {
        int[] expected1 = {138, 145, 151, 158, 165, 171, 178, 185, 191};
        int[] expected2 = {130, 136, 142, 149, 155, 161, 167, 174, 180};

        assertArrayEquals(expected1, test1.targetHeartRate());
        assertArrayEquals(expected2, test2.targetHeartRate());
    }
}