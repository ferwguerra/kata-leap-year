package LeapYear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        boolean result = false;
        if(isDivisibleBy(year, 4)) {
            if(!isDivisibleBy(year, 100)) {
                result = true;
            } else if(isDivisibleBy(year, 400)) {
                result = true;
            }
        }
        return result;
    }

    private boolean isDivisibleBy(int divident, int divider) {
        return divident % divider == 0;
    }
}
