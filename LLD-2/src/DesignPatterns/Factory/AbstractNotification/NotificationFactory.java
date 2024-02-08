package DesignPatterns.Factory.AbstractNotification;


import DesignPatterns.Factory.AbstractNotification.sender.NotificationSender;
import DesignPatterns.Factory.AbstractNotification.template.NotificationTemplate;
import DesignPatterns.Factory.AbstractNotification.notification.Notification;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();
    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationSender createSender(Notification notification);
    public abstract NotificationTemplate createTemplate(String message);
}