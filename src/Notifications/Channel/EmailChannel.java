package Notifications.Channel;

import Model.User;
import Notifications.Interfaces.NotificationChannel;

public class EmailChannel implements NotificationChannel {
    @Override
    public String name() {
        return "email";
    }

    @Override
    public void send(User user, String message) {
        System.out.println("Send notification to email");
    }
}
