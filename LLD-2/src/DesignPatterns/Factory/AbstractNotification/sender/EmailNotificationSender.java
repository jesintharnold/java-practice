package DesignPatterns.Factory.AbstractNotification.sender;

import DesignPatterns.Factory.AbstractNotification.notification.Notification;
import DesignPatterns.Factory.AbstractNotification.NotificationType;

public class EmailNotificationSender extends NotificationSender {

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}