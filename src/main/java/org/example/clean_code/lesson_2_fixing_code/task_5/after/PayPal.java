package org.example.clean_code.lesson_2_fixing_code.task_5.after;

public class PayPal implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата PayPal на сумму " + amount);
    }
}
