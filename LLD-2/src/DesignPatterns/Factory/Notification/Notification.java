package DesignPatterns.Factory.Notification;


public abstract class Notification {
    protected String message;
    protected String recipient;
    public abstract NotificationType notificationType();
    public abstract void sendNotification();
    public abstract String getRecipient();
    public abstract String getMessage();


}