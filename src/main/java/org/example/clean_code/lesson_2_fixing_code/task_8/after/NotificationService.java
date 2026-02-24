package org.example.clean_code.lesson_2_fixing_code.task_8.after;

public class NotificationService {
    Email emailSender = new Email();
    public void sendNotification(String message) {
        emailSender.send(message);
    }
}
class Email implements Sender {
    @Override
    public void send(Object message) {
        System.out.println("Отправка email: " + message);
    }
}
