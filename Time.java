/**
Adoga Haruna. SRN: 13000236
 */
 

/**
 *
 * @author ian
 */
/**
 *Simple Date/Time class
 */
public class Time{

    private int day;
    private int month;
    private int year;
        private int hour;
        private int minute;
        private int sec;


    /**
     *Construct new Time with day as int, month as int, year as int, hour and minutes
     * as int.  Note that this class is very basic and does not check for "impossible"
     * times.
     */
    public Time (int day, int month, int year, int hour, int minute){

        this.day = day;
        this.sec = sec;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    /**
     *Get the day of this date as an int
     */
    public int getDay(){
        return day;
    }
    /**
     *Get the month of this date as an int
     */
    public int getMonth(){
        return month;
    }
    /**
     *Get the year of this date as an int
     */
    public int getYear(){
        return year;
    }
    /**
     *Get this date as a String in the format: d-m-y
     */
    public String getDate(){
        return day+"-"+month+"-"+year+": "+getDisplayValue(hour)+":"+getDisplayValue(minute);
    }
    public String toString (){
        return getDate();

    }
    private String getDisplayValue(int value)
    {
        if(value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }

    }
    public boolean equals(Object o){
        if (o instanceof Time){
            Time other = (Time)o;
            if (day == other.getDay() && month == other.getMonth() && year == other.getYear() &&
                hour == other.getHour() && minute == other.getMinute()){
                return true;
            }
        }
            return false;
   }
}
