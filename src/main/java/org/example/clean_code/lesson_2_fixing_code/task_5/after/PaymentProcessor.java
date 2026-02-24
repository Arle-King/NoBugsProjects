package org.example.clean_code.lesson_2_fixing_code.task_5.after;

public class PaymentProcessor {
    public void processPayment(Payment paymentType, double amount) {
        paymentType.pay(amount);
    }
}
