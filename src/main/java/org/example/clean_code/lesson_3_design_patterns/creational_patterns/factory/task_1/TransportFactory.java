package org.example.clean_code.lesson_3_design_patterns.creational_patterns.factory.task_1;

public class TransportFactory extends CreateTransport{
    @Override
    public Transport createTransport(String type) {
        return switch (type) {
            case "Car" -> new Car();
            case "Bicycle" -> new Bicycle();
            default -> throw new IllegalArgumentException("Unknown transport type");
        };
    }
}
