package org.example.clean_code.lesson_2_fixing_code.task_8.before;

public class NotificationService {
    private EmailSender emailSender = new EmailSender();
    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}
class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Отправка email: " + message);
    }
}
