package org.example.lesson_14_complex_task.task_5;

public class Product {

    private String name;
    private int price;
    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    //Тут бы хорошо переопределить equals и hashCode, но тз...
}
