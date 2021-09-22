package com.epam.rd.autotasks.meetautocode.Program;

public class Processor {
    public int calculateHours(int seconds, int secondsPerMinute, int hoursPerDay) {
        int minutesTimesHours = seconds / secondsPerMinute;
        return (minutesTimesHours / secondsPerMinute) % hoursPerDay;
    }

    public int calculateMinutes(int seconds, int secondsPerMinute) {
        int minutesTimesHours = seconds / secondsPerMinute;
        return minutesTimesHours % secondsPerMinute;
    }

    public int calculateSeconds (int seconds, int secondsPerMinute) {
        return seconds % secondsPerMinute;
    }
}
