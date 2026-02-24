package org.example.clean_code.lesson_2_fixing_code.task_5.after;

public class Bitcoin implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
