package org.example.clean_code.lesson_3_design_patterns.creational_patterns.builder.task_1;

public class Main {
    public static void main(String[] args) {

        Order order = OrderBuilder.createOrderBuilder()
                .addProduct("Орехи", 15)
                .addProduct("Колбаса", 10)
                .addProduct("Доширак", 60)
                .setDiscount(15)
                .setPaymentMethod("MasterCard")
                .getOrder();


        System.out.println(order.getProducts().size());
        System.out.println(order.getDiscount());
        System.out.println(order.getPaymentMethod());
    }
}
