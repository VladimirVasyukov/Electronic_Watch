package com.epam.rd.autotasks.meetautocode;

import com.epam.rd.autotasks.meetautocode.Program.Controller;
import com.epam.rd.autotasks.meetautocode.Program.Processor;
import com.epam.rd.autotasks.meetautocode.Program.View;

/**
 * 04_Java_Fundamentals - Vladimir Vasyukov
 * Application's entry point, use it to demonstrate code execution
 */
public class ElectronicWatch {

    public static void main(String[] args) {
        ElectronicWatch electronicWatch = new ElectronicWatch();
        electronicWatch.run();
    }

    public void run() {
        Controller controller = new Controller(new Processor(), new View());
        controller.calculation();
    }
}
