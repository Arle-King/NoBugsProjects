package org.example.clean_code.lesson_3_design_patterns.creational_patterns.builder.task_1;

import java.util.List;

public class Order {
    protected List<Product> products;
    protected double discount;
    protected String paymentMethod;

    public List<Product> getProducts() {
        return products;
    }

    public double getDiscount() {
        return discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}

class Product {
    private String name;
    private double price;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
