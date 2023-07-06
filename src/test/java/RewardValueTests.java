import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
// this is added my roy
    @Test
    public void testCashToMilesConversion() {
        // Test the conversion from cash to miles
        RewardValue rewardValue = new RewardValue(1000.0);
        assertEquals(285714, rewardValue.getMilesValue());
    }

    @Test
    public void testMilesToCashConversion() {
        // Test the conversion from miles to cash
        RewardValue rewardValue = new RewardValue(100000);
        assertEquals(350.0, rewardValue.getCashValue(), 0.01);
    }

}
