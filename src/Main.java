import Controller.Burger;
import Factory.BurgerFactory;
import Enum.BurgerTypeEnum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger standard = burgerFactory.createBurger(BurgerTypeEnum.STANDARD);
        Burger basic = burgerFactory.createBurger(BurgerTypeEnum.BASIC);
        standard.prepare();
        basic.prepare();
    }
}