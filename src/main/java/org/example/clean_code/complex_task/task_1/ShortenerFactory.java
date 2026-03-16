package org.example.clean_code.complex_task.task_1;

import org.example.clean_code.complex_task.task_1.strategy.Base64Strategy;
import org.example.clean_code.complex_task.task_1.strategy.SHA256Strategy;
import org.example.clean_code.complex_task.task_1.strategy.ShorteningStrategy;
import org.example.clean_code.complex_task.task_1.strategy.UUIDStrategy;

public class ShortenerFactory extends Factory{

    private ShorteningStrategy strategy;

    public ShortenerFactory (ShorteningStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public ShorteningStrategy setStrategy(String strategy) {
        switch (strategy) {
            case "Base64" -> this.strategy = new Base64Strategy();
            case "UUID" -> this.strategy = new UUIDStrategy();
            case "SHA256" -> this.strategy = new SHA256Strategy();
            default -> throw new IllegalArgumentException("No strategy");
        };

        return this.strategy;
    }

    @Override
    public ShorteningStrategy getStrategy() {
        return this.strategy;
    }


}
