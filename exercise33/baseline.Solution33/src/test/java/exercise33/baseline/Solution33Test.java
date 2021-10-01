package exercise33.baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    int ranNum;
    String output;

    public Solution33Test (){
        Solution33 app = new Solution33();
        this.ranNum = app.getRandomNumber();
        this.output = app.getResponse(app.getRandomNumber());
    }

    @Test
    void getRandomNumber() {
        boolean inRange = ranNum >= 0 && ranNum < 5;

        assertTrue(inRange);
    }

    @Test
    void getResponse() {

    }
}

