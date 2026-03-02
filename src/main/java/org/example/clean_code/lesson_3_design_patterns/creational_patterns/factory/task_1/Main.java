package org.example.clean_code.lesson_3_design_patterns.creational_patterns.factory.task_1;

public class Main {
    public static void main(String[] args) {
        CreateTransport createTransport = new TransportFactory();

        Transport transport = createTransport.createTransport("Car");
        transport.drive();
    }
}
