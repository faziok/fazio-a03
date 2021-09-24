package exercise26.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator calculate1 = new PaymentCalculator(5000, 12, 100);
        PaymentCalculator calculate2 = new PaymentCalculator(3000, 5, 100);
        PaymentCalculator calculate3 = new PaymentCalculator(3000, 20, 100);
        PaymentCalculator calculate4 = new PaymentCalculator(2000, 10, 100);

        assertEquals(70, calculate1.calculateMonthsUntilPaidOff());
        assertEquals(33, calculate2.calculateMonthsUntilPaidOff());
        assertEquals(42, calculate3.calculateMonthsUntilPaidOff());
        assertEquals(22, calculate4.calculateMonthsUntilPaidOff());
    }
}