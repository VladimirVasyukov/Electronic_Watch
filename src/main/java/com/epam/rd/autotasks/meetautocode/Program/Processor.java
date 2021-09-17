package com.epam.rd.autotasks.meetautocode.Program;

public class Processor {
    public int calculateHoursOfElectronicWatch(int seconds, int secondsPerMinute, int hoursPerDay) {
        return ((seconds / secondsPerMinute) / secondsPerMinute) % hoursPerDay;

    }

    public int calculateMinutesOfElectronicWatch(int seconds, int secondsPerMinute) {
        return (seconds / secondsPerMinute) % secondsPerMinute;
    }

    public int calculateSecondsOfElectronicWatch (int seconds, int secondsPerMinute) {
        return seconds % secondsPerMinute;
    }
}
