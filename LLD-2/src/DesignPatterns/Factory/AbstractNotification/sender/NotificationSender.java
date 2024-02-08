package DesignPatterns.Factory.AbstractNotification.sender;


import DesignPatterns.Factory.AbstractNotification.notification.Notification;
import DesignPatterns.Factory.AbstractNotification.NotificationType;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}