package com.epam.rd.autotasks.meetautocode.Program;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Controller {
    private final static int SECONDS_PER_MINUTE = 60;
    private final static int HOURS_PER_DAY = 24;
    private final Processor processor;
    private final View view;
    private final Scanner scanner = new Scanner(System.in,StandardCharsets.UTF_8.name());

    public Controller(Processor processor, View view) {
        this.processor = processor;
        this.view = view;
    }

    public void calculation() {
        int seconds = scanner.nextInt();
        seconds = Math.max(seconds, 0);
        view.printResult(processor.calculateHoursOfElectronicWatch(seconds, SECONDS_PER_MINUTE, HOURS_PER_DAY),
            processor.calculateMinutesOfElectronicWatch(seconds, SECONDS_PER_MINUTE),
            processor.calculateSecondsOfElectronicWatch(seconds, SECONDS_PER_MINUTE));
    }
}
