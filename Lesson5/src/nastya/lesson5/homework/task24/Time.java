package nastya.lesson5.homework.task24;

public class Time {

    int seconds;
    int minutes;
    int hours;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int timeSeconds() {
        return seconds + minutes * 60 + hours * 60 * 60;
    }
}




