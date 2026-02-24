package org.example.clean_code.lesson_2_fixing_code.task_2.after;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        return price * (1 - ultimateDiscount(isLoyalCustomer, isFirstPurchase, hasCoupon));
    }

    public double ultimateDiscount(boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        if (isLoyalCustomer) return isFirstPurchase ? 0.10 : 0.05;

        return hasCoupon ? 0.07 : 0.02;
    }
}
