import Controller.Factory.Burger;
import Controller.Singleton.Singleton;
import Factory.BurgerFactory;
import Enum.BurgerTypeEnum;
import Model.User;
import Notifications.Channel.EmailChannel;
import Notifications.Channel.SmsChannel;
import Notifications.Interfaces.NotificationChannel;
import Notifications.Services.NotificationService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Factory design pattern implement
         */
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger standard = burgerFactory.createBurger(BurgerTypeEnum.STANDARD);
        Burger basic = burgerFactory.createBurger(BurgerTypeEnum.BASIC);
        standard.prepare();
        basic.prepare();

        /**
         * Singleton design pattern implement
         */
        Singleton singleton = Singleton.instance();
        Singleton instance = Singleton.instance();
        System.out.println(singleton);
        System.out.println(instance);

        /**
         * Send notification to any service
         */
        List<NotificationChannel> channels = List.of(
                new EmailChannel(),
                new SmsChannel()
        );

        NotificationService notificationService = new NotificationService(channels);

        User user = new User();
        notificationService.notify(user, "Your order has shipped", List.of("email"));
    }
}