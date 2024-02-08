package DesignPatterns.Factory.Notification;

public class NotificationFactory {
    public static Notification createNotification(NotificationType notify,String msg,String recipient,String sender){
        if(notify==NotificationType.SMS){
            return new SmsNotification(recipient,msg);
        } else if (notify==NotificationType.PUSH) {
            return new PushNotification(recipient,msg);
        }else if(notify==NotificationType.EMAIL){
            return new EmailNotification(recipient,sender,msg);
        };
        return null;
    };
}
