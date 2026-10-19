package Notifications.Services;

import Model.User;
import Notifications.Interfaces.NotificationChannel;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NotificationService {

    private final Map<String, NotificationChannel> channels;

    /**
     * NotificationService constructor
     * @param channelList
     */
    public NotificationService(List<NotificationChannel> channelList) {
        this.channels = channelList.stream()
                .collect(Collectors.toMap(NotificationChannel::name, Function.identity()));
    }

    /**
     * Notify selected channel
     * @param user
     * @param message
     * @param via
     */
    public void notify(User user, String message, List<String> via) {
        for (String channelName : via) {
            NotificationChannel channel = channels.get(channelName);
            if (channel == null) {
                throw new IllegalArgumentException("Unknown channel: " + channelName);
            }
            channel.send(user, message);
        }
    }
}
