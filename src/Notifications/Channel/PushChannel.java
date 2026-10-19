package Notifications.Channel;

import Model.User;
import Notifications.Interfaces.NotificationChannel;

public class PushChannel implements NotificationChannel {
    @Override
    public String name(){
        return "push";
    };

    @Override
    public void send(User user, String message){
        System.out.println("Sending Push Notification");
    }
}
