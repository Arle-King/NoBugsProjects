package org.example.clean_code.complex_task.task_1;

import org.example.clean_code.complex_task.task_1.strategy.ShorteningStrategy;

public abstract class Factory {
    abstract public ShorteningStrategy setStrategy(String strategy);
    abstract public ShorteningStrategy getStrategy();
}
