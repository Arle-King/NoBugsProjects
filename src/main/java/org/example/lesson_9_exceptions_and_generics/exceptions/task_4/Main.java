
package org.example.lesson_9_exceptions_and_generics.exceptions.task_4;

public class Main {
    public static void main(String[] args) {
        try {
            email("123");
        } catch (StringNonCheckException e) {
            e.printStackTrace();
        }

        try {
            email("@");
        } catch (StringNonCheckException e) {
            e.printStackTrace();
        }

        try {
            email("123@mail.ru");
        } catch (StringNonCheckException e) {
            e.printStackTrace();
        }
    }

    public static void email (String email) {
        if (email.contains("@") && (email.contains(".ru") || email.contains(".com"))) {
            System.out.println("Всё супер!");
        } else {
            throw new StringNonCheckException("Неправильный EMAIL");
        }
    }
}
