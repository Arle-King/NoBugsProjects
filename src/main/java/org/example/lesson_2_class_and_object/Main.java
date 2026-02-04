package org.example.lesson_2_class_and_object;

public class Main {
    public static void main(String[] args) {

        // Car
        Car car = new Car("Toyota", 2020);
        car.setYear(2021);
        car.print();

        // Rectangle
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.calculateArea();

        rectangle.setWidth(1);
        rectangle.calculateArea();

        //Book
        Book book = new Book("Java", "Gosha");
        book.setAuthor("Gera");
        book.printInfo();

        //BankAccount
        BankAccount bankAccount = new BankAccount("Gosha", 1000);
        bankAccount.deposit(100);
        bankAccount.withdraw(1000);
        bankAccount.printBalance();

        //Point
        Point point = new Point(10, 20);
        point.print();

        point.setX(100);
        point.print();

        //StudentGroup
        StudentGroup studentGroup = new StudentGroup("Java", 10);
        studentGroup.printInfo();

        studentGroup.setStudentCount(15);
        studentGroup.printInfo();

        //Circle
        Circle circle = new Circle(10);
        circle.setRadius(100);
        circle.calculateArea();
        circle.calculateCircumference();

        //Teacher
        Teacher teacher = new Teacher("Gosha", "Java");
        teacher.printInfo();
        teacher.setSubject("Python");
        teacher.printInfo();

        //Product
        Product product = new Product("Milk", 100);
        product.applyDiscount(10);
        product.printInfo();

        //Laptop
        Laptop laptop = new Laptop("MacBook", 1000);
        laptop.setPrice(150000);
        laptop.printInfo();

    }
}
