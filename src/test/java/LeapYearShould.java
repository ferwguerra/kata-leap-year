import LeapYear.LeapYear;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class LeapYearShould {

    private int year;
    private boolean result;

    public LeapYearShould(int year, boolean result) {
        this.year = year;
        this.result = result;
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1997, false},
                {1996, true},
                {1992, true},
                {1900, false},
                {2000, true},
                {1800, false}
        });
    }

    LeapYear leapYear = new LeapYear();

    @Test
    public void isLeapYear() {
        assertEquals(result, leapYear.isLeapYear(year));
    }

}
