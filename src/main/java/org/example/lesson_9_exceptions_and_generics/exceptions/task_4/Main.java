
package org.example.lesson_9_exceptions_and_generics.exceptions.task_4;

public class Main {
    public static void main(String[] args) {
        email("123");
        email("@");
        email("123@mail.ru");
    }

    public static void email (String email) throws StringNonCheckException{
        if (email.contains("@") && (email.contains(".ru") || email.contains(".com"))) {
            System.out.println("Всё супер!");
        } else {
            throw new StringNonCheckException("Неправильный EMAIL");
        }
    }
}
