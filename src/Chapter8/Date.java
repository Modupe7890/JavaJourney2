package Chapter8;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year){
        // check if month in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month +" must be 1 - 12");
        }
    }
}
