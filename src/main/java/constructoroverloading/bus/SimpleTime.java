package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getDifference(SimpleTime time) {
        return timeInMinutes() - time.timeInMinutes();
    }

    public String toString() {
        return hours + ":" + minutes;
    }

    private int timeInMinutes() {
        return 60 * hours + minutes;
    }
}
