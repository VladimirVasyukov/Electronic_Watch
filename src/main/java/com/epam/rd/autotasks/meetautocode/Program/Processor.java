package com.epam.rd.autotasks.meetautocode.Program;

public class Processor {
    public int calculateHours(int seconds, int secondsPerMinute, int minutesPerHour, int hoursPerDay) {
        int minutesTimesHours = seconds / secondsPerMinute;
        return (minutesTimesHours / minutesPerHour) % hoursPerDay;
    }

    public int calculateMinutes(int seconds, int secondsPerMinute, int minutesPerHour) {
        int minutesTimesHours = seconds / secondsPerMinute;
        return minutesTimesHours % minutesPerHour;
    }

    public int calculateSeconds (int seconds, int secondsPerMinute) {
        return seconds % secondsPerMinute;
    }
}
