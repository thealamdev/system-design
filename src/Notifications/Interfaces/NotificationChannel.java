package Notifications.Interfaces;

import Model.User;

public interface NotificationChannel {
    String name();
    void send(User user, String message);
}
