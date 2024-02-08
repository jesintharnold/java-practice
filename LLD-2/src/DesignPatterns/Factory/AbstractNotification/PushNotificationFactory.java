package DesignPatterns.Factory.AbstractNotification;

import DesignPatterns.Factory.AbstractNotification.notification.PushNotification;
import DesignPatterns.Factory.AbstractNotification.sender.NotificationSender;
import DesignPatterns.Factory.AbstractNotification.sender.PushNotificationSender;
import DesignPatterns.Factory.AbstractNotification.template.NotificationTemplate;
import DesignPatterns.Factory.AbstractNotification.notification.Notification;
import DesignPatterns.Factory.AbstractNotification.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory{

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient,template);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createTemplate(String message) {
        return new PushNotificationTemplate(message);
    }
}
