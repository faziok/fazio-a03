package exercise35.baseline;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    Solution35 app  = new Solution35();

    @Test
    void winner() {
        app.names.add("Keven");
        app.names.add("Kristine");
        app.names.add("Brandon");
        app.names.add("Zach");
        app.names.add("Vail");

        Random num = new SecureRandom();
        int ranNum = num.nextInt(app.names.size());

        assertTrue(app.names.contains(app.getWinner(ranNum)));
    }
}