package DesignPatterns.Factory.AbstractNotification;

import DesignPatterns.Factory.AbstractNotification.notification.EmailNotification;
import DesignPatterns.Factory.AbstractNotification.sender.EmailNotificationSender;
import DesignPatterns.Factory.AbstractNotification.sender.NotificationSender;
import DesignPatterns.Factory.AbstractNotification.template.EmailNotificationTemplate;
import DesignPatterns.Factory.AbstractNotification.template.NotificationTemplate;
import DesignPatterns.Factory.AbstractNotification.notification.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient,sender,template);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }

}
