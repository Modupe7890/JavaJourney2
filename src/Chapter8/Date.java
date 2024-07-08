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
            throw new IllegalArgumentException("month (" + month +") must be 1 - 12");
        }
        // check if day in range for month
        if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
            throw new IllegalArgumentException("days ("+ day +") out-of-range for the specified month and year");
        }
        // check for leap year if month is 2 and day is 29
        if(month == 2 && day == 29 && !(year % 400 == 0|| (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("days (" + day + ") out-of-range for the specified month and year");
        }
    }
}
