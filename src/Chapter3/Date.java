package Chapter3;

public class Date {
    private int day;
    private int month;
    private int year;
    private int hours;
    private int minutes;
    private int seconds;
    private int currentTime;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(int currentTime, int day, int month, int year){
        this.currentTime = new Date;
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
        public void setHour(int hours){
        this.hours = hours;
        }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
