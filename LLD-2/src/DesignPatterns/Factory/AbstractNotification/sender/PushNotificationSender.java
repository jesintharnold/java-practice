package DesignPatterns.Factory.AbstractNotification.sender;

import DesignPatterns.Factory.AbstractNotification.notification.Notification;
import DesignPatterns.Factory.AbstractNotification.NotificationType;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
