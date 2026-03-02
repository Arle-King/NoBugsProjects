package org.example.clean_code.lesson_3_design_patterns.creational_patterns.singleton.task_2;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    public List<String> logs;

    private static Logger logger;

    private Logger () {
        logs = new ArrayList<>();
    };

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
