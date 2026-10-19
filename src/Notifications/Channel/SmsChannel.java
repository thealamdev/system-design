package Notifications.Channel;

import Model.User;
import Notifications.Interfaces.NotificationChannel;

public class SmsChannel implements NotificationChannel {
    @Override
    public String name() {
        return "sms";
    }

    @Override
    public void send(User user, String message) {
        System.out.println("Sending SMS");
    }
}
