package org.example.clean_code.lesson_3_design_patterns.creational_patterns.builder.task_1;

import java.util.ArrayList;

public class OrderBuilder {

    private Order order;

    public OrderBuilder() {};

    public static CreateOrderBuilder createOrderBuilder() {
        return new OrderBuilder().new CreateOrderBuilder();
    }

    public class CreateOrderBuilder {

        private CreateOrderBuilder() {
            order = new Order();
            order.products = new ArrayList<>();
            order.discount = 0.0;
            order.paymentMethod = "VISA";
        }

        public CreateOrderBuilder addProduct(String name, double price) {
            order.products.add(new Product(name, price));
            return this;
        }

        public CreateOrderBuilder setDiscount(double discount) {
            order.discount = discount;
            return this;
        }

        public CreateOrderBuilder setPaymentMethod(String paymentMethod) {
            order.paymentMethod = paymentMethod;
            return this;
        }

        public Order getOrder() {
            return order;
        }
    }
}
