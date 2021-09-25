package com.epam.rd.autotasks.meetautocode.Program;

public class Processor {
    public int calculateHours(int seconds, int secondsPerMinute, int hoursPerDay) {
        final int MINUTES_PER_HOUR = 60;
        int minutesTimesHours = seconds / secondsPerMinute;
        return (minutesTimesHours / MINUTES_PER_HOUR) % hoursPerDay;
    }

    public int calculateMinutes(int seconds, int secondsPerMinute) {
        final int MINUTES_PER_HOUR = 60;
        int minutesTimesHours = seconds / secondsPerMinute;
        return minutesTimesHours % MINUTES_PER_HOUR;
    }

    public int calculateSeconds (int seconds, int secondsPerMinute) {
        return seconds % secondsPerMinute;
    }
}
