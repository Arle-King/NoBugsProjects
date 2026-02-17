package org.example.lesson_14_complex_task.task_2;

import java.util.Objects;

public class UserValidator <T extends User> {
    public static boolean validationEnabled = false;
    private T user;

    //созданы 2 конструктора, чтобы можно было запустить валидацию без инициализации валидатора
    public UserValidator(T user) {
        this.user = user;
    }

    public UserValidator() {};

    public void setUser(T user) {
        this.user = user;
    }

    public boolean start() {
        try {
            if (!validationEnabled) {
                System.out.println("Валидация не включена");
                return false;
            } else if (!nameValidate() || !ageValidate() || !emailValidate()) {
                throw new InvalidUserException("Данные не прошли валидацию");
            }
            System.out.println("Всё гуд");
            return true;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    private boolean nameValidate() {
            return user.getName() != null && !Objects.equals(user.getName(), "") && user.getName().charAt(0) == user.getName().toUpperCase().charAt(0);
    }

    private boolean ageValidate() {
        return user.getAge() >= 18 && user.getAge() <= 100;
    }

    private boolean emailValidate() {
        return user.getEmail() != null && user.getEmail().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

}
