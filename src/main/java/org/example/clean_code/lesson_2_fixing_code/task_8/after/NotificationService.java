package org.example.clean_code.lesson_2_fixing_code.task_8.after;

public class NotificationService {
    public void sendNotification(String message) {
        new Email(message);
    }
}
class Email implements Sender {
    public Email(String email) {
        send(email);
    }

    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
