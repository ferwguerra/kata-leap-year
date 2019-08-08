import LeapYear.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeapYearShould {

    LeapYear leapYear = new LeapYear();

    @Test
    public void be_false_if_year_is_not_divisible_by_4() {
        assertEquals(false, leapYear.isLeapYear(1997));
    }

    @Test
    public void be_true_if_year_is_divisible_by_4() {
        assertEquals(true, leapYear.isLeapYear(1996));
    }

    @Test
    public void be_false_if_year_is_divisible_by_4_but_is_divisible_by_100() {
        assertEquals(false, leapYear.isLeapYear(1990));
    }

    @Test
    public void be_true_if_year_is_divisible_by_4_and_is_divisible_by_100_but_is_divisible_by_400() {
        assertEquals(true, leapYear.isLeapYear(2000));
    }

    @Test
    public void be_false_if_year_is_divisible_by_4_and_is_divisible_by_100_but_is_not_divisible_by_400() {
        assertEquals(false, leapYear.isLeapYear(1800));
    }

}
