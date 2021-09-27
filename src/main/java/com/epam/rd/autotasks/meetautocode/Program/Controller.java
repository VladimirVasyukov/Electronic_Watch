package com.epam.rd.autotasks.meetautocode.Program;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Controller {
    private final static int SECONDS_PER_MINUTE = 60;
    private final static int MINUTES_PER_HOUR = 60;
    private final static int HOURS_PER_DAY = 24;
    private final Processor processor;
    private final View view;
    private final Scanner scanner = new Scanner(System.in,StandardCharsets.UTF_8.name());

    public Controller(Processor processor, View view) {
        this.processor = processor;
        this.view = view;
    }

    public void calculate() {
        int seconds = scanner.nextInt();
        seconds = Math.max(seconds, 0);
        view.printResult(processor.calculateHours(seconds, SECONDS_PER_MINUTE, MINUTES_PER_HOUR, HOURS_PER_DAY),
            processor.calculateMinutes(seconds, SECONDS_PER_MINUTE, MINUTES_PER_HOUR),
            processor.calculateSeconds(seconds, SECONDS_PER_MINUTE));
    }
}
