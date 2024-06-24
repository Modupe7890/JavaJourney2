package Chapter3;

public class Date {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int seconds;
    private int currentTime;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

        public void setDay(int day){
        this.day = day;
    }

        public int getDay(){
            return day;
        }
        public void setMonth(int month){
        this.month = month;
    }

        public int getMonth(){
        return month;
        }
        public void setYear(int year){
        this.year = year;
    }

        public int getYear(){
        return year;
        }
        public String displayDate() {
            return month + "/" + day + "/" + year;

        }
        public void setHour(int hour){
        this.hour = hour;
        }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }
}
