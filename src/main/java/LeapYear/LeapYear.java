package LeapYear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        return isDivisibleBy(year, 4) && !(isDivisibleBy(year, 100) && !isDivisibleBy(year, 400));
    }

    private boolean isDivisibleBy(int divident, int divider) {
        return divident % divider == 0;
    }
}
