package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;
    private String hourAndMinute;

    public SimpleTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
        if ( minute < 0 || minute > 59 ) {
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String hourAndMinute) {
        if ( hourAndMinute == null) {
            throw new InvalideTimeException("Time is null");
        }
        if (hourAndMinute.charAt(2) != ':' && hourAndMinute.length() != 5 ) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
        try {
            hour = Integer.parseInt(hourAndMinute.substring(0, 2));
        } catch (NumberFormatException nfe) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
        try {
            minute = Integer.parseInt(hourAndMinute.substring(3, 5));
        } catch (NumberFormatException nfe) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return hour+":"+minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
